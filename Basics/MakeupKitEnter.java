class MakeupKitEnter{
	
	public static void main(String[] args){
		System.out.println("main start in MakeupKitEnter");
		MakeupKit makeupKit=new MakeupKit();
		System.out.println("makeupKit name: "+makeupKit.brand);
		System.out.println("makeupKit cost: "+makeupKit.cost);
		System.out.println("makeupKit experyDate: "+makeupKit.experyDate);
		System.out.println("makeupKit noOfItem: "+makeupKit.noOfItem);
		System.out.println("______________________________________ ");
		
		MakeupKit makeupKit1=new MakeupKit("Lakme");
		System.out.println("makeupKit1 name: "+makeupKit1.brand);
		System.out.println("makeupKit1 cost: "+makeupKit1.cost);
		System.out.println("makeupKit1 experyDate: "+makeupKit1.experyDate);
		System.out.println("makeupKit1 noOfItem: "+makeupKit1.noOfItem);
		System.out.println("______________________________________ ");
		
		MakeupKit makeupKit2=new MakeupKit(2000);
		System.out.println("makeupKit2 name: "+makeupKit2.brand);
		System.out.println("makeupKit2 cost: "+makeupKit2.cost);
		System.out.println("makeupKit2 experyDate: "+makeupKit2.experyDate);
		System.out.println("makeupKit2 noOfItem: "+makeupKit2.noOfItem);
		System.out.println("______________________________________ ");
		
		MakeupKit makeupKit3=new MakeupKit("5-6-2024",8);
		System.out.println("makeupKit3 name: "+makeupKit3.brand);
		System.out.println("makeupKit3 cost: "+makeupKit3.cost);
		System.out.println("makeupKit3 experyDate: "+makeupKit3.experyDate);
		System.out.println("makeupKit3 noOfItem: "+makeupKit3.noOfItem);
		System.out.println("______________________________________ ");
		
		MakeupKit makeupKit4=new MakeupKit("bazzler",999,"4-8-2025",8);
		System.out.println("makeupKit4 name: "+makeupKit4.brand);
		System.out.println("makeupKit4 cost: "+makeupKit4.cost);
		System.out.println("makeupKit4 experyDate: "+makeupKit4.experyDate);
		System.out.println("makeupKit4 noOfItem: "+makeupKit4.noOfItem);
		System.out.println("______________________________________ ");
		
		
		
		
		
	    System.out.println("main start in MakeupKitEnter");

	}
}