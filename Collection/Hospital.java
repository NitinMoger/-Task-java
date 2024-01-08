package com.xworkz.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Hospital {
    private String name;

        public Hospital(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static void main(String[] args) {
            Collection<Hospital> hospitals = new ArrayList<>();

            // Adding 20 hospitals to the collection
            hospitals.add(new Hospital("Metro Hospital"));
            hospitals.add(new Hospital("Sunshine Hospital"));
            hospitals.add(new Hospital("Apollo"));
            hospitals.add(new Hospital("Mount Sinai Hospital"));
            hospitals.add(new Hospital("XYZ Hospital"));
            // Add more hospitals as needed...

            // Printing hospital names that end with 'o' (case-insensitive)
            System.out.println("Hospital names ending with 'o':");
            for (Hospital hospital : hospitals) {
                if (hospital.getName().toLowerCase().endsWith("o")) {
                    System.out.println(hospital.getName());
                }
            }
        }
    }


