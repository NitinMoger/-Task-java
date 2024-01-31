package com.xworkz.metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MetroInformationUpdate {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl="jdbc:mysql://localhost:3306/metroinformation";
        String userName="root";
        String password="Xworkzodc@123";

        String updateQuery="UPDATE Metro set MetroFrom='Bhanashanakri' where id=2";
        String updateQuery1="UPDATE Metro set MetroTo='Kengeri' where id=1";

        try {
            Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(updateQuery);
            System.out.println(result);
            boolean result1=statement.execute(updateQuery1);
            System.out.println(result1);
            System.out.println("Updated successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

