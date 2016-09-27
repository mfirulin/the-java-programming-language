public class LinkedList {
    public Object obj;
    private LinkedList next;
    
    public static void main(String[] args) {
        int i;
        final int MAX = 5;
        LinkedList list = new LinkedList();
        LinkedList l = list;
        
        for(i = 0; i < MAX; ++i) {
            Vehicle v = new Vehicle();
            l.obj = v;
            l.next = new LinkedList();
            l = l.next;
        }
        
        for(i = 0, l = list; l != null; l = l.next)
            ++i;
        System.out.println(i);
    }
}
