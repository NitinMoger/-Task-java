package com.xworkz.flight.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class FlightBookingDto {

    String flightName;
    String source;
    String destination;
    int price;
}
