public class HotelStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Start the HotelStarter in main");
        Menucard menucard=new Menucard();
        menucard.setMenucard(20,230);
        Hotel1 hotel=new Hotel1("Fizza Hut","Asis",menucard);
        hotel.showInfo();
        System.out.println("Ending the HotelStarter in main");
    }
}
