import java.sql.*;

public class JDBC_1 {
    public static void main(String[] args) {
        try{
            // Loading Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");   // Not necessary in latest version of JDBC

            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db1";
            Connection con = DriverManager.getConnection(url,"root","123456");

            // Statement Object
            Statement stmt = con.createStatement();

            // Executing Query
            ResultSet rs1 = stmt.executeQuery("select * from t1");
//            ResultSet rs2 = stmt.executeQuery("select * from product");

            // Printing query
            while(rs1.next()){
                System.out.println(rs1.getInt(1)
                        +" "+rs1.getString(2)
                        +" "+rs1.getString(3));
//                        +" "+rs1.getInt(4));
            }
            /*while(rs2.next()){
                System.out.println(rs1.getInt(1)
                        +" "+rs1.getString(2)
                        +" "+rs1.getString(3)
                        +" "+rs1.getInt(4)
                        +" "+rs1.getInt(5)
                        +" "+rs1.getInt(6)
                        +" "+rs1.getInt(7)
                        +" "+rs1.getInt(8));
            }*/

            // Closing Connection
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
