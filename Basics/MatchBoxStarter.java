public class MatchBoxStarter {
    public static void main(String[] args)
    {
        System.out.println("Start the matchBoxStater in main");
        MatchBox matchbox=new MatchBox();
        System.out.println("Brand of the matchBox is:"+matchbox.brand);
        System.out.println("Number of stick in the match box:"+matchbox.noOfStick);
        System.out.println("length of the match box:"+matchbox.length);
        System.out.println("price of the matchbox:"+matchbox.price);
        System.out.println("Size of the match box:"+matchbox.size);
        System.out.println("Weight of the match box is:"+matchbox.weight);
        System.out.println("type of the matchbox is:"+matchbox.type);

        MatchBox matchbox1=new MatchBox("Geewin Exim");
        System.out.println("Brand of the matchBox is:"+matchbox1.brand);
        System.out.println("Number of stick in the match box:"+matchbox1.noOfStick);
        System.out.println("length of the match box:"+matchbox1.length);
        System.out.println("price of the matchbox:"+matchbox1.price);
        System.out.println("Size of the match box:"+matchbox1.size);
        System.out.println("Weight of the match box is:"+matchbox1.weight);
        System.out.println("type of the matchbox is:"+matchbox1.type);

        MatchBox matchbox2=new MatchBox(40,20);
        System.out.println("Brand of the matchBox is:"+matchbox2.brand);
        System.out.println("Number of stick in the match box:"+matchbox2.noOfStick);
        System.out.println("length of the match box:"+matchbox2.length);
        System.out.println("price of the matchbox:"+matchbox2.price);
        System.out.println("Size of the match box:"+matchbox2.size);
        System.out.println("Weight of the match box is:"+matchbox2.weight);
        System.out.println("type of the matchbox is:"+matchbox2.type);

        MatchBox matchbox3=new MatchBox("medium","wooden match Splint");
        System.out.println("Brand of the matchBox is:"+matchbox3.brand);
        System.out.println("Number of stick in the match box:"+matchbox3.noOfStick);
        System.out.println("length of the match box:"+matchbox3.length);
        System.out.println("price of the matchbox:"+matchbox3.price);
        System.out.println("Size of the match box:"+matchbox3.size);
        System.out.println("Weight of the match box is:"+matchbox3.weight);
        System.out.println("type of the matchbox is:"+matchbox3.type);

        MatchBox matchbox4=new MatchBox("SRS Bharat Exim",20,50);
        System.out.println("Brand of the matchBox is:"+matchbox4.brand);
        System.out.println("Number of stick in the match box:"+matchbox4.noOfStick);
        System.out.println("length of the match box:"+matchbox4.length);
        System.out.println("price of the matchbox:"+matchbox4.price);
        System.out.println("Size of the match box:"+matchbox4.size);
        System.out.println("Weight of the match box is:"+matchbox4.weight);
        System.out.println("type of the matchbox is:"+matchbox4.type);

        MatchBox matchbox5=new MatchBox(25,"wx Match box",0.4);
        System.out.println("Brand of the matchBox is:"+matchbox5.brand);
        System.out.println("Number of stick in the match box:"+matchbox5.noOfStick);
        System.out.println("length of the match box:"+matchbox5.length);
        System.out.println("price of the matchbox:"+matchbox5.price);
        System.out.println("Size of the match box:"+matchbox5.size);
        System.out.println("Weight of the match box is:"+matchbox5.weight);
        System.out.println("type of the matchbox is:"+matchbox5.type);
        
        MatchBox matchbox6=new MatchBox("Bilal Match group",25);
        System.out.println("Brand of the matchBox is:"+matchbox6.brand);
        System.out.println("Number of stick in the match box:"+matchbox6.noOfStick);
        System.out.println("length of the match box:"+matchbox6.length);
        System.out.println("price of the matchbox:"+matchbox6.price);
        System.out.println("Size of the match box:"+matchbox6.size);
        System.out.println("Weight of the match box is:"+matchbox6.weight);
        System.out.println("type of the matchbox is:"+matchbox6.type);

        System.out.println("End the MAtchBosStarter in the main");
    }
}
