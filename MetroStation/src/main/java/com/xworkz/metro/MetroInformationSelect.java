package com.xworkz.metro;

import java.sql.*;

public class MetroInformationSelect {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl = "jdbc:mysql://localhost:3306/metroinformation";
        String userName = "root";
        String password = "Xworkzodc@123";

        String selectQurey = "select * from Metro";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(jdbcurl, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQurey);
            System.out.println(resultSet.toString());
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("MetroFrom"));
                System.out.println(resultSet.getString("MetroTO"));
                System.out.println(resultSet.getString("MetroTimmings"));
            }
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

