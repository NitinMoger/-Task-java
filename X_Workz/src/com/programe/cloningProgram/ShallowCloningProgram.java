package com.programe.cloningProgram;

public class ShallowCloningProgram implements Cloneable{
    private String name;
    private int age;

    public ShallowCloningProgram(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default shallow copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCloningProgram ref = new ShallowCloningProgram("Alice", 30);
        // Clone the instance
        ShallowCloningProgram ref1 = (ShallowCloningProgram) ref.clone();

        // Modify the age of the cloned instance
        ref1.age = 25;

        // Output the attributes of both instances
        System.out.println("Original Values:");
        System.out.println("Name: " + ref.name);
        System.out.println("Age: " + ref.age);

        System.out.println("After cloning:");
        System.out.println("Name: " + ref1.name);
        System.out.println("Age: " + ref1.age);



    }


}
