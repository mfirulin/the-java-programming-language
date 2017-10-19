interface Lookup {
    Object find(String name);
}

interface ExtendedLookup extends Lookup {
    void add(String name, Object value);
    void remove(String name);
}

public class SimpleLookup implements ExtendedLookup {
    private static final int MAX = 10;
    private String[] names = new String[MAX];
    private Object[] values = new Object[MAX];
    
    public void add(String name, Object value) {
        for (int i = 0; i < names.length; i++) 
            if (names[i] == null) {
                names[i] = name;
                values[i] = value;
                break;
            }
    }
    
    public Object find(String name) {
        for (int i = 0; i < names.length; i++)
            if (name.equals(names[i]))
                return values[i];
    
        return null;
    }
    
    public void remove(String name) {
        for (int i = 0; i < names.length; i++)
            if (name.equals(names[i])) {
                names[i] = null;
                values[i] = null;
            }
    }
    
    public static void main(String[] args) {
        SimpleLookup sl = new SimpleLookup();
        sl.add("First", new Object());
        System.out.println(sl.find("First"));
        sl.remove("First");
        System.out.println(sl.find("First"));
    }
}
