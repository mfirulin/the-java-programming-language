public class Vehicle {
    private double speed;
    private short course;
    private String owner = "<ownerless>";
    private long number;
    
    private static long nextFreeNumber = 1;

    // Constructors    
    Vehicle() {
        number = nextFreeNumber++;
    }
    
    Vehicle(String o) {
        this();
        owner = o;
    }

    // Setters
    public void setSpeed(double s) {
        speed = s;
    }
    
    public void setCourse(short c) {
        course = c;
    }

    public void setOwner(String o) {
        owner = o;
    }

    // Getters
    public double getSpeed() {
        return speed;
    }

    public short getCourse() {
        return course;
    }
    
    public long getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }    
    
    public String toString() {
        return getClass() + "[number=" + number + 
            ",owner=" + owner +
            ",speed=" + speed + 
            ",course=" + course +
            "]";
    }
    
    // Static methods
    public static long getNextFreeNumber() {
        return nextFreeNumber;
    }

    public static long getMaxNumber() {
        return nextFreeNumber - 1;
    }
    
    public static void main(String[] args) {
        Vehicle bmv = new Vehicle("Mikhail");
        Vehicle lada = new Vehicle();
        
        bmv.setSpeed(100);
        bmv.setCourse((short)45);
        
        System.out.println(bmv);                          
        System.out.println(lada);        
        System.out.println("Max Number: " + getMaxNumber());
    }
}
