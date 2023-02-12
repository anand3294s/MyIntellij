import java.sql.*;

public class Main {

    private static String dbUser, dbPassword, dbURL, sqlQuery;

    public static void main(String[] args) {

        dbUser = "root";
        dbPassword = "3Fugitive!";
        dbURL = "jdbc:mysql://localhost:3306/classicmodels";

        sqlQuery = "SELECT * FROM orders where orderNumber in (10104,10106,10108)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            System.out.println("Established connection successfully...");
            
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1)
                        System.out.print(",  ");

                    System.out.print(resultSet.getString(i));
                }
                System.out.println();
            }



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

}