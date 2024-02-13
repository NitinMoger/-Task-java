package com.xworkz.flightService;

import com.xworkz.flightDto.FlightBooking;
import com.xworkz.flightRepository.FlightBookingRepository;
import com.xworkz.flightRepository.FlightBookingRepositoryImpl;

import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService {
    FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();

    @Override
    public void save(FlightBooking flightBooking) {
        if (flightBooking.getFlightName().isEmpty()) {
            System.out.println("please enter valid flight name");

        } else {
            flightBookingRepository.flightTicketBookingDetails(flightBooking);
        }


    }

    @Override
    public void saveAll(List<FlightBooking> flightBookings) {
        for (FlightBooking bookings : flightBookings
        ) {
            if (bookings.getFlightName().isEmpty()) {
                System.out.println("enter valid flight name");
            }
        }

        flightBookingRepository.saveAll(flightBookings);


    }
    @Override
    public  void update(String flightName, String departure,String destination){
       if(flightName==null||flightName.isEmpty())
       {
           System.out.println("Enter Valid Name");
       }else {
           flightBookingRepository.update(flightName,departure,destination);
       }
    }

    @Override
    public List<FlightBooking> findByAll() {

      List<FlightBooking> flightBooking=flightBookingRepository.findByAll();
        return flightBooking;
    }

}
