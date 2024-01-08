public class DocterStarter {
    

    public static void main(String[] hospital)
    {
        System.out.println("Start the docter Starter in main");
        Docter docter=new Docter();
        Clinic clinic=new Clinic("Psychaitry",25,59,docter);
      
        docter.name="Jayadev";
        docter.exp=8;
        docter.fake=false;
        docter.fees=200;
        clinic.showInfo();

        System.out.println("Ending the docter starter in main");
    }
}
