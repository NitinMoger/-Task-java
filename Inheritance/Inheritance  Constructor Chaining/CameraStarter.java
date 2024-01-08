class CameraStarter
{
	public static void main(String... any)
	{
		DigitalCamera digital=new DigitalCamera();
		DigitalCamera digital1=new DigitalCamera("Canon",50f,12f,CameraColor.BLACK);
		System.out.println("brand: "+digital1.brand);
		System.out.println("pixel: "+digital1.pixel);
		System.out.println("batteryDuration: "+digital1.batteryDuration);
		System.out.println("color: "+digital1.color);
	    System.out.println("==========================================");

		
		HandCamera hand=new HandCamera();
		HandCamera hand1=new HandCamera("sony",55f,6f,CameraColor.GRAY,2.4f);
		System.out.println("brand: "+hand1.brand);
		System.out.println("pixel: "+hand1.pixel);
		System.out.println("batteryDuration: "+hand1.batteryDuration);
		System.out.println("color: "+hand1.color);
		System.out.println("weight: "+hand1.weight);
		



	}
}