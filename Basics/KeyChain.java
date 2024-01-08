public class KeyChain {
    
        String style;
        String shape;
        double cost;
        String color;
        double weight;
    
    KeyChain()
    {
        this("Tv","Rectangle",23.3,21.2,"Green");
        System.out.println("invoking the last arguments");
    
    }
    KeyChain(String style)
    {
        this.style=style;
        System.out.println("Constructor having argument of string:"+style);
    }
    KeyChain(String style,String shape)
    {
        this(style);
        this.shape=shape;
        System.out.println("Constructor having argument of String,String:"+style+","+shape);
    }
    KeyChain(String style,String shape,double cost)
    {
        this(style,shape);
        this.cost=cost;
        System.out.println("Invoking Constructors having argument of String,String,double:"+style+","+shape+","+cost);
    }
    KeyChain(String style,String shape,double cost,double weight)
    {
        this(style,shape,cost);
        this.weight=weight;
        System.out.println("Invoking Constructors having argument of String,String,double:"+style+","+shape+","+cost+","+weight);
    }
    KeyChain(String style,String shape,double cost,double weight,String color)
    {
        this(style,shape,cost,weight);
        this.color=color;
        System.out.println("Invoking Constructors having argument of String,String,double:"+style+","+shape+","+cost+","+weight+","+color);
    }
        
    }
    
    

