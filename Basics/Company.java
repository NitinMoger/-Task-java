public class Company {
    String name="isteer";
    String gstno="23028gts67";
    String location="BTM Layout";
    Job job;

    Company(Job job)
    {
        this.job=job;
    }

    void showInfo()
    {
        System.out.println("Name of the company is:"+name);
        System.out.println("Gst number of the company:"+gstno);
        System.out.println("location of the company is:"+location);
        System.out.println("Job of the company is:"+job);
        if(job!=null)
        {
        System.out.println("role of the company is:"+this.job.role);
        System.out.println("salary of the company is:"+this.job.salary);
        System.out.println("Type of the company is:"+this.job.type);
        }
    }
    
    
}


