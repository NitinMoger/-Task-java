class Person{
  String name;
  Email[] email;

  Person(String name,Email[] email)
  {
    this.name=name;
    this.email=email;
  }
  void showInfo()
  {
    System.out.println("ShowInfo metod is starter");
    System.out.println("The person information");
    System.out.println("Name:"+this.name);
    System.out.println("Email:"+this.email);
    if(this.email!=null)
    {
       System.out.println("The length is:"+this.email.length);
       for(int index=0;index<this.email.length;index++)
       {
        System.out.println("Email information");
        Email email=this.email[index];
        System.out.println("email:"+this.email);
        email.showInfo();
       }
    }
    System.out.println("ShowInfo metod is ended");

  }

}