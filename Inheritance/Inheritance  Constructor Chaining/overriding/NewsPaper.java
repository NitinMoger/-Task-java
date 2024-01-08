class NewsPaper extends Paper
{
	String newsName;
	String newColor;
	NewsPaper()
	{
		System.out.println("no arguments contructor of NewsPaper");
	}
	
	NewsPaper(String color,int size,int price,double width,double height,String type,String name,boolean roughness,boolean smoothness,int thickness)
	{
		super(color,size,price,width,height,type,name,roughness,smoothness,thickness);
		
	}
	void art()
	{
		System.out.println("run the art in NewsPaper");
	}
	void reuse(String newsName,String newColor)
	{
		System.out.println("Run the reuse in NewsPaper");
		this.newsName=newsName;
		this.newColor=newColor;
		System.out.println("News Name;"+this.newsName);
		System.out.println("Color of the newsPaper:"+this.newColor);
	}
	void cut()
	{
		System.out.println("Run the cutting in Newspaper");
	}
	
	@Override
	void read()
	{
		System.out.println("Read the NewsPaper ");
	}
	@Override
	void write()
	{
		System.out.println("Write the News in NewsPaper ");
	}
	@Override
	void study()
	{
		System.out.println("study the NewsPaper for knowlegde purpose ");
	}
	@Override
	void literature()
	{
		System.out.println("literature in the NewsPaper ");
	}
}