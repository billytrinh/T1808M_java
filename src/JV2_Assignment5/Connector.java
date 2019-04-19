package JV2_Assignment5;
import java.sql.*;
public class Connector {

    public Connection conn;

    public Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:8889/t1808m";
            this.conn = DriverManager.getConnection(URL,"t1808m","t1808m123");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    public Integer updateQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeUpdate(sql);
    }
}
