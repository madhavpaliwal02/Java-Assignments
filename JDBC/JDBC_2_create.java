
import java.sql.*;

public class JDBC_2_create {
    public static void main(String[] args) {
        try{
            // Loading Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");   // Not necessary in latest version of JDBC

            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db1";
            Connection con = DriverManager.getConnection(url,"root","123456");

            if (con.isClosed())
                System.out.println("Coonection is closed");
            else
                System.out.println("Connected");

            // Statement Object

            String q = "create table t1 (id int(5) auto_increment, name varchar(40), city varchar(40), primary key(id) )";
            Statement stmt = con.createStatement();

            // Execting Query
            stmt.executeUpdate(q);
            System.out.println("Created...");

            // Closing Connection
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
