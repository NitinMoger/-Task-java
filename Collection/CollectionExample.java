package com.xworkz.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("C++");

        System.out.println("Original Collection: " + myCollection);
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nUsing forEach:");
        myCollection.forEach(System.out::println);
        System.out.println("\nContains 'Java': " + myCollection.contains("Java"));

        // Removing an element from the collection
        myCollection.remove("Python");
        System.out.println("\nAfter removing 'Python': " + myCollection);

        // Checking if the collection is empty
        System.out.println("\nIs collection empty? " + myCollection.isEmpty());

        // Getting the size of the collection
        System.out.println("Collection size: " + myCollection.size());

        // Clearing the collection
        myCollection.clear();
        System.out.println("\nAfter clearing the collection: " + myCollection);
    }
}
}
