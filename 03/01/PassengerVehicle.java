public class PassengerVehicle extends Vehicle {
    private int numOfPlaces;
    private int numOfFreePlaces;
    
    // Constructors
    PassengerVehicle() {
        super();
        numOfPlaces = numOfFreePlaces = 4;
    }
    
    PassengerVehicle(int n) {
        super();
        numOfFreePlaces = numOfPlaces = n;
    }
    
    PassengerVehicle(String s) {
        super(s);
        numOfFreePlaces = numOfPlaces = 4;
    }
    
    PassengerVehicle(String s, int n) {
        super(s);
        numOfFreePlaces = numOfPlaces = n;
    }

    public String toString() {
        return getClass() + "[number=" + number + 
            ",owner=" + owner +
            ",speed=" + speed + 
            ",course=" + course +
            ",number of places " + numOfPlaces +
            ",number of free places " + numOfFreePlaces +
            "]";
    }
    
    public static void main(String[] args) {
        System.out.println("Run with " + args.length + " arguments");
        for(int i = 0; i < args.length; i++) {
            PassengerVehicle pv = new PassengerVehicle(args[i], i + 2);
            System.out.println(pv);
        }
    }
}
