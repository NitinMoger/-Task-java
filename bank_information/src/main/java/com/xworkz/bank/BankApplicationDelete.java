package com.xworkz.bank;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplicationDelete {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver"); /*Driver is a class*/
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
        String userName="root";
        String password="Xworkzodc@123";

        String deleteQuery="delete from bank where name='SBI'";

        Connection connection = null;  /* this used for dlete query*/
        Statement statement = null;    /* this is also used for delete query*/

        try {
            connection = DriverManager.getConnection(jdbcurl,userName,password);  /*Connection is interface*/
           statement=connection.createStatement();     /* Statement is a interface*/
           int result=statement.executeUpdate(deleteQuery);  /*we using a int in the place of boolean*/
            System.out.println(result);
            System.out.println("Deleted Successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                statement.close();
                System.out.println("Statment closed");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
