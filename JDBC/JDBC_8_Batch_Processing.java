import java.sql.*;
import java.util.Scanner;

public class JDBC_8_Batch_Processing {
    public static void main(String[] args) {
        try{
            // Establishing Connection
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");

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

                // Batch Processing
                pstmt.addBatch();
                System.out.println("Adding to batch...");

                // Getting more inputs
                System.out.println("Do you want to enter more: yes / no");
                String choice = sc.next();
                if (choice.equals("no"))    // If no then, break
                    break;
            }   // End of while loop

            // Batch Executing Query
            pstmt.executeBatch();
            System.out.println("Batch Inserted...");

            // Closing Connection
            con.close();
        }   // End of try
        catch(Exception e){
            System.out.println(e);
        }
    }   // End of main
}   // End of class
