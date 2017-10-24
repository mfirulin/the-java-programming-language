public class LinkedList {
    public Object obj;
    private LinkedList next;

    public String toString() {
        return getClass() + "[object=" + obj + "]";
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.obj = new Object();
        System.out.println(list);
    }
}
