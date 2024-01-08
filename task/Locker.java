package com.xworkz.task;

public class Locker {

    double price;
    String color;
    String type;

    public Locker(double price,String color,String type)
    {
        this.price=price;
        this.color=color;
        this.type=type;


    }
    public String tostring(){
        return ("Price of the locker:"+this.price+" "+ "Color of the Locker:"+this.color+" "+"Type of the locker:"+this.type);
    }
}
 class Cotton
{
    double price;
    int quantity;
    String color;

    Cotton(double price,int quantity,String color)
    {
        this.price=price;
        this.quantity=quantity;
        this.color=color;
    }
    public String tostring(){
        return ("Price of the cotton:"+this.price+" "+ "quantity of the Cotton:"+this.quantity+" "+"Color of the Cotton:"+this.color);
    }
}

class Mic
{
    int maxVolume;
    int minVolume;
    double cost;

    Mic(int maxVolume,int minVolume,double cost)
    {
        this.maxVolume=maxVolume;
        this.minVolume=minVolume;
        this.cost=cost;

    }
    public String tostring(){
        return ("MaxVolume of the mic:"+this.maxVolume+" "+ "minVolume of the mic:"+this.minVolume+" "+"cost of the mic:"+this.cost);
    }
}
class Heart
{
    String donator_name;
    String color;
    String bloodPressure;

    Heart(String donator_name,String color,String bloodPressure)
    {
        this.donator_name=donator_name;
        this.color=color;
        this.bloodPressure=bloodPressure;
    }
    public String tostring(){
        return ("Donator name:"+this.donator_name+" "+ "color:"+this.color+" "+"blood pressure:"+this.bloodPressure);
    }

}

class Chain
{
    String type;
    double cost;
    String design;

    Chain(String type, double cost,String design)
    {
        this.type=type;
        this.cost=cost;
        this.design=design;
    }
    public String tostring(){
        return ("type of chain:"+this.type+" "+ "cost of the chain:"+this.cost+" "+"design of the chain:"+this.design);
    }
}

class Rice
{
    String brand;
    int quantity;
    String quality;

    Rice(String brand, int quantity,String quality)
    {
        this.brand=brand;
        this.quantity=quantity;
        this.quality=quality;
    }
    public String tostring(){
        return ("Brand:"+this.brand+" "+ "quantity:"+this.quantity+" "+"quality:"+this.quality);
    }

}
class Bucket
{
    int capacity;
    String brand;
    double price;

    Bucket(int capacity,String brand,double price)
    {
        this.capacity=capacity;
        this.brand=brand;
        this.price=price;
    }
    public String tostring(){
        return ("Capacity of the bucket:"+this.capacity+" "+ "brand of the bucket:"+this.brand+" "+"Price of the bucket:"+this.price);
    }
}
class Bowl
{
    int capacity;
    String brand;
    double price;

    public Bowl(int capacity,String brand,double price)
    {
        this.capacity=capacity;
        this.brand=brand;
        this.price=price;
    }
    public String tostring(){
        return ("Capacity of the bowl:"+this.capacity+" "+ "brand of the bowl:"+this.brand+" "+"Price of the bowl:"+this.price);
    }
}

class Spoon
{
    int capacity;
    String brand;
    double price;

    public Spoon(int capacity,String brand,double price)
    {
        this.capacity=capacity;
        this.brand=brand;
        this.price=price;
    }
    public String tostring(){
        return ("Capacity of the Spoon:"+this.capacity+" "+ "brand of the Spoon:"+this.brand+" "+"Price of the Spoon:"+this.price);
    }
}

class Geycer
{
    int capacity;
    String brand;
    double price;

    public Geycer(int capacity,String brand,double price)
    {
        this.capacity=capacity;
        this.brand=brand;
        this.price=price;
    }
    public String tostring(){
        return ("Capacity of the Geycer:"+this.capacity+" "+ "brand of the Geycer:"+this.brand+" "+"Price of the Geycer:"+this.price);
    }

}

class Money
{
    String country_name;
    String amountName;
    String type;

    public Money(String country_name,String amountName,String  type)
    {
        this.country_name=country_name;
        this.amountName=amountName;
        this.type=type;
    }
    public String tostring(){
        return ("country name:"+this.country_name+" "+ "amountName of the money:"+this.amountName+" "+"Type of the money:"+this.type);
    }

}