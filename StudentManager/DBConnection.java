package StudentManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

    private static final String JDBC_URL = "jdbc:h2:tcp://192.168.1.120/~/student";
    public static void main(String[] args) throws SQLException {
        DBConnection dbc = new DBConnection();
        String[] result = dbc.selectStudent();
        for (String s : result) {
            if (s != null) System.out.println(s);
        }
        
        //insertStudent("taeeun kim");
        System.out.println(getConnection());
    }

    public static boolean getConnection() {
        Connection connection = null;
        try {
           
            connection = DriverManager.getConnection(JDBC_URL, "sa", "");
            System.out.println("Database Connected");
            
        } catch (Exception e) {
            System.out.println("exception");
        }
        return (connection != null);
    }

    public String[] selectStudent() {
        String[] result = new String[100];
        try {
        Connection connection = DriverManager.getConnection(JDBC_URL, "sa", "");
        System.out.println("Database Connected");
 
        String sql = "select id, name from student";
         
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        int i = 0;

        while (rs.next()) {
            result[i] = rs.getString(1)+ "번 학생이름은 " + rs.getString(2);
            i++;
            //System.out.println(rs.getString(1) +"번 학생은 " + rs.getString(2));
        }        

        System.out.println("Selected table students.");
        connection.close();
        
        } catch(SQLException se) {
            se.printStackTrace();
        }
        return result;
     
    }

    public static void insertStudent(String userName) throws SQLException {
        Connection connection = DriverManager.getConnection(JDBC_URL, "sa", "");
        Statement statement = connection.createStatement();
        System.out.println("Database Connected.");

        String sql = "Insert into student (name) values ('" + userName + "')";
         
        int rows = statement.executeUpdate(sql);
         
        if (rows > 0) {
            System.out.println("Inserted a new row.");
        }

        connection.close();
    }
}

    