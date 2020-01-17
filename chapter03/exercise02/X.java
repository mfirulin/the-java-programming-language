// Exercise 3.2: Type in the classes X and Y as shown previously, and add print statements to trace the
// values of the masks. Add a main method and run it to see the results. (Hint: Use the printf
// methodshown in Chapter 1with a format specifier of %x to print integers in hexadecimal format.)

class X {
    protected int xMask = 0x00ff;
    protected int fullMask;
    
    public X() {
        System.out.println("Constructor X: xMask=" + xMask + ", fullMask=" + fullMask);
        fullMask = xMask;
        System.out.println("Constructor X: xMask=" + xMask + ", fullMask=" + fullMask);
    }
    
    public int mask(int orig) {
        return (orig & fullMask);
    }
}

public class Y extends X {
    protected int yMask = 0xff00;
    
    public Y() {
        System.out.println("Constructor Y: xMask=" + xMask + ", fullMask=" + fullMask + ", yMask=" + yMask);
        fullMask |= yMask;
        System.out.println("Constructor Y: xMask=" + xMask + ", fullMask=" + fullMask + ", yMask=" + yMask);        
    }
    
    public static void main(String[] args) {
        Y y = new Y();
    }
}
