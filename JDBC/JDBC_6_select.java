import java.sql.*;

public class JDBC_6_select {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db2";
            Connection con = DriverManager.getConnection(url,"root","123456");

            String q = "select * from t1";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(q);
            System.out.println("Executed...");

            System.out.println("Id\t\tName\t\t\t\tRollNo\t\tCity");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"
                +rs.getString(2)+"\t\t\t"
                +rs.getString(3)+"\t\t"
                +rs.getString(4));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
