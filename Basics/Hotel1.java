public class Hotel1 {
    String name;
    String ownerName;
    Menucard menucard;

    Hotel1()
    {
        System.out.println("Create a no argument construct");
    }
    Hotel1(String name,String ownerName,Menucard menucard)
    {
        this.name=name;
        this.ownerName=ownerName;
        this.menucard=menucard;
    }
    void showInfo()
    {
        System.out.println("The name of the hotel is:"+this.name);
        System.out.println("The owner name of the hotel is:"+this.ownerName);
        System.out.println("Hotel menucard is:"+this.menucard);
        if(this.menucard!=null)
        {
            System.out.println("The total items of the menucard is:"+this.menucard.totalItems);
            System.out.println("The cost items in the menucard is:"+this.menucard.cost);
        }
    }
}
