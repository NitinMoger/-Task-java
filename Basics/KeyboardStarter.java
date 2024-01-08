class KeyboardStarter {
    public static void main(String[] args)
    {
        System.out.println("Keyboard starter is started");
        Keyboard keyboard=new Keyboard();
        System.out.println("Brand of the keyboard:"+keyboard.brand);
        System.out.println("Color of the keyboard:"+keyboard.color);
        System.out.println("Number Of keys in keyboard:"+keyboard.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard.type);
        System.out.println("Cost of the keyboard:"+keyboard.cost);
        Keyboard keyboard1=new Keyboard("white");
        System.out.println("Brand of the keyboard:"+keyboard1.brand);
        System.out.println("Color of the keyboard:"+keyboard1.color);
        System.out.println("Number Of keys in keyboard:"+keyboard1.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard1.type);
        System.out.println("Cost of the keyboard:"+keyboard1.cost);
        System.out.println("Keyboard starter is ended");
        Keyboard keyboard2=new Keyboard("Red","Numerical Keyboard");
        System.out.println("Brand of the keyboard:"+keyboard2.brand);
        System.out.println("Color of the keyboard:"+keyboard2.color);
        System.out.println("Number Of keys in keyboard:"+keyboard2.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard2.type);
        System.out.println("Cost of the keyboard:"+keyboard2.cost);
        System.out.println("Keyboard starter is ended");
        Keyboard keyboard3=new Keyboard(1250,"logiTech",62);
        System.out.println("Brand of the keyboard:"+keyboard3.brand);
        System.out.println("Color of the keyboard:"+keyboard3.color);
        System.out.println("Number Of keys in keyboard:"+keyboard3.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard3.type);
        System.out.println("Cost of the keyboard:"+keyboard3.cost);
        Keyboard keyboard4=new Keyboard(800,104);
        System.out.println("Brand of the keyboard:"+keyboard4.brand);
        System.out.println("Color of the keyboard:"+keyboard4.color);
        System.out.println("Number Of keys in keyboard:"+keyboard4.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard4.type);
        System.out.println("Cost of the keyboard:"+keyboard4.cost);
        Keyboard keyboard5=new Keyboard(650,"Dell",101,"Gaming Keypad","Black");
        System.out.println("Brand of the keyboard:"+keyboard5.brand);
        System.out.println("Color of the keyboard:"+keyboard5.color);
        System.out.println("Number Of keys in keyboard:"+keyboard5.noOfKeys);
        System.out.println("Type of the keyboard:"+keyboard5.type);
        System.out.println("Cost of the keyboard:"+keyboard5.cost);
        System.out.println("Keyboard starter is ended");
    }
}
