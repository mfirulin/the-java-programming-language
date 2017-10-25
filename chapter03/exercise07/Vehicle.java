public class Vehicle {
    protected double speed;
    protected short course;
    protected String owner = "<ownerless>";
    protected int number;
    protected EnergySource gasTank, battery;
    
    protected static int nextFreeNumber = 1;

    final public static boolean TURN_LEFT = false;
    final public static boolean TURN_RIGHT = true;

    // Constructors    
    Vehicle() {
        number = nextFreeNumber++;
        gasTank = new GasTank(0);
        battery = new Battery(0);
    }
    
    Vehicle(String o) {
        this();
        owner = o;
    }

    public boolean equals(Object obj) {
        Vehicle v = (Vehicle)obj;
        return speed == v.speed && course == v.course;
    }
    
    public int hashCode() {
        return ((int)speed + course) / number;
    }

    public void stop() {
        speed = 0;
    }

    public void turn(short c) {
        course += c;
    }
    
    public void turn(boolean b) {
        if(b == true)
            course += 90;
        else
            course -= 90;
    }

    public boolean add() {
        return gasTank.empty() == 0 || battery.empty() == 0;
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

    public int getNumber() {
        return number;
    }

    public String toString() {
        String s = "Vehicle: number " + number + 
                          ", owner " + owner +
                          ", speed " + speed + 
                          ", course " + course;
        return s;
    }
    
    // Static methods
    public static int getNextFreeNumber() {
        return nextFreeNumber;
    }

    public static int getMaxNumber() {
        return nextFreeNumber - 1;
    }
    
    public static void main(String[] args) {
            Vehicle v1 = new Vehicle("Micke");
            Vehicle v2 = new Vehicle("Jane");
            System.out.println(v1);
            System.out.println(v2);
            System.out.println("Does v1 equal v2: " +  v1.equals(v2));
            v1.setSpeed(60.5);
            System.out.println(v1);
            System.out.println(v2);
            System.out.println("Does v1 equal v2: " +  v1.equals(v2));
    }
}

abstract class EnergySource {
    abstract int empty();
}

class GasTank extends EnergySource {
    private int source;
    
    GasTank(int s) {
        source = s;
    }
    
    public int empty() {
        return source;
    }
}

class Battery extends EnergySource {
    private int source;
    
    Battery(int s) {
        source = s;
    }
    
    public int empty() {
        return source;
    }
}
