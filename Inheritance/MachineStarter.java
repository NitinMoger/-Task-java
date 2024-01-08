class MachineStarter
{
	public static void main(String... args)
	{
		System.out.println("Start the main in MachineStarter");
		Machine machine=new Generator();
		machine.setName();
		
		Generator gen=(Generator)machine;
		gen.type();
		gen.setName();
		
		
		System.out.println("End the main in MAchineSTarter");
	}
}