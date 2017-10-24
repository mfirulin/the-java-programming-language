public class LinkedList {
    public Object obj;
    private LinkedList next;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList head = list;

        Vehicle v = new Vehicle();
        v.speed = 60;
        v.course = 45;
        v.owner = "John";
        v.number = Vehicle.nextFreeNumber++;
        list.obj = v;

        list.next = new LinkedList();
        list = list.next;

        v = new Vehicle();
        v.speed = 62;
        v.course = 43;
        v.owner = "Helen";
        v.number = Vehicle.nextFreeNumber++;
        list.obj = v;

        list.next = new LinkedList();
        list = list.next;

        v = new Vehicle();
        v.speed = 59;
        v.course = 42;
        v.owner = "Mark";
        v.number = Vehicle.nextFreeNumber++;
        list.obj = v;

        for(list = head; list != null; list = list.next) {
            v = (Vehicle) list.obj;
            System.out.println("Vehicle: number " + v.number + 
                               ", owner " + v.owner +
                               ", speed " + v.speed + 
                               ", course " + v.course);
        }
    }
}
