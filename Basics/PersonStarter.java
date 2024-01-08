class PersonStarter{

public static void main(String[] args)
{
	System.out.println("Starting the main in PersonStarter");
	Email[] emailArray=new Email[3];
	emailArray[0]=new Email("gmail.com",121,"Nitin","Moger");
	emailArray[1]=new Email("Titan.com",111,"Veekshita","Moger");
	emailArray[2]=new Email("outlook.com",123,"Shambhu","churchigundi");
	Person person=new Person("Veekshita Moger",emailArray);
	person.showInfo();
    
	System.out.println("Ending the main in PersonStarter");
}
}