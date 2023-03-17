package SerializationPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream  objectInputStream = new ObjectInputStream(new FileInputStream("encry.txt"));
        Customer c = (Customer) objectInputStream.readObject();
        System.out.println("Name is:"+c.name+"\nId:"+c.id);
    }
}
