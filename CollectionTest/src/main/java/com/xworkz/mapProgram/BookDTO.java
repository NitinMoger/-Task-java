package com.xworkz.mapProgram;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private int year;
    private double rating;
    private String author;
    private double price;

}
