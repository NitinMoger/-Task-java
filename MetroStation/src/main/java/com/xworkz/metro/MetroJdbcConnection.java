package com.xworkz.metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MetroJdbcConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcurl="jdbc:mysql://localhost:3306/metroinformation";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="INSERT INTO Metro Values(1,'Majestic','KR puram','8am')";
        String insertQuery1="INSERT INTO Metro Values(2,'Mahadevpura','KR Market','9am')";
        String insertQuery2="insert into Metro values(3,'Marthalli','Banashankari','10am')";
        String insertQuery3="insert into Metro values(4,'BTM','Jaynagar','8pm')";
        String insertQuery4="insert into Metro values(5,'Jayanagar','Rajajinagar','2pm')";

        try {
            Connection connection = DriverManager.getConnection(jdbcurl,userName,password);
            Statement statement =connection.createStatement();
            boolean result=statement.execute(insertQuery);
            System.out.println(result);

            boolean result1=statement.execute(insertQuery1);
            System.out.println(result1);

            boolean result2=statement.execute(insertQuery2);
            System.out.println(result2);

            boolean result3=statement.execute(insertQuery3);
            System.out.println(result3);

            boolean result4=statement.execute(insertQuery4);
            System.out.println(result4);

            System.out.println("Inserted Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
