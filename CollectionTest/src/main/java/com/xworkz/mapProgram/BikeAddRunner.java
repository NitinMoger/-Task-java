package com.xworkz.mapProgram;

import java.util.*;
import java.util.stream.Collectors;

public class BikeAddRunner {

    public static void main(String[] args) {
        BikeShowRoomDTO bikeDto=new BikeShowRoomDTO("ktm", 577001);
        AddressDTO addressDto=new AddressDTO("davangere");

        BikeShowRoomDTO bikeDto1=new BikeShowRoomDTO("ktm", 577003);
        AddressDTO addressDto1=new AddressDTO("mysore");

        BikeShowRoomDTO bikeDto2=new BikeShowRoomDTO("suzuki", 577005);
        AddressDTO addressDto2=new AddressDTO("banglore");

        BikeShowRoomDTO bikeDto3=new BikeShowRoomDTO("Bmw", 577008);
        AddressDTO addressDto3=new AddressDTO("banglore");

        BikeShowRoomDTO bikeDto4=new BikeShowRoomDTO("hornet", 577009);
        AddressDTO addressDto4=new AddressDTO("hubli");

        Map<AddressDTO, BikeShowRoomDTO> bikeaddrMap=new HashMap<>();
        bikeaddrMap.put(addressDto, bikeDto);
        bikeaddrMap.put(addressDto1, bikeDto1);
        bikeaddrMap.put(addressDto2, bikeDto2);
        bikeaddrMap.put(addressDto3, bikeDto3);
        bikeaddrMap.put(addressDto4, bikeDto4);

        System.out.println("before remove");
        bikeaddrMap.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("after remove");
        bikeaddrMap.remove(addressDto);

        bikeaddrMap.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("find showroom in specific city");

        Set<AddressDTO> keySet=bikeaddrMap.keySet();

        List<AddressDTO> showrooms= keySet.stream().filter(l->l.getCity().contains("banglore")).collect(Collectors.toList());

        for(AddressDTO a:showrooms) {
            System.out.println(bikeaddrMap.get(a));
        }

        Collection<BikeShowRoomDTO> values=bikeaddrMap.values();

        System.out.println("find city with pincode");

        values.stream().map(l->l.getPincode()).filter(l->l==577003).forEach(l->System.out.println(l));


    }
}
