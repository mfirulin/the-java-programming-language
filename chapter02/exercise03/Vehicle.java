// Exercise 2.3: Add a static field to your Vehicle class to hold the next vehicle identification number, 
// and a non-static field to the Vehicle class to hold each car's ID number.

public class Vehicle {
    public double speed;
    public short course;
    public String owner;
    public long number;
    
    public static long nextFreeNumber;
}
