class Tent{

    int slNo;
    double width;
    double height;
    Color color;
    boolean open;

    public Tent(int slNo, double width, double height, Color color) {
        this.slNo = slNo;
        this.width = width;
        this.height = height;
        this.color = color;
        this.open = false;
    }

    public boolean open() 
	{
        return true;
    }

    public boolean close() 
	{
        return false;
        
    }

    public void showInfo() {
        System.out.println("Serial No: " + slNo);
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
        System.out.println("Color: " + color.name());
        System.out.println("Tent is " +open());
    }
}
