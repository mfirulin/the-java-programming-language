public class Vehicle {
    private double speed;
    private short course;
    private String owner = "<ownerless>";
    private long number;
    
    private static long nextFreeNumber = 1;

    public static final int TURN_LEFT = 0;
    public static final int TURN_RIGHT = 1;

    // Constructors    
    Vehicle() {
        number = nextFreeNumber++;
    }
    
    Vehicle(String owner) {
        this();
        this.owner = owner;
    }

    // Get, Set
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public short getCourse() {
        return course;
    }

    public void setCourse(short course) {
        this.course = course;
    }

    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
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

    public void turn(short course) {
        this.course += course;
    }
    
    public void turn(int direction) {
        if(direction == TURN_LEFT)
            course -= 90;
        else if (direction == TURN_RIGHT)
            course += 90;
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
        bmv.turn((short)57);
        System.out.println(bmv);
        bmv.turn(TURN_LEFT);           
        System.out.println(bmv);
    }
}
