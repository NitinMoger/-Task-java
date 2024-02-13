package com.programe.listIterator;

import javafx.beans.binding.ListExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ShoeRunner {

    public static void main(String[] args) {

        List<String> shoeBrands = new ArrayList<>();
        shoeBrands.add("Nike");
        shoeBrands.add("Adidas");
        shoeBrands.add("Puma");
        shoeBrands.add("Reebok");
        shoeBrands.add("New Balance");
        shoeBrands.add("Vans");
        shoeBrands.add("Converse");
        shoeBrands.add("Under Armour");
        shoeBrands.add("ASICS");
        shoeBrands.add("Skechers");

        ListIterator<String> forwardIterator = shoeBrands.listIterator();
        System.out.println("Forward Iteration");
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        ListIterator<String> backwardIterator = shoeBrands.listIterator(shoeBrands.size());
        System.out.println("Backward Iterator");
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous());
        }


        ListIterator<String> iterator = shoeBrands.listIterator(3);
        System.out.println("Values starting from index 3:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> iterator1 = shoeBrands.listIterator(shoeBrands.size() - 3);
        System.out.println("Values starting from index 3 considering from last value:");
        while (iterator1.hasPrevious()) {
            System.out.println(iterator1.previous());
        }

        // Sort in descending order
        Collections.sort(shoeBrands, Collections.reverseOrder());
        // Print the sorted list
        System.out.println("Shoe brands in descending order:");
        for (String brand : shoeBrands) {
            System.out.println(brand);
        }


        // Sort in descending order
        Collections.sort(shoeBrands, Collections.reverseOrder());
        // Print the sorted list using forEach method
        System.out.println("Shoe brands in descending order:");
        shoeBrands.forEach(brand -> System.out.println(brand));




//        ListIterator<String> addingElement = shoeBrands.listIterator();
//        System.out.println("Shoe brands before adding:");
//        while (addingElement.hasNext()) {
//            String brand = iterator.next();
//            System.out.println(brand);
//            if (brand.equals("Puma")) {
//                addingElement.add("Converse");
//                addingElement.add("Under Armour");
//            }
//        }
//
//        System.out.println("Shoe brands after adding elements:");
//        for (String brand : shoeBrands) {
//            System.out.println(brand);
//        }

        ListIterator<String> iterators = shoeBrands.listIterator();
        while (iterators.hasNext()) {         // Loop through the list using list iterator and add values at specific positions
            String brand = iterators.next();
            if (brand.equals("Puma")) {
                iterators.add("Converse");
                iterators.add("Under Armour");
            }
        }
        Collections.sort(shoeBrands, Collections.reverseOrder());
        // Print the sorted list
        System.out.println("Shoe brands in descending order:");
        for (String brand : shoeBrands) {
            System.out.println(brand);
        }
    }
}