package com.xworkz.bank;

import java.sql.*;

public class BankApplicationSelectWithPreparedStatement {
    public static void main(String[] args) {

            try {
                Class.forName("com.mysql.jdbc.Driver"); /*Driver is a class*/
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String jdbcurl="jdbc:mysql://localhost:3306/bankinformation";
            String userName="root";
            String password="Xworkzodc@123";

            String selectQuery="Select * from bank where branch=? or name=?";
            Connection connection=null;
            PreparedStatement preparedStatement=null;

        try {
            connection= DriverManager.getConnection(jdbcurl,userName,password);
            preparedStatement= connection.prepareStatement(selectQuery);
            ResultSet resultSet=preparedStatement.executeQuery();

            preparedStatement.setString(2,"Kotak");
            preparedStatement.setString(3,"Electron city");

            System.out.println(resultSet.toString());
            System.out.println("The resulted data");

            if (resultSet.next()) {
          System.out.println("Bank Details>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Bank name:"+resultSet.getString("id"));
          System.out.println("Bank name:"+resultSet.getString("name"));
          System.out.println("Bank name:"+resultSet.getString("branch"));
          System.out.println("Bank name:"+resultSet.getString("ifsc"));
          System.out.println("Bank name:"+resultSet.getString("location"));
      }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
