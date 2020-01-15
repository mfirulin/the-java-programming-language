// Exercise 2.16: Add a method to LinkedList to return the number of elements in a list.

public class LinkedList {
    private Object obj;
    private LinkedList next;

    public Object getObject() {
        return obj;
    }
    
    public void setObject(Object o) {
        obj = o;
    }

    public String toString() {
        return getClass() + "[object=" + obj + "]";
    }

    public int getNumberOfElements() {
        int i = 0;
        for(LinkedList list = this; list != null; list = list.next)
            i++;
        return i;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList node = list;
        
        for(int i = 0; i < 5; i++) {
            node.next = new LinkedList();
            node = node.next;
        }
        
        System.out.println("Number of elements in the list: " + list.getNumberOfElements());
    }
}
