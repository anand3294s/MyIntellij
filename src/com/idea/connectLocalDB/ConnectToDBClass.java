package com.idea.connectLocalDB;

import java.sql.*;

public class ConnectToDBClass {
    public static String dbURL, dbUserName, dbPassword, dbQuery;

    public static void main(String[] args) {

        dbURL = "jdbc:mysql://localhost:3306/classicmodels";
        dbUserName = "root";
        dbPassword = "3Fugitive!";

        dbQuery = "SELECT * FROM orders WHERE orderNumber=10102;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectDB = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
            System.out.println("Connected to DB successfully...");

            Statement statementDB = connectDB.createStatement();

            ResultSet resultDB = statementDB.executeQuery(dbQuery);

            resultDB.next();

            String printValueNumber = resultDB.getString("customerNumber");

            System.out.println("Customer Number is: " + printValueNumber);

            String printValuestatus = resultDB.getString("status");

            System.out.println("Order Status is: " + printValuestatus);

            resultDB.close();


            statementDB.close();

            connectDB.close();

            System.out.println("closed DB connection...");


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to establish a connection...");
            throw new RuntimeException(e);
        }


    }

}
