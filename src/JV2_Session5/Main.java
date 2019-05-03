package JV2_Session5;

// Buoc 1: import package
import java.sql.*;
import java.util.ResourceBundle;

public class Main {

    public static void main(String args[]){
        try{
            //Buoc 2: Thong bao driver nao muon su dung
            Class.forName("com.mysql.jdbc.Driver");

            //Buoc 3: Tao ket noi
            String URL = "jdbc:mysql://localhost:8889/t1808m";
            Connection conn = DriverManager.getConnection(URL,"t1808m","t1808m123");

            //Buoc 4: Thuc thi truy van
            Statement statement = conn.createStatement();

            String insert_sql = "INSERT INTO student (name,age,mark) " +
                    "VALUES('Nguyen xuan truong',19,2)";
            statement.executeUpdate(insert_sql);

            String sql = "SELECT* FROM student";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: "+rs.getString("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Age: "+rs.getString("age"));
                System.out.println("Mark: "+rs.getString("mark"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
