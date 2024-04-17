package com.xworkz.stringQuestins;

public class CompareTwoString {
    public static void main(String[] args) {

        String firstString="Nitin";
        String secondString="Shambu";
        String thirdString="Nitin";

        //compare first and third string
        boolean compareFirst= firstString.equals(thirdString);
        System.out.println("The first and third String are equal:"+compareFirst);

//        int firstNumber=25;
//        int secondNumber=25;
//
//        if (firstNumber==secondNumber){
//            System.out.println("both are same");
//        }
//        else {
//            System.out.println("oth are different");
//        }
//
//        if (firstString==thirdString){
//            System.out.println("both are same");
//        }
//        else {
//            System.out.println("oth are different");
//        }

        boolean compareSecond= firstString.equals(secondString);
        System.out.println("Comparing firstString and SecondString are same: "+compareSecond);

    }
}
