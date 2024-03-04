package com.xworkz.mapProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRunner {
    public static void main(String[] args) {

        BookDTO bookDTO=new BookDTO(2000,4.5,"Sports",250.0);
        BookDTO bookDTO1=new BookDTO(2002,3.5,"Comedy",350.0);
        BookDTO bookDTO2=new BookDTO(2003,5.5,"Sad",150.0);
        BookDTO bookDTO3=new BookDTO(2004,2.5,"Life Story",550.0);
        BookDTO bookDTO4=new BookDTO(2005,4.5,"Sports",150.0);
        BookDTO bookDTO5=new BookDTO(2002,3.5,"Comedy",450.0);

        List<BookDTO> bookDTOS=new ArrayList<>();
        bookDTOS.add(bookDTO);
        bookDTOS.add(bookDTO1);
        bookDTOS.add(bookDTO2);
        bookDTOS.add(bookDTO3);
        bookDTOS.add(bookDTO4);
        bookDTOS.add(bookDTO5);

        bookDTOS.forEach(r-> System.out.println(r));

        System.out.println("The Year Range Between 2002 to 2005");
        bookDTOS.stream().filter(l->l.getYear()>2002 && l.getYear()<2005).forEach(r-> System.out.println(r));

        System.out.println("Total number of books");
        System.out.println(bookDTOS.stream().filter(l->l.getAuthor()=="Life Story").count());

        System.out.println("Highest Rating books");
        System.out.println(bookDTOS.stream().max((p1,p2)->Double.compare(p1.getRating(), p2.getRating())));



        System.out.println("Total Price Of All Books");
        List<Double> price=bookDTOS.stream().map(l->l.getPrice()).collect(Collectors.toList());
        double sum=0;
        for(double i:price)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
