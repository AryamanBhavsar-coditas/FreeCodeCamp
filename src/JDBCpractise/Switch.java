package JDBCpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Switch {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Operations operations = new Operations();
        boolean flag = true;

        while(flag){
            System.out.println("1.INSERT");
            System.out.println("2.SELECT");
            System.out.println("3.EXIT");
            int choice = Integer.parseInt(bf.readLine());

            switch (choice){
                case 1:
                    operations.insert();
                    break;
                case 2:
                    operations.select();
                    break;
                case 3:
                    flag=false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
