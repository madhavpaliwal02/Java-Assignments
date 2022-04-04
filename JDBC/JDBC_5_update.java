import java.sql.*;
import java.util.Scanner;

public class JDBC_5_update {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url, "root","123456");

            String q = "update t1 set name=?, rollNo=?, city=? where id=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            int id;
            String name, rollNo, city;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter id whose record has been upadting: ");
            id = sc.nextInt();
            sc.nextLine();

            // Checking whether the record exist or not
            while(true) {
                ResultSet rs = pstmt.executeQuery("selct name from t1 where id=?");
                pstmt.setInt(1, id);
                if (rs.getString(2).equals("null"))
                    break;

                System.out.println("\nEnter the new details !");
                System.out.print("\nEnter Name: ");
                name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                rollNo = sc.next();
                System.out.print("Enter City: ");
                city = sc.next();
                sc.close();

                pstmt.setString(1, name);
                pstmt.setString(2, rollNo);
                pstmt.setString(3, city);
                pstmt.setInt(4, id);

                pstmt.executeUpdate();
                System.out.println("Executed...");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
