package com.xworkz.bank;

import java.awt.*;
import java.sql.*;

public class BankjdbcApplication {
    public static void main(String[] args) {
        //Step 1: load and register Driver-mysql;

        try {
            Class.forName("com.mysql.jdbc.Driver"); //fully qualified name
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("code is exicuted");
             //terminate resources
            //when finally block will not be exicuted
        }

        //Step 2: conecting to database;
        String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
        String userName="root";
        String password="Xworkzodc@123";

      /*  String insertQuery="INSERT INTO bank VALUES (1,'SBI','BTM','SBI00170','Bengaluru')";*/
        String insertQuery8="INSERT INTO bank VALUES (10,'Yes Bank','Yashwantpur','YES768589','Bengaluru')";

        try {
            //step 3:
          Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
          Statement statement =connection.createStatement();
          /*boolean result=statement.execute(insertQuery);
            System.out.println(result);*/
            boolean result1=statement.execute(insertQuery8);
            System.out.println(result1);
            System.out.println("Inserted data into bank..");
            System.out.println("Connection database is successfull!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
