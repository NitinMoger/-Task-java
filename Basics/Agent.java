class Agent{
	
	int id;
    String name;
    String company;

    public Agent(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public void openTent(Tent tent) {
        if (tent.open()) {
            System.out.println(name + " opened the tent with Serial No " + tent.slNo);
        } 
    }

    public void closeTent(Tent tent) {
        if (tent.close()) {
            System.out.println(name + " closed the tent with Serial No " + tent.slNo);
        } 
    }

    public void showInfo() {
        System.out.println("Agent ID: " + id);
        System.out.println("Agent Name: " + name);
        System.out.println("Company: " + company);
    }
}