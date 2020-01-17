// Exercise 3.1: Starting with the Vehicle class from the exercises in Chapter 2, create an extended class
// called PassengerVehicle to add a capability for counting the number of seats available in the car and the
// number currently occupied. Provide a new main method in PassengerVehicle to create a few of these
// objects and print them out.

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
        return super.toString() + "[" +
            "number of places " + numOfPlaces +
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
