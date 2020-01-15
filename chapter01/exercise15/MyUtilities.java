// Exercise 1.16: Add fields to BadDataSetException to hold the set name and 
// the I/O exception that signaled the problem so that whoever catches the exception 
// will know details about the error.

import java.io.IOException;
import java.io.FileInputStream;

class BadDataSetException extends Exception {
    public String filename;
    public IOException exception;
    
    public BadDataSetException(String name, IOException e) {
        filename = name;
        exception = e;
    }
}

public class MyUtilities {

    public double[] getDataSet(String setName) 
        throws BadDataSetException
    {
        String file = setName + ".dset";
        FileInputStream in = null;
        
        try {
            in = new FileInputStream(file);
            return readDataSet(in);
        } catch (IOException e) {
            throw new BadDataSetException(file, e);
        } finally {
            try {
                if (in != null) 
                    in.close();
            } catch (IOException e) {
                ; // No action
            }
        }
    }
    
    private double[] readDataSet(FileInputStream in) {
        return new double[0];
    }
    
    public static void main(String []args){
        MyUtilities mu = new MyUtilities();
        try {
            mu.getDataSet("some_name");
        } catch (BadDataSetException e) {
            System.out.println(e.filename);
            System.out.println(e.exception);
        }
    }
}
