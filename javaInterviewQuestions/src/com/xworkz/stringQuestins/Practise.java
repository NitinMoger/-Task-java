package com.xworkz.stringQuestins;

public class Practise {

    private String name;
    private  int rollNo;

    private String schoolname;

    Practise() {
        System.out.println("No argument constructor");
    }

    void showDetails(String name, int rollNo, String schoolname){

       sum(21,10);

        this.name=name;
        this.rollNo=rollNo;
        this.schoolname=schoolname;

        System.out.println("Name is:" +name);
        System.out.println("Rollno is: "+ rollNo);
        System.out.println("School Name is:" +schoolname);
    }

    int sum(int num1,int num2){
        System.out.println(num1* num2);
        return 1;
    }
    public static void main(String[] args) {

        System.out.println("Main function Running");
        Practise practise=new Practise();
        practise.showDetails("Shambhu",26,"Vidyalaxmi");

    }
}
