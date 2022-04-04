package advance.JDBC;
import java.sql.*;

public class practice {
    public static void main(String[] args) {
        try{
            // 1. Load the Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish the connection
            String url = "jdbc:mysql://localhost:3306/db1";
            Connection con = DriverManager.getConnection(url, "root", "123456");

            // 3. Prepare the Statement
            String q = "create table t3 (id int(5) auto_increment, name varchar(40), rollNo varchar(40), mobNo Bigint, primary key(id) )";
            Statement stmt = con.createStatement();

            // 4. Execute the query
            stmt.executeUpdate(q);
            System.out.println("Created...");
            /*ResultSet rs = stmt.executeQuery(q);
            while(rs.next()){
                System.out.println(rs.getInt(1)
                        +" "+rs.getString(2)
                        +" "+rs.getString(3)
                );
            }*/

            // 5. Disconnect the database
            con.close();


        } catch (Exception e){ e.printStackTrace(); }





    }
}
