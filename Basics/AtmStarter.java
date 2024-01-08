class AtmStarter{
	
	public static void main(String[] money){
		
		System.out.println("Starting main method in atmStarter");
		String[] branch=new String[5];
		branch[0]="BTM";
		branch[1]="JP Nagar";
		branch[2]="Sadhashiv Nagar";
		branch[3]="Kormangala";
		branch[4]="Jaynagar";
		
		String[] acs=new String[3];
		acs[0]="Prestige";
		acs[1]="Volvo";
		acs[2]="LG";
		
		String[] cctvBrands=new String[5];
		cctvBrands[0]="Sony";
		cctvBrands[1]="Panasonic";
		cctvBrands[2]="Bosch";
		cctvBrands[3]="Samsung";
		cctvBrands[4]="Pelco";
		
		Atm atm=new Atm();
		
		atm.setBranch(branch);
		atm.setAcs(acs);
		atm.setCctvBrands(cctvBrands);
		atm.showInfo();
		System.out.println("Ending main method in atmStarter");
	}
}