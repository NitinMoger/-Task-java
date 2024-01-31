package com.xworkz.bank;

import javax.swing.*;
import java.sql.*;

public class BankApplicationInsertWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

            String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
            String userName="root";
            String password="Xworkzodc@123";

            String insertQuery="INSERT INTO bank VAlUES(?,?,?,?,?)";

        try {
           Connection connection= DriverManager.getConnection(jdbcurl,userName,password);
           PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"HDFC");
            preparedStatement.setString(3,"KR Puram");
            preparedStatement.setString(4,"HDFC009021");
            preparedStatement.setString(5,"Bengaluru");
            preparedStatement.execute();

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"KOTAK");
            preparedStatement.setString(3,"Electron city");
            preparedStatement.setString(4,"KOTAK009027");
            preparedStatement.setString(5,"Bengaluru");
            preparedStatement.execute();

            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"Axis");
            preparedStatement.setString(3,"Electron city");
            preparedStatement.setString(4,"AXIS009021");
            preparedStatement.setString(5,"Bengaluru");
            preparedStatement.execute();

           preparedStatement.setInt(1,11);
           preparedStatement.setString(2,"SBI");
           preparedStatement.setString(3,"BTM Layout");
           preparedStatement.setString(4,"SBI009021");
           preparedStatement.setString(5,"Bengaluru");
           preparedStatement.execute();

           preparedStatement.setInt(1,12);  /* 1 -5 are the column index in the table*/
           preparedStatement.setString(2,"HDFC");
           preparedStatement.setString(3,"Mico Layout");
           preparedStatement.setString(4,"HDFC009021");
           preparedStatement.setString(5,"Bengaluru");
           preparedStatement.execute();


            System.out.println("Inserted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

/* task
   create a new maven project
   create a database and table  add 5 column and 5 data
   perform Insert, delete, update ,select using interfaces
 */
