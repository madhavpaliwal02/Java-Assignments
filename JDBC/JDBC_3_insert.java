
import java.sql.*;
import java.util.Scanner;

public class JDBC_3_insert {

    public static void main(String[] args) {
        try{
            // Loading Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");   // Not necessary in latest version of JDBC

            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");

            // create a query
            String q = "insert into t1 values (?,?,?,?)";

            // PreparedStatement Object
            PreparedStatement pstmt = con.prepareStatement(q);

            // set values to query
            int id,choice;
            String name, rollNo, city;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Enter id : ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                rollNo = sc.nextLine();
                System.out.print("Enter City: ");
                city = sc.nextLine();

                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setString(3,rollNo);
                pstmt.setString(4,city);

                // Execting Query
                pstmt.executeUpdate();
                System.out.println("Inserted...");

                System.out.println("Do you want to enter more: 1: Yes / 0: No");
                choice = sc.nextInt();
            }while(choice!=0);
            sc.close();

            // Closing Connection
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
