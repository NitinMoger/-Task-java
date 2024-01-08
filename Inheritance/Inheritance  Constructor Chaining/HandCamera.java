class HandCamera extends Camera
{
	float weight;
	HandCamera()
	{
		System.out.println("no-arg const of Handcamera");
	}
	
	HandCamera(String brand,float pixel,float batteryDuration,CameraColor color,float weight)
	{
		super(brand,pixel,batteryDuration,color);
		this.weight=weight;
		System.out.println("const of String,float,float,CameraColor,float in Handcamera");

	}
}