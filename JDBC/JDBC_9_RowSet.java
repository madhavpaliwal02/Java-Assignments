import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.Scanner;

public class JDBC_9_RowSet {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/db2";
            JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
            jrs.setUrl(url);
            jrs.setUsername("root");
            jrs.setPassword("123456");

            String q = "select * from t1";
            jrs.setCommand(q);
            jrs.execute();
            System.out.println("Executed...");

            System.out.println("Id\t\tName\t\t\t\tRollNo\t\tCity");
            while(jrs.next()){
                System.out.println(jrs.getInt(1)+"\t\t"
                        +jrs.getString(2)+"\t\t\t"
                        +jrs.getString(3)+"\t\t"
                        +jrs.getString(4));
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
