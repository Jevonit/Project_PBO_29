package project_pbo_29.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQlite_Utils {
    private static final String DB_URL = "jdbc:sqlite:src/main/resources/database/userData.db";

    protected static Connection connection;

    public void getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
