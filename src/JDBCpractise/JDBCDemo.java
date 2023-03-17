package JDBCpractise;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        try {
            Connection connection;
            PreparedStatement preparedStatement;
            ResultSet rs;

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

            Statement statement = connection.createStatement();

//            rs = statement.executeQuery("Select * from Student");
//
//            while (rs.next()){
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//            }

            preparedStatement= connection.prepareStatement("Insert into Student values(?,?,?)");
            preparedStatement.setInt(1,300);
            preparedStatement.setString(2,"Meet");
            preparedStatement.setInt(3,98);

            preparedStatement.executeUpdate();





        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
