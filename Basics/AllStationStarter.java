public class AllStationStarter {
    public static void main(String[] args)
    {
        System.out.println("Start the Allstation Method");
        AllStation allStation=new AllStation();
        System.out.println("Name of the station is:"+allStation.name);
        System.out.println("Total number of the vehicle is:"+allStation.vehicleNo);
        System.out.println("The name of the vehicle:"+allStation.vehicleName);
        System.out.println("Total platform in station:"+allStation.platformNo);
        System.out.println("Length of the station:"+allStation.length);
        System.out.println("\nThe details of the another station");
        AllStation allStation1=new AllStation();
        System.out.println("Name of the station is:"+allStation1.name);
        System.out.println("Total number of the vehicle is:"+allStation1.vehicleNo);
        System.out.println("The name of the vehicle:"+allStation1.vehicleName);
        System.out.println("Total platform in station:"+allStation1.platformNo);
        System.out.println("Length of the station:"+allStation1.length);
        System.out.println("End the All station method");
    }
}
