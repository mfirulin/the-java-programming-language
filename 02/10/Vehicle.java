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

    public String toString() {
        return getClass() + "[number=" + number + 
            ",owner=" + owner +
            ",speed=" + speed + 
            ",course=" + course +
            "]";
    }

    public static long getMaxNumber() {
        return nextFreeNumber - 1;
    }
    
    public static void main(String[] args) {
        Vehicle bmv = new Vehicle("Mikhail");
        Vehicle lada = new Vehicle();
        
        System.out.println(bmv);      
        System.out.println(lada);        
        System.out.println("Max Number: " + getMaxNumber());
    }
}
