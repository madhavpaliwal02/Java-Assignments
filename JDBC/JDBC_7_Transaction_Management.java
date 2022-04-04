import java.sql.*;
import java.util.Scanner;

public class JDBC_7_Transaction_Management {
    public static void main(String[] args) {
        try{
            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");
            con.setAutoCommit(false);

            // create a query
            String q = "insert into t1 values (?,?,?,?)";

            // PreparedStatement Object
            PreparedStatement pstmt = con.prepareStatement(q);

            // set values to query
            int id;
            String name, rollNo, city;
            Scanner sc = new Scanner(System.in);
            while(true){
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

                // Commit / Rollback
                System.out.println("Commit / RollBack");
                String tm = sc.nextLine();
                if (tm.equals("commit"))
                    con.commit();
                if (tm.equals("rollback"))
                    con.rollback();

                // Getting more inputs
                System.out.println("Do you want to enter more: Yes / No");
                String choice = sc.next();
                if (choice.equals("no"))    // If no then, break
                    break;
            }

            sc.close();     // Closing Scanner
            con.commit();   // Commiting finally
            System.out.println("Commited");

            // Closing Connection
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
