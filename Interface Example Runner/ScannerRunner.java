package com.Xworkz.boot;


import com.Xworkz.InterfaceExampe.Scanner;
import lombok.val;

public class ScannerRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Start the main in ScannerRunner");
        Scanner s=new Scanner("Philips","Red",3000);
        Scanner scanner = (Scanner) s.clone();
        Scanner scanner1 = (Scanner) s.clone(); //childClassName Childclassref= (ChildclassName) ChildclassRef.Parentclsname;
        Scanner scanner2= (Scanner) s.clone();
        Scanner scanner3= (Scanner) s.clone();
        System.out.println(scanner);
        System.out.println(scanner1);
        System.out.println(scanner2);
        System.out.println(scanner3);
        System.out.println("End the main in ScannerRunner");
    }
}

