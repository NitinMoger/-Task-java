class DigitalCamera extends Camera
{
	DigitalCamera()
	{
	   System.out.println("no-arg const of digitalcamera");
	}
	
	DigitalCamera(String brand,float pixel,float batteryDuration,CameraColor color)
	{
		super(brand,pixel,batteryDuration,color);
		System.out.println("const of String,float,float,CameraColor in digitalcamera");

	}
}