public class PassengerVehicle extends Vehicle implements Cloneable {
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

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return "PassengerVehicle: number " + number + 
                          ", owner " + owner +
                          ", speed " + speed + 
                          ", course " + course +
                          ", Number of Places " + numOfPlaces +
                          ", Number of Free Places " + numOfFreePlaces;
    }
    
    public static void main(String[] args) {
        PassengerVehicle pv1 = new PassengerVehicle("Micke", 4);
        PassengerVehicle pv2 = (PassengerVehicle)pv1.clone();
        System.out.println(pv1);
        System.out.println(pv2);
        pv2.setOwner("Jane");
        System.out.println(pv1);
        System.out.println(pv2);
    }
}
