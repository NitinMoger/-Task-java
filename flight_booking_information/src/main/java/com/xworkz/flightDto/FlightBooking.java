package com.xworkz.flightDto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FlightBooking {

    private String flightName;
    private String departure;
    private String destination;
    private int price;

}
