public class CompanyStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Start the Company Starter in main");
        Job job=new Job();
        Company company=new Company(job);
        company.showInfo();
        System.out.println("End the company starter in main");

    }
}
