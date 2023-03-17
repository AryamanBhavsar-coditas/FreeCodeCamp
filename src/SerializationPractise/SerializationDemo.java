package SerializationPractise;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Customer c = new Customer(100,"Aryaman");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("encry.txt"));
        objectOutputStream.writeObject(c);
        System.out.println("Serialization Done!!");

    }
}
