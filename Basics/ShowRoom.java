public class ShowRoom {
    String showRoomName="Advaith Motors";
    String location;
    int pincode=560011;
    String ownerName="Ramana";
    long contactNumber;
    String vehicleInShow;
    double salesPrice;
    String spareParts="Bumper";

    ShowRoom()
    {
        System.out.println("Constructor with No arguments");
    }
    ShowRoom(String location)
    {
        this.location=location;
        System.out.println("\nConstructor with arguments:"+location);
    }
    ShowRoom(int pincode, String showRoomName)
    {
        this.pincode=pincode;
        this.showRoomName=showRoomName;
        System.out.println("\n Constructor with arguments:" +pincode+ " , " +showRoomName);
    }
    ShowRoom(String ownerName, long contactNumber)
    {
        this.ownerName=ownerName;
        this.contactNumber=contactNumber;
        System.out.println("\n Constructor with arguments:" +ownerName+ " , " +contactNumber);
    }
    ShowRoom(String vehicleInShow, String spareParts, int pincode)
    {
        this.vehicleInShow=vehicleInShow;
        this.spareParts=spareParts;
        this.pincode=pincode;
        System.out.println("\n Constructor with arguments:" +salesPrice+ " , " +spareParts);
    }
    ShowRoom(String location, int pincode)
    {
        this.location=location;
        this.pincode=pincode;
        System.out.println("\n Constructor with arguments:" +location+ " , " +pincode);
    }
    ShowRoom(String spareParts, String location, String showRoomName)
    {
        this.spareParts=spareParts;
        this.location=location;
        this.showRoomName=showRoomName;
        System.out.println("\n Constructor with arguments:" +spareParts+ " , " +location+ " ," +showRoomName);
    }
    ShowRoom(String ownerName, int pincode, long contactNumber)
    {
        this.ownerName=ownerName;
        this.pincode=pincode;
        this.contactNumber=contactNumber;
        System.out.println("\n Constructor with arguments:" +ownerName+ " ," +pincode+ " , " +contactNumber);
    }
}
