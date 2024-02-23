package com.xworkz.mapProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarManuRunner {
    public static void main(String[] args) {
        CarDTO car1 = new CarDTO("TATA Punch", "TATA", 2022);
        CarDTO car2 = new CarDTO("Hyundai i20", "Hyundai", 2021);
        CarDTO car3 = new CarDTO("Nano", "TATA", 2023);
        CarDTO car4 = new CarDTO("Audi A8", "Audi", 2020);
        CarDTO car5 = new CarDTO("Toyota Fortuner", "Toyota", 2022);

        ManufactureDTO manufacture1 = new ManufactureDTO("TATA Company", "India",5);
        ManufactureDTO manufacture2 = new ManufactureDTO("Honda Motor Co., Ltd.", "Japan",4);
        ManufactureDTO manufacture3 = new ManufactureDTO("Tata Company", "India",4);
        ManufactureDTO manufacture4 = new ManufactureDTO("Volkswagen group", "Germany",3);
        ManufactureDTO manufacture5 = new ManufactureDTO("Toyota Company", "Japan",2);



        Map<CarDTO, ManufactureDTO> carManufacturerMap = new HashMap<>();
        carManufacturerMap.put(car1, manufacture1);
        carManufacturerMap.put(car2, manufacture2);
        carManufacturerMap.put(car3, manufacture3);
        carManufacturerMap.put(car4, manufacture4);
        carManufacturerMap.put(car5, manufacture5);


        CarDTO car6 = new CarDTO("Nano", "TATA", 2021);
        ManufactureDTO manufacturer6 = new ManufactureDTO("Tata Company", "India",2);

        System.out.println("Car6 is existing: " + carManufacturerMap.containsKey(car6));
        System.out.println();

        carManufacturerMap.put(car6, manufacturer6);

        carManufacturerMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<CarDTO, ManufactureDTO>> entrySet = carManufacturerMap.entrySet();
        for (Map.Entry<CarDTO, ManufactureDTO> entry : entrySet) {
            CarDTO key1 = entry.getKey();
            ManufactureDTO value1 = entry.getValue();
            System.out.println("Car: " + key1 + ", Manufacturer: " + value1);
        }
    }
}
