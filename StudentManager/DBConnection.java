package StudentManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    private static final String JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
    public static void main(String[] args) throws SQLException {
        List<String> result = selectStudent();
        for (String s : result) {
            System.out.println(s);
        }
        
        //insertStudent("taeeun kim");
        System.out.println(getConnection());
    }

    public static boolean getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(JDBC_URL, "sa", "");
        System.out.println("Database Connected");
        if (connection != null) {
            return true;
        }
        return false;
    }
    public static List<String> selectStudent() throws SQLException {
        List<String> result = new ArrayList<>();
        Connection connection = DriverManager.getConnection(JDBC_URL, "sa", "");
    
        System.out.println("Database Connected");
 
        String sql = "select id, name from students";
         
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            result.add(rs.getString(1)+ "번 학생이름은 " + rs.getString(2));
        
            //System.out.println(rs.getString(1) +"번 학생은 " + rs.getString(2));
        }        

        System.out.println("Selected table students.");
        
        connection.close();
        return result;
     
    }

    public static void insertStudent(String userName) throws SQLException {
        Connection connection = DriverManager.getConnection(JDBC_URL, "sa", "");
        Statement statement = connection.createStatement();
        System.out.println("Database Connected.");

        String sql = "Insert into students (name) values ('" + userName + "')";
         
        int rows = statement.executeUpdate(sql);
         
        if (rows > 0) {
            System.out.println("Inserted a new row.");
        }

        connection.close();
    }
}

    