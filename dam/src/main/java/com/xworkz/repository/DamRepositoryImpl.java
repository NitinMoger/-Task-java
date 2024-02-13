package com.xworkz.repository;

import com.xworkz.dto.DamDto;

import java.awt.image.RescaleOp;
import java.sql.*;

public class DamRepositoryImpl implements DamRepository {


    @Override
    public void save(DamDto damDto) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String jdbcurl="jdbc:mysql://localhost:3306/reservior";
        String userName="root";
        String password="Xworkzodc@123";

        String insertQuery="Insert into dam (name,place,state,height) values (?,?,?,?)";

        try {
            connection = DriverManager.getConnection(jdbcurl,userName,password);
            preparedStatement =connection.prepareStatement(insertQuery);
           preparedStatement.setString(1,damDto.getName());
           preparedStatement.setString(2,damDto.getPlace());
           preparedStatement.setString(3, damDto.getState());
           preparedStatement.setInt(4, damDto.getHeight());
           preparedStatement.execute();
            System.out.println("Inserted Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void update(String name, String place, String state, int height) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updateQuery = "Update dam set name=?, place=? where state=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, place);
            preparedStatement.setString(3, state);
            preparedStatement.executeUpdate();
            System.out.println("updated successfully!!!!!!!!!!!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DamDto select(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String selectQuery = "select * from dam where name=?";
        DamDto damDto=null;

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, name);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next())
            {
                damDto=new DamDto();
                System.out.println(resultSet.getString("place"));
                System.out.println((resultSet.getInt("height")));
                damDto.setName(resultSet.getString("name"));
                damDto.setPlace(resultSet.getString("place"));
                damDto.setState(resultSet.getString("state"));
                damDto.setHeight(resultSet.getInt("height"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return damDto;
    }
}
