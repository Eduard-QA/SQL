import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueriesSQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/classicmodels";
        String username = "root";
        String password = "Password123@";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM customers";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                System.out.println("id: " + resultSet.getInt("customerNumber")
                        + "  ||  Name: " + resultSet.getString("customerName"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

