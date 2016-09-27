public class Vehicle {
    private double speed;
    private short course;
    private String owner;
    private long number;
    
    public static long nextFreeNumber;
    
    public static void main(String[] args) {
        Vehicle bmv = new Vehicle();
        Vehicle lada = new Vehicle();
        
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
