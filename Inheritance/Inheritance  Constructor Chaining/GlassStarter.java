class GlassStarter
{
	public static void main(String[] any)
	{
		LaminatedGlass laminated=new LaminatedGlass(); //no argument con...
		LaminatedGlass laminated1=new LaminatedGlass("Saint-Gobain","Mirrors",2.1f,1.8f,GlassType.STANDARD_LENSES,999d,2); //parametrised con...
		System.out.println("Brand: "+laminated1.brand);
		System.out.println("Usage: "+laminated1.usage);
		System.out.println("Length: "+laminated1.length);
		System.out.println("Thickness: "+laminated1.thickness);
		System.out.println("Type: "+laminated1.type);
		System.out.println("Cost: "+laminated1.cost);
		System.out.println("Warranty: "+laminated1.warranty);
		
		ToughendGlass toughend=new ToughendGlass();
		ToughendGlass toughend1=new ToughendGlass("Waterford Crystal","jewelry holders",2.1f,1.8f,GlassType.PRIME_LENSES,0.8f,"ANAND");
		System.out.println("Brand: "+toughend1.brand);
		System.out.println("Usage: "+toughend1.usage);
		System.out.println("Length: "+toughend1.length);
		System.out.println("Thickness: "+toughend1.thickness);
		System.out.println("Type: "+toughend1.type);
		System.out.println("Weight: "+toughend1.weight);
		System.out.println("OwnerName: "+toughend1.ownerName);
		
		TintedGlass tinted=new TintedGlass();
		TintedGlass tinted1=new TintedGlass("Pyrex","Doors",2.1f,1.8f,GlassType.PRIME_LENSES,0.8f,"NITIN");
		System.out.println("Brand: "+tinted1.brand);
		System.out.println("Usage: "+tinted1.usage);
		System.out.println("Length: "+tinted1.length);
		System.out.println("Thickness: "+tinted1.thickness);
		System.out.println("Type: "+tinted1.type);
		System.out.println("Weight: "+tinted1.weight);
		System.out.println("OwnerName: "+tinted1.ownerName);
		
		GorillaGlass gorilla=new GorillaGlass();
		GorillaGlass gorilla1=new GorillaGlass("AGC.in","Electronic Materials Business",2.1f,1.8f,GlassType.STANDARD_LENSES,999d,2);
		System.out.println("Brand: "+gorilla1.brand);
		System.out.println("Usage: "+gorilla1.usage);
		System.out.println("Length: "+gorilla1.length);
		System.out.println("Thickness: "+gorilla1.thickness);
		System.out.println("Type: "+gorilla1.type);
		System.out.println("Cost: "+gorilla1.cost);
		System.out.println("Warranty: "+gorilla1.warranty);
		
		
	}
}