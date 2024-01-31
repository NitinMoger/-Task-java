package com.xworkz.flight.service;

import com.xworkz.flight.dto.FlightBookingDto;
import com.xworkz.flight.repository.FlightBookingRepository;
import com.xworkz.flight.repository.FlightBookingRepositoryImpl;

public class FlightBookingServiceImpl implements FlightBookingService{
FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();

    @Override
    public void save(FlightBookingDto flightBookingDto) {
        if(flightBookingDto.getFlightName().isEmpty())
        {
            System.out.println("Please Enter Flight Name");
        }
        else {
            flightBookingRepository.save(flightBookingDto);
        }
    }
}
