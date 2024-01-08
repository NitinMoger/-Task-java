package com.xworkz.Ruler.multiple;

public class TrianglePattern {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
