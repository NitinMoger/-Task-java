class LaptopStarter{
	
	public static void main(String[] lap){
		
		System.out.println("Starting main in LaptopStarter");
		
		City cities=new City();
		cities.name="Banglore";
		cities.stateName="Karnataka";
		
		City cities1=new City();
		cities1.name="New Delhi";
		cities1.stateName="Delhi";
		
		City cities2=new City();
		cities2.name="Panaji";
		cities2.stateName="Goa";
		
		City cities3=new City();
		cities3.name="Karnal";
		cities3.stateName="Hariyana";
		
		City cities4=new City();
		cities4.name="Thiruvananthapuram";
		cities4.stateName="Kerala";
		
		City cities5=new City();
		cities5.name="Bhatkal";
		cities5.stateName="Karnataka";
		
		City[] citiesArray={cities,cities1,cities2,cities3,cities4,cities5};
		
		Brand brand=new Brand();
		brand.setCities(citiesArray);
		
		Hardware hardware=new Hardware();
		hardware.setBrand(brand);
		hardware.setName("Keyboard");
		hardware.setType("Input");
		
		Hardware hardware1=new Hardware();
		hardware1.setBrand(brand);
		hardware1.setName("ROM");
		hardware1.setType("Internal Device");
		
		Hardware hardware2=new Hardware();
		hardware2.setBrand(brand);
		hardware2.setName("Keyboard");
		hardware2.setType("Input");
		
		Hardware hardware3=new Hardware();
		hardware3.setBrand(brand);
		hardware3.setName("Mouse");
		hardware3.setType("Cursor");
		
		Hardware hardware4=new Hardware();
		hardware4.setBrand(brand);
		hardware4.setName("CPU");
		hardware4.setType("brain");
		
		Hardware hardware5=new Hardware();
		hardware5.setBrand(brand);
		hardware5.setName("Monitor");
		hardware5.setType("Display");
		
		Hardware hardware6=new Hardware();
		hardware6.setBrand(brand);
		hardware6.setName("RAM");
		hardware6.setType("store");
		
		Hardware hardware7=new Hardware();
		hardware7.setBrand(brand);
		hardware7.setName("MotherBoard");
		hardware7.setType("Internal Device");
		
		Hardware hardware8=new Hardware();
		hardware8.setBrand(brand);
		hardware8.setName("graphics card");
		hardware8.setType("graphics");
		
		Hardware hardware9=new Hardware();
		hardware9.setBrand(brand);
		hardware9.setName("computer storage");
		hardware9.setType("storage");
		
		Hardware[] hardwares={hardware,hardware1,hardware2,hardware3,hardware4,hardware5,hardware6,hardware7,hardware8,hardware9};
		
		Address address=new Address();
		address.setCity(cities);
		
		Owner owner=new Owner();
		owner.setPermanantAddress(address);
		owner.setTemporaryAddress(address);
		
		Laptop laptop=new Laptop();
		laptop.setHardware(hardwares);
		laptop.setOwner(owner);
		laptop.setBrand(brand);
		
		laptop.show();
		
		System.out.println("Ending main in LaptopStarter");
	}
}