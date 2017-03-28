package db;


import java.sql.*;

public class Database {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost/userInformation";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASS = "postgre";
    private static Connection conn = null;


    private void createConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String sql) {
        if (conn == null)

            createConnection();

        System.out.println("Creating statement...");

        ResultSet rs = null;
        try {

            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean execute(String sql) {
        boolean result = false;
        try {
            if (conn == null)
                createConnection();

            System.out.println("Executing query : " + sql);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean update(String sql) {
        boolean result = false;
        try {
            if (conn == null)
                createConnection();
            System.out.println("Executing query : " + sql);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deleteById(String sql) {
        boolean result = false;
        try {
            if (conn == null)
                createConnection();
            System.out.println("Executing query : " + sql);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}




 


