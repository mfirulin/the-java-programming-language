// Exercise 2.15: Add a changeSpeed method that changes the current speed of the vehicle to a passed-in
// value and add a stop method that sets the speed to zero.

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

    // Get, Set
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double s) {
        speed = s;
    }
    
    public short getCourse() {
        return course;
    }
    
    public void setCourse(short c) {
        course = c;
    }

    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String o) {
        owner = o;
    }

    public long getNumber() {
        return number;
    }

    public void changeSpeed(double s) {
        speed += s;
    }
    
    public void stop() {
        speed = 0;
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
        
        System.out.println(bmv);
        bmv.setSpeed(50);
        bmv.changeSpeed(5);
        System.out.println(bmv);
    }
}
