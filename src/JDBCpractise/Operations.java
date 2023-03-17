package JDBCpractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Operations {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public void insert() throws IOException, ClassNotFoundException, SQLException {

        System.out.println("Enter ID:");
        int id = Integer.parseInt(bf.readLine());
        System.out.println("Enter Name:");
        String name = bf.readLine();
        System.out.println("Enter MArks:");
        int marks = Integer.parseInt(bf.readLine());

        Connection connection;
        PreparedStatement ps;
        ResultSet rs;

        connection = Connectivity.Create();

        ps = connection.prepareStatement("insert into student values(?,?,?);");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,marks);

        ps.executeUpdate();

        System.out.println("Added Sucessfully!");

    }

    public void select() throws ClassNotFoundException, SQLException {
//        Connection connection;
//        Statement s;
//        ResultSet rs;
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

        Connection connection = Connectivity.Create();
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery("select * from student");

        while(rs.next()){
            System.out.println("ID:"+rs.getInt(1)+"   NAME:"+rs.getString(2)+"   DIVISION:"+rs.getString(3));
        }
    }
}
