class LgRemote extends Remote
{
   String warranty;
   int totalBatteries;
   

   LgRemote()
   {
	   System.out.println("no argument constructor of LgRemote");
   } 
   LgRemote(usedFor usedfor,int totalButtons,boolean original,String warranty,int totalBatteries)
   {
	   super(usedfor,totalButtons,original);
	   this.warranty=warranty;
	   this.totalBatteries=totalBatteries;
	   System.out.println("LgRemote warranty is:"+this.warranty);
	   System.out.println("LgRemote totalBatteries:"+this.totalBatteries);
   }
    
   @Override
   void on()
   {
	   System.out.println("On the Tv using LgRemote");
   }  

   void voiceCommand()
   {
	   System.out.println("Run the voiceCommand method in LgRemote");
   }   
   
   @Override
   void decreaseVolume()
   {
	   System.out.println("decreaseVolume using the LgRemote");
   }
} 