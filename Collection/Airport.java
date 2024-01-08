package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airport {
    public static void main(String[] args) {
        Collection<String> airportNames= new ArrayList<>();
        airportNames.add("John F. Kennedy International Airport");
        airportNames.add("Heathrow Airport");
        airportNames.add("Changi Airport");
        airportNames.add("Los Angeles International Airport");
        airportNames.add("Dubai International Airport");
        airportNames.add("Beijing Capital International Airport");
        airportNames.add("O'Hare International Airport");
        airportNames.add("Tokyo Haneda Airport");
        airportNames.add("Hartsfield-Jackson Atlanta International Airport");
        airportNames.add("Frankfurt Airport");
        airportNames.add("Hong Kong International Airport");
        airportNames.add("Denver International Airport");
        airportNames.add("Singapore Changi Airport");
        airportNames.add("Incheon International Airport");
        airportNames.add("Amsterdam Schiphol Airport");
        airportNames.add("Dallas/Fort Worth International Airport");
        airportNames.add("Shanghai Pudong International Airport");
        airportNames.add("Charles de Gaulle Airport");
        airportNames.add("Suvarnabhumi Airport");
        airportNames.add("San Francisco International Airport");
        airportNames.add("Indira Gandhi International Airport");
        airportNames.add("Denver International Airport");
        airportNames.add("Munich Airport");
        airportNames.add("Toronto Pearson International Airport");
        airportNames.add("Seattle-Tacoma International Airport");
        airportNames.add("Guangzhou Baiyun International Airport");
        airportNames.add("Miami International Airport");
        airportNames.add("Sydney Airport");
        airportNames.add("Zurich Airport");
        airportNames.add("Kuala Lumpur International Airport");
        airportNames.add("Rome Fiumicino Airport");
        airportNames.add("Ben Gurion Airport");
        airportNames.add("Barcelona–El Prat Airport");
        airportNames.add("San Diego International Airport");
        airportNames.add("Vienna International Airport");
        airportNames.add("Manchester Airport");
        airportNames.add("Dublin Airport");
        airportNames.add("Osaka Kansai International Airport");
        airportNames.add("Stockholm Arlanda Airport");
        airportNames.add("Phoenix Sky Harbor International Airport");
        airportNames.add("Vancouver International Airport");
        airportNames.add("Copenhagen Airport");
        airportNames.add("Brussels Airport");
        airportNames.add("Abu Dhabi International Airport");
        airportNames.add("Lisbon Portela Airport");
        airportNames.add("Orlando International Airport");
        airportNames.add("Kansai International Airport");
        airportNames.add("Melbourne Airport");
        airportNames.add("Athens International Airport");
        airportNames.add("Brisbane Airport");
        airportNames.add("Jomo Kenyatta International Airport");
        airportNames.add("Tampa International Airport");
        airportNames.add("Bengaluru Kempegowda International Airport");
        airportNames.add("Singapore Changi Airport");
        airportNames.add("Incheon International Airport");
        airportNames.add("Amsterdam Schiphol Airport");
        airportNames.add("Dallas/Fort Worth International Airport");
        airportNames.add("Shanghai Pudong International Airport");
        airportNames.add("Charles de Gaulle Airport");
        airportNames.add("Suvarnabhumi Airport");
        airportNames.add("San Francisco International Airport");
        airportNames.add("Indira Gandhi International Airport");
        airportNames.add("Denver International Airport");
        airportNames.add("Munich Airport");
        airportNames.add("Toronto Pearson International Airport");
        airportNames.add("Seattle-Tacoma International Airport");
        airportNames.add("Guangzhou Baiyun International Airport");
        airportNames.add("Miami International Airport");
        airportNames.add("Sydney Airport");
        airportNames.add("Zurich Airport");
        airportNames.add("Kuala Lumpur International Airport");
        airportNames.add("Rome Fiumicino Airport");
        airportNames.add("Ben Gurion Airport");
        airportNames.add("Barcelona–El Prat Airport");
        airportNames.add("San Diego International Airport");
        airportNames.add("Vienna International Airport");
        airportNames.add("Manchester Airport");
        airportNames.add("Dublin Airport");
        airportNames.add("Osaka Kansai International Airport");
        airportNames.add("Stockholm Arlanda Airport");
        airportNames.add("Phoenix Sky Harbor International Airport");
        airportNames.add("Vancouver International Airport");
        airportNames.add("Copenhagen Airport");
        airportNames.add("Brussels Airport");
        airportNames.add("Abu Dhabi International Airport");
        airportNames.add("Lisbon Portela Airport");
        airportNames.add("Orlando International Airport");
        airportNames.add("Kansai International Airport");
        airportNames.add("Melbourne Airport");
        Iterator<String> ref= airportNames.iterator();
        while(ref.hasNext())
        {
            String val= ref.next();
            System.out.println("The AirportName is: " + val.toUpperCase());
        }

    }
}
