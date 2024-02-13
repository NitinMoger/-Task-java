package com.xworkz.flightRepository;

import com.xworkz.flightDto.FlightBooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingRepositoryImpl implements FlightBookingRepository {

    @Override
    public void flightTicketBookingDetails(FlightBooking flightBooking) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/ticketsystem";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "INSERT into flightticket(Flight_name,source,destination,price) values(?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, flightBooking.getFlightName());
            preparedStatement.setString(2, flightBooking.getDeparture());
            preparedStatement.setString(3, flightBooking.getDestination());
            preparedStatement.setInt(4, flightBooking.getPrice());

            preparedStatement.execute();
            System.out.println("values inserted successfully!!!!!!!!!!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
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
    public void saveAll(List<FlightBooking> flightBookings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/ticketsystem";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "INSERT into flightticket(Flight_name,source,Destination,price) values(?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            preparedStatement = connection.prepareStatement(insertQuery);
            for (FlightBooking flightBooking : flightBookings
            ) {
                preparedStatement.setString(1, flightBooking.getFlightName());
                preparedStatement.setString(2, flightBooking.getDeparture());
                preparedStatement.setString(3, flightBooking.getDestination());
                preparedStatement.setInt(4, flightBooking.getPrice());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
//
//
    @Override
    public void update(String flightName, String departure, String destination) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/ticketsystem";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updateQuery = "Update flightticket set destination=?, source=? where flight_name=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, destination);
            preparedStatement.setString(2, departure);
            preparedStatement.setString(3, flightName);
            preparedStatement.execute();
            System.out.println("updated successfully!!!!!!!!!!!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<FlightBooking> findByAll() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
        String userName="root";
        String password="Xworkzodc@123";
        String query="select * from flightticket";
        List<FlightBooking> list=new ArrayList<>();

        try {
            Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next())
            {
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString("source"));
                FlightBooking flightBooking=new FlightBooking();
                flightBooking.setFlightName(resultSet.getString("flight_Name"));
                flightBooking.setDeparture(resultSet.getString("source"));
                flightBooking.setDestination(resultSet.getString("destination"));
                flightBooking.setPrice(resultSet.getInt("price"));
                list.add(flightBooking);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}





