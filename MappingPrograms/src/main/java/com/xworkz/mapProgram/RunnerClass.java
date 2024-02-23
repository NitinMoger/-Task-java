package com.xworkz.mapProgram;

import java.util.*;

public class RunnerClass {
    public static void main(String[] args) {

        PersonDTO personDTO = new PersonDTO("Nitin", "nitin@gmail.com");
        PersonDTO personDTO1 = new PersonDTO("Shambhu", "shambhu6364@gmail.com");
        PersonDTO personDTO2 = new PersonDTO("Kiran", "kiran.k@gmail.com");
        PersonDTO personDTO3 = new PersonDTO("Nitin", "nitin@gmail.com");
        PersonDTO personDTO4 = new PersonDTO("Madhu", "madhu@gmail.com");


        AddressDTO addressDTO = new AddressDTO(101, 581320, "JpNagar");
        AddressDTO addressDTO1 = new AddressDTO(102, 560320, "JpNagar");
        AddressDTO addressDTO2 = new AddressDTO(103, 543520, "JpNagar");
        AddressDTO addressDTO3 = new AddressDTO(104, 560076, "JpNagar");
        AddressDTO addressDTO4 = new AddressDTO(105, 581323, "JpNagar");


        Map<PersonDTO,AddressDTO> person = new HashMap<>();
        person.put(personDTO,addressDTO);
        person.put(personDTO2,addressDTO2);
        person.put(personDTO3,addressDTO3);
        person.put(personDTO4,addressDTO4);
        person.put(personDTO1,addressDTO1);



        PersonDTO personDTO5 = new PersonDTO("Madhu","madhu@gmail.com");
        AddressDTO addressDTO5= new AddressDTO(64738777,637786,"Majestic");

        System.out.println("Person6 is existing: " +person.containsKey(personDTO5));
        System.out.println();
        person.put(personDTO5,addressDTO5);

        person.forEach((k,v)-> System.out.println(k +" : "+v));

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<PersonDTO,AddressDTO>> entrySet = person.entrySet();
        for (Map.Entry<PersonDTO,AddressDTO> entry : entrySet){
            PersonDTO key1 = entry.getKey();
            AddressDTO value1 = entry.getValue();
            System.out.println("Person: " + key1 + ", Address: " + value1);
        }

    }
}