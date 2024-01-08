public class Tv {
    boolean display;
    Speaker speaker;

    

    Tv(boolean display,Speaker speaker)
    {
        this.display=display;
        this.speaker=speaker;
    }

    void showInfo()
    {
        System.out.println("Display is true or false:"+this.display);
        System.out.println("Tv speaker is:"+this.speaker);
        if(this.speaker!=null)
        {
        
        System.out.println("MAximum value of speaker is:"+this.speaker.maxVolume);
        }
    }
}
