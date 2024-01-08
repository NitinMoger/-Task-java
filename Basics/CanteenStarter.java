class CanteenStarter{
	
	
	public static void main(String[] args){
		
		System.out.println("Starting main in CanteenStarter");
		String[] items=new String[40];
		items[0]="food thermometer";
		items[1]="pairing Knife";
		items[2]="Bread Cutter";
		items[3]="fork";
		items[4]="Honing";
		items[5]="Chopping board";
		items[6]="scissors";
		items[7]="vegetable Cutter";
		items[8]="garlic press";
		items[9]="Grater";
		items[10]="kitchen scales";
		items[11]="measuring jug";
		items[12]="measuring spoons";
		items[13]="measuring cups";
		items[14]="mixing bowl";
		items[15]="pasta strainer";
		items[16]="Sieve";
		items[17]="Rolling pin";
		items[18]="Can opener";
		items[19]="blender";
		items[20]="Ladle";
		items[21]="Rod";
		items[22]="pizza cutter";
		items[23]="corkscrew";
		items[24]="bottle opener";
		items[25]="flying pan";
		items[26]="sausepans";
		items[27]="ovenproof dish";
		items[28]="baking sheet";
		items[29]="stirring spoon";
		items[30]="slotted spoon";
		items[31]="spatula";
		items[32]="tongs";
		items[33]="masher";
		items[34]="oven gloves";
		items[35]="pot holders";
		items[36]="bread bin";
		items[37]="kitchen foil";
		items[38]="tea towels";
		items[39]="Knife";		
		
		Canteen canteen=new Canteen("VEG");
		canteen.setUtensils(items);
		canteen.showInfo();
		
		
		System.out.println("Starting main in CanteenStarter");
	}
}