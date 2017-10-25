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
