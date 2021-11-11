package serializeexample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {

    public static void main(String args[]) {

        Serializer serializer = new Serializer();
        Address add = new Address();
        add.setStreet("Wall Street");
        add.setCountry("London");
        //System.out.println(add);
        //serializer.serializeAddress(add);
        Address address = new Address();
        address.setStreet("54, Inner Circular Road");
        address.setCountry("Bangladesh");
        //call to serialize the object
        serializer.serializeAddress(add);
    }

    public void serializeAddress(Address ad) {
        try {
            FileOutputStream fout = new FileOutputStream("d:\\address.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(ad);
            oos.close();
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
