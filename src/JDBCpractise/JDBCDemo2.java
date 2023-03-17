package JDBCpractise;

import java.sql.*;

public class JDBCDemo2 {
    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        PreparedStatement preparedStatement;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

            preparedStatement = connection.prepareStatement("insert into Student values()");
            rs = preparedStatement.executeQuery();
//            statement = connection.createStatement();
//
//            rs = statement.executeQuery("select * from Student");
//
//            while(rs.next()){
//                System.out.println("  "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//            }




        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
