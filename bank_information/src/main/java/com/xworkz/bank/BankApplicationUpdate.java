package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplicationUpdate {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
        String userName="root";
        String password="Xworkzodc@123";

        String updateQuery="UPDATE bank set branch='Bhanashanakri' where name='SBI'";
        String updateQuery1="UPDATE bank set branch='Bengaluru' where id=2";

        try {
            Connection connection=DriverManager.getConnection(jdbcurl,userName,password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(updateQuery);
            System.out.println(result);
            boolean result1=statement.execute(updateQuery1);
            System.out.println(result1);
            System.out.println("Updated suc cessfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
