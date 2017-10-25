public class Vehicle {
    protected double speed;
    protected short course;
    protected String owner = "<ownerless>";
    protected long number;
    protected EnergySource gasTank, battery;
    
    protected static long nextFreeNumber = 1;

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

    public long getNumber() {
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
    public static long getNextFreeNumber() {
        return nextFreeNumber;
    }

    public static long getMaxNumber() {
        return nextFreeNumber - 1;
    }
    
    public static void main(String[] args) {
        System.out.println("Run with " + args.length + " arguments");
        for(int i = 0; i < args.length; i++) {
            Vehicle v = new Vehicle(args[i]);
            System.out.println(v);
            System.out.println("Is Gas Tank or Battery empty: " + v.add());
        }
    }
/*
    for(String s: args) {
        Vehicle v = new Vehicle(s);
        System.out.println(v);
    }   
*/
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
