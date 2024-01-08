class Paper
{
	String color;
	int size;
	int price;
	double width;
	double height;
	String type;
	String name;
	boolean roughness;
	boolean smoothness;
	int thickness;
	
	Paper()
	{
		System.out.println("no arguments constructor for paper");
	}
	
	Paper(String color,int size,int price,double width,double height,String type,String name,boolean roughness,boolean smoothness,int thickness)
	{
		this.color=color;
		this.size=size;
		this.price=price;
		this.width=width;
		this. height=height;
		this.type=type;
		this. name=name;
		this.roughness=roughness;
		this.smoothness=smoothness;
		this.thickness=thickness;
		System.out.println("color:"+this.color);
		System.out.println("size:"+this.size);
		System.out.println("price:"+this.price);
		System.out.println("width:"+this.width);
		System.out.println("height:"+this.height);
		System.out.println("Type:"+this.type);
		System.out.println("Name:"+this.name);
		System.out.println("roughness:"+this.roughness);
		System.out.println("smoothness:"+this.smoothness);
		System.out.println("Thickness:"+this.thickness);
		
	}
	void literature()
	{
		System.out.println("Run the literature in Paper");
	}
	void systematic()
	{
		System.out.println("Run the systematic in Paper");
	}
	void apaFormat()
	{
		System.out.println("Run the ApaFormate in Paper");
	}
	void apaStyle()
	{
		System.out.println("Run the apaStyle in Paper");
	}
	void methodsSection()
	{
		System.out.println("Run the methodsSection in Paper");
	}
	void scientificPaper()
	{
		System.out.println("Run the scientificPaper in Paper");
	}
	void write()
	{
		System.out.println("Run the write in Paper");
	}
	void read()
	{
		System.out.println("Run the Read in Paper");
	}
	void study()
	{
		System.out.println("Run the study in Paper");
	}
	void craft()
	{
		System.out.println("Run the crraft in Paper");
	}
	void design()
	{
		System.out.println("Run the design in Paper");
	}
}