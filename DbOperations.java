package db;

import java.sql.*;

public class DbOperations {
    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost/userInformation";

    //  Database credentials
    private static final String USER = "postgres";
    private static final String PASS = "postgre";

    private Connection conn = null;

    private void createConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String sql){
        if(conn == null)
            createConnection();

        ResultSet rs = null;
        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
