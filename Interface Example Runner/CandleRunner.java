package com.Xworkz.boot;
import com.Xworkz.InterfaceExampe.Candle;
public class CandleRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Candle candle=new Candle("Warming",12.1,45,"Lamp");
        Candle candle1=(Candle)candle.clone();
        Candle candle2=(Candle)candle.clone();
        Candle candle3=(Candle)candle.clone();
        Candle candle4=(Candle)candle.clone();
        System.out.println(candle1);
        System.out.println(candle2);
        System.out.println(candle3);
        System.out.println(candle4);
    }
}
