public class TvStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Starting the TvSTarter in main");
        Speaker speaker=new Speaker(100);
        Tv tv=new Tv(true,speaker);
        tv.showInfo();
        System.out.println("Ending the Tv starter in main");

    }
}
