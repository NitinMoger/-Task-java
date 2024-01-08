public class Clinic {
    

    String specialization;
    int totalBeds;
    int totalPatient;
    Docter docter;

    Clinic(String specialization,int totalBeds,int totalPatient,Docter docter)
    {
        this.specialization=specialization;
        this.totalBeds=totalBeds;
        this.totalPatient=totalPatient;
        this.docter=docter;

    }
    void showInfo()
    {
        System.out.println("Clinic Specialization:"+this.specialization);
        System.out.println("Clinic totalBeds:"+this.totalBeds);
        System.out.println("Clinic patient:"+this.totalPatient);
        System.out.println("Clinic docter:"+this.docter);
        if(docter!=null)
        {
            System.out.println("Name of the docter:"+this.docter.name);
            System.out.println("Exp of the docter:"+this.docter.exp);
            System.out.println("docter is fake:"+this.docter.fake);
            System.out.println("docter fees is:"+this.docter.fees);
        }

    }
}
