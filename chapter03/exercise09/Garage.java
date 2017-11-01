public class Garage implements Cloneable {
    private Vehicle[] items;
    private int numberOfFreePlaces;
    
    public Garage(int n) {
        items = new Vehicle[n];
    }
    
    public void in(Vehicle v) {
        if(numberOfFreePlaces < items.length) {
            items[numberOfFreePlaces++] = v;
        }
        else {
            System.out.println("Cannot put a new vehicle to the garage, not enough free space");
        }
    }

    public Vehicle out(int number) {
        Vehicle v = null;
        for(int i = 0; i < items.length; ++i) {
            if(number == items[i].number) {
                v = items[i];
                items[i] = null;
                --numberOfFreePlaces;
                break;
            }
        }
        return v;
    }
    
    public Object clone() {
        try {
            Garage g = (Garage)super.clone();
            g.items = (Vehicle[])items.clone();
            for(int i = 0; i < items.length; ++i) {
                g.items[i] = (Vehicle)items[i].clone();
            }
            return g;
        } 
        catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
    
    public static void main(String[] args) {
        Garage g1 = new Garage(2);
        g1.in(new Vehicle("Micke"));
        g1.in(new Vehicle("Jane"));
        g1.in(new Vehicle("Ksenia"));
        
        Garage g2 = (Garage)g1.clone();
        g2.items[1].setOwner("Ksenia");
        
        System.out.println(g1.items[0].getOwner());    
        System.out.println(g1.items[1].getOwner());    
        System.out.println(g2.items[0].getOwner());
        System.out.println(g2.items[1].getOwner());
    }
}
