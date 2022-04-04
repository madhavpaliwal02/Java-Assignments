import java.io.FileInputStream;
import java.sql.*;

public class JDBC_4_insert_image {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");

            String q = "insert into images(pic) values (?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("D:\\Images\\Me\\pic.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("Executed...");

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
