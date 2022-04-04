import java.sql.*;

class JDBC_10 {

public static void main(String[] args) {
        try{
            // Loading Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");   // Not necessary in latest version of JDBC

            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");

            // create a query
            String q = "insert into t1 values (40,'Madhav Paliwal','IT-2K19-27','Agar Malwa')";

            // Statement Object
            Statement stmt = con.createStatement();

                // Execting Query
                stmt.executeUpdate(q);
                System.out.println("Inserted...");

            // Closing Connection
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
