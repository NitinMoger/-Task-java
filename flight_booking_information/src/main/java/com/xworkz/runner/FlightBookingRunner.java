package com.xworkz.runner;

import com.xworkz.flightDto.FlightBooking;
import com.xworkz.flightRepository.FlightBookingRepository;
import com.xworkz.flightRepository.FlightBookingRepositoryImpl;
import com.xworkz.flightService.FlightBookingService;
import com.xworkz.flightService.FlightBookingServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingRunner {
    public static void main(String[] args) {
        FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();
//       FlightBooking flightBooking= new FlightBooking("air india","Bengaluru","Goa",2000);
//       flightBookingRepository.flightTicketBookingDetails(flightBooking);
//       flightBookingService.save(flightBooking);

        FlightBookingService flightBookingService=new FlightBookingServiceImpl();
        FlightBooking flightBooking1=new FlightBooking("air asia","KIA","dehli",1000);
        FlightBooking flightBooking2=new FlightBooking("indigo","KIA","chennai",6000);
        FlightBooking flightBooking3=new FlightBooking("Qatar","KIA","doha",25000);

         List<FlightBooking> list=new ArrayList<>();
         list.add(flightBooking2);
         list.add(flightBooking3);
 //      flightBookingService.saveAll(list);


//       flightBookingService.update("Indigo","Bengaluru","Goa");

        List<FlightBooking> flightBookings=flightBookingService.findByAll();
        flightBookings.forEach(flightBooking -> {
            System.out.println(flightBooking.getFlightName());
            System.out.println((flightBooking.getDeparture()));
            System.out.println((flightBooking.getDestination()));
            System.out.println(flightBooking.getPrice());
        });



        }


    }

