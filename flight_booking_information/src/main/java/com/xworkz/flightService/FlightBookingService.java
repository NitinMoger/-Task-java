package com.xworkz.flightService;

import com.xworkz.flightDto.FlightBooking;

import java.util.List;

public interface FlightBookingService {
    public void save(FlightBooking flightBooking);
     public void saveAll(List<FlightBooking> flightBookings);
    public void update(String flightName, String departure,String destination);

    public List<FlightBooking> findByAll();

}
