package com.xworkz.flight.repository;

import com.xworkz.flight.dto.FlightBookingDto;

import java.sql.*;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{

    @Override
    public void save(FlightBookingDto flightBookingDto) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="xworkz@123";

        String insertQuery="insert into flightticket(flight_name, source,destination,price) values(?,?,?,?)";


        try {
           Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, flightBookingDto.getFlightName());
            preparedStatement.setString(2, flightBookingDto.getSource());
            preparedStatement.setString(3, flightBookingDto.getDestination());
            preparedStatement.setInt(4,flightBookingDto.getPrice());
            preparedStatement.execute();
            System.out.println("Inserted Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
