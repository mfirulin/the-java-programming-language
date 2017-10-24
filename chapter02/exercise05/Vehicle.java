public class Vehicle {
    public double speed;
    public short course;
    public String owner;
    public long number;

    public static long nextFreeNumber;

    public static void main(String[] args) {
        Vehicle bmv = new Vehicle();
        bmv.speed = 60;
        bmv.course = 45;
        bmv.owner = "John";
        bmv.number = nextFreeNumber++;

        Vehicle lada = new Vehicle();
        lada.speed = 50;
        lada.course = 34;
        lada.owner = "Helen";
        lada.number = nextFreeNumber++;  

        System.out.println("Vehicle 1: number " + bmv.number + 
                           ", owner " + bmv.owner +
                           ", speed " + bmv.speed + 
                           ", course " + bmv.course);
                           
        System.out.println("Vehicle 2: number " + lada.number + 
                           ", owner " + lada.owner +
                           ", speed " + lada.speed + 
                           ", course " + lada.course);        
    }
}
