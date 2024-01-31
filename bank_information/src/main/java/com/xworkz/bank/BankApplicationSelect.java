package com.xworkz.bank;

import java.sql.*;

public class BankApplicationSelect {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
        String userName="root";
        String password="Xworkzodc@123";

        String selectQurey="select * from bank";
        Connection connection=null;

        try {
            connection=DriverManager.getConnection(jdbcurl,userName,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(selectQurey);
            System.out.println(resultSet.toString());
            while (resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("branch"));
                System.out.println(resultSet.getString("ifsc"));
                System.out.println(resultSet.getString("location"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
