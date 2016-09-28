public class Vehicle {
    private double speed;
    private short course;
    private String owner = "<ownerless>";
    private long number;

    public static long nextFreeNumber = 1;

    Vehicle() {
        number = nextFreeNumber++;
    }


    Vehicle(String o) {
        this();
        owner = o;
    }

    public static long getMaxNumber() {
        return nextFreeNumber - 1;
    }

    public static void main(String[] args) {
        Vehicle bmv = new Vehicle("Михаил Фирулин");
        Vehicle lada = new Vehicle();

        System.out.println("Vehicle: number " + bmv.number + 
                           ", owner " + bmv.owner +
                           ", speed " + bmv.speed + 
                           ", course " + bmv.course);
                           
        System.out.println("Vehicle: number " + lada.number + 
                           ", owner " + lada.owner +
                           ", speed " + lada.speed + 
                           ", course " + lada.course);        

        System.out.println("Max Number: " + getMaxNumber());
    }
}
