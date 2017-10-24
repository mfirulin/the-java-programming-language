public class LinkedList {
    private Object obj;
    private LinkedList next;

    public Object getObject() {
        return obj;
    }
  
    public LinkedList getNext() {
  		return next;
    }
    
    public void setObject(Object o) {
        obj = o;
    }
  
    public void setNext(LinkedList l) {
    	next = l;
    }

    public String toString() {
        return getClass() + "[object=" + obj + "]";
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.setObject(new Object());
        System.out.println(list);
        System.out.println(list.getObject());
        list.setNext(new LinkedList());
        System.out.println(list.getNext());
    }
}
