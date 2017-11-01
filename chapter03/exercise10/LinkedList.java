public class LinkedList implements Cloneable {
    
    /* Members */
    class Node {
        private Object obj;
        private Node next;
    }
       
    private Node list;
    private Node lastNode; // lastNode == list == null by default
    private int numOfNodes;   
 
    /* Methods */
    public Object clone() {
        try {
            LinkedList ll = (LinkedList)super.clone();
            ll.list = null;
            Node n = null;
            Node nt = null;
            for(Node l = list; l != null; l = l.next) {
                n = new Node();
                n.obj = l.obj;
                if(ll.list == null) {
                    ll.list = nt = n;
                }
                else {
                    nt.next = n;
                    nt = nt.next;
                }
            }
            ll.lastNode = n;
            return ll;
        }
        catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
    
    public void addElem(Object o) {
        Node n = new Node();
        if(list == null) { // Add first elem
            lastNode = list = n;
        }
        else {
            lastNode.next = n;
            lastNode = n;
        }
        numOfNodes++;
        lastNode.obj = o;
    }
     
    public int getNumberOfElements() {
        return numOfNodes;
    }
    
    private Node getList() {
        return list;
    }
 
    public String toString() {
        String s = "The object of the class \"LinkedList\"";
        return s;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Vehicle v;
        System.out.println(list);
        
        for(int i = 0; i < 5; i++) {
            String s = "Owner" + i;
            v = new Vehicle(s);
            list.addElem(v);
        }
        System.out.println("Number of elements of list: " + list.getNumberOfElements());
        
        for(Node n = list.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            System.out.println(v);
        }
        
        LinkedList list2 = (LinkedList)list.clone();
        System.out.println("Number of elements of list2: " + list2.getNumberOfElements());
        for(Node n = list2.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            System.out.println(v);
        }
        System.out.println("Change first list");
        for(Node n = list.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            v.setOwner("Micke");
            System.out.println(v);
        }
        System.out.println("Print second list");
        for(Node n = list2.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            System.out.println(v);
        }
        System.out.println("Add new object to first list");
        v = new Vehicle("Jane");
        list.addElem(v);
        for(Node n = list.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            System.out.println(v);
        }
        System.out.println("Print second list");
        for(Node n = list2.getList(); n != null; n = n.next) {
            v = (Vehicle)n.obj;
            System.out.println(v);
        }
        System.out.println(list.getList());
        System.out.println(list2.getList());
    }
}
