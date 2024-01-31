package com.xworkz.flight.runner;

import com.xworkz.flight.dto.FlightBookingDto;
import com.xworkz.flight.repository.FlightBookingRepository;
import com.xworkz.flight.repository.FlightBookingRepositoryImpl;
import com.xworkz.flight.service.FlightBookingService;
import com.xworkz.flight.service.FlightBookingServiceImpl;

public class FlightBookingRunner {
    public static void main(String[] args) {

       FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();

       FlightBookingDto flightBookingDto=new FlightBookingDto("Air India","Bengaluru","Goa",4500);
       FlightBookingService flightBookingService=new FlightBookingServiceImpl();
       flightBookingService.save(flightBookingDto);

    }
}