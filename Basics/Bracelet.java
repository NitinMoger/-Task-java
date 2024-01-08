public class Bracelet {
    
    String name;
    String shape;
    double cost;
    String purity;
    double weight;

Bracelet()
{
    this("Vistara","oval",23.3,21.2,"23karat");
    System.out.println("invoking the last arguments");

}
Bracelet(String name)
{
    this.name=name;
    System.out.println("Constructor having argument of string:"+name);
}
Bracelet(String name,String shape)
{
    this(name);
    this.shape=shape;
    System.out.println("Constructor having argument of String,String:"+name+","+shape);
}
Bracelet(String name,String shape,double cost)
{
    this(name,shape);
    this.cost=cost;
    System.out.println("Invoking Constructors having argument of String,String,double:"+name+","+shape+","+cost);
}
Bracelet(String name,String shape,double cost,double weight)
{
    this(name,shape,cost);
    this.weight=weight;
    System.out.println("Invoking Constructors having argument of String,String,double:"+name+","+shape+","+cost+","+weight);
}
Bracelet(String name,String shape,double cost,double weight,String purity)
{
    this(name,shape,cost,weight);
    this.purity=purity;
    System.out.println("Invoking Constructors having argument of String,String,double:"+name+","+shape+","+cost+","+weight+","+purity);
}
    
}
