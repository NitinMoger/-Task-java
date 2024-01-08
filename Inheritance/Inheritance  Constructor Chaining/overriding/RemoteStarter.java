class RemoteStarter
{
	public static void main(String... values)
	{
		System.out.println("Start the RemoteStarter in Main class");
		LgRemote lgRemote=new LgRemote();
		LgRemote lgRemote1=new LgRemote(usedFor.TV_ON,20,true,"2 years",2);
		lgRemote1.on();
		lgRemote1.off();
		lgRemote1.increaseVolume();
		lgRemote1.decreaseVolume();
		lgRemote1.voiceCommand();
		lgRemote1.changeChannel();
		
		System.out.println("End the RemoteStarter in main class");
	}
}