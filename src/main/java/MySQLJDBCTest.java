import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class MySQLJDBCTest {

    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUsername(),
                Config.getPassword()
        );
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("Connection Successful");
            Statement statement = connection.createStatement();
            String queryString = "SELECT * FROM albums;";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null) {
                System.out.println("Statement executed successfully.");
                while (results.next()) {
                    System.out.println(results.getString("name") + " - " + results.getString("artist"));
                }
                System.out.println("No more results");
            } else {
                System.out.println("Statement exploded.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
