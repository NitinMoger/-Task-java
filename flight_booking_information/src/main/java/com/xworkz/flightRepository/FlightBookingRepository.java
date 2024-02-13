package com.xworkz.flightRepository;

import com.xworkz.flightDto.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {

   public void flightTicketBookingDetails(FlightBooking flightBooking);


  public void saveAll(List<FlightBooking> flightBookings);
  public void update(String flightName, String departure,String destination);
 public List<FlightBooking> findByAll();


}
