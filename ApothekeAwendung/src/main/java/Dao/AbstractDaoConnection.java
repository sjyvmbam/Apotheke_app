package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDaoConnection {

    public Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/apotheke?user=???&password=??";
            conn = DriverManager.getConnection(url);
            System.out.println("connected");
            return conn;
            // Statement myStmt= conn.createStatement();
            //ResultSet myRs= myStmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //public abstract void test();
}
