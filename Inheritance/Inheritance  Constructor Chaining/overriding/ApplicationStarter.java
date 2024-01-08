class ApplicationStarter
{
	
	public static void main(String... args)
	{
		System.out.println("Start the ApplicationStarter in main");
		/* Application application=new Application(); 
		Application application1=new Application(131,Type.Adobe_Photoshop,"2022:7.x","Adobe Developer","21/02/1998");
		application1.run();
		application1.execute();
		application1.stop();
		application1.collectInfo();
		application1.displayInfo();*/
		
		StandaloneApplication standaloneApplication=new StandaloneApplication();
		StandaloneApplication standaloneApplication1=new StandaloneApplication(131,Type.Adobe_Photoshop,"2022:7.x","Adobe Developer","21/02/1998",512,45);
		standaloneApplication1.run();
		standaloneApplication1.execute();
		standaloneApplication1.stop();
		standaloneApplication1.collectInfo();
		standaloneApplication1.displayInfo();
		standaloneApplication1.consumerMemory();
		standaloneApplication1.consumeInternet();
		
		System.out.println("==========================================");
		WebApplication webApplication1=new WebApplication();
		WebApplication webApplication=new WebApplication();
		String[] supportedBrowsers={"Chrome","Firefox","Opera","Brave","Edge"};
		webApplication.connectInternet(supportedBrowsers);
		webApplication.sendUsage();
		
		System.out.println("==========================================");
		Browser browser=new Browser();
		browser.consumerMemory();
		browser.consumeInternet();
		String[] downloads={"Chrome","Firefox","Edge"};
		browser.settings(downloads);
		String[] browsingHistorySites={"github","chatgpt","no1 Batsman"};
		browser.displayHistory(browsingHistorySites);
		
		System.out.println("==========================================");
		MediaPlayer mediaPlayer=new MediaPlayer();
		String[] favourites={"Music","Image","Video","Game"};
		mediaPlayer.delete(favourites);
		mediaPlayer.consumerMemory();
		mediaPlayer.consumeInternet();
		mediaPlayer.play();
		mediaPlayer.download();
		
		System.out.println("==========================================");
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		String[] downloads1={"Chrome","Firefox","Edge"};
		chromeBrowser.settings(downloads1);
		String[] browsingHistorySites1={"github","chatgpt","no1 Batsman"};
		chromeBrowser.displayHistory(browsingHistorySites1);
		
		System.out.println("==========================================");
		EdgeBrowser edgeBrowser=new EdgeBrowser();
		String[] downloads2={"Chrome","Firefox","Edge"};
		edgeBrowser.settings(downloads2);
		String[] browsingHistorySites2={"github","chatgpt","no1 Batsman"};
		edgeBrowser.displayHistory(browsingHistorySites2);
		
		System.out.println("==========================================");
		FirefoxBrowser firefoxBrowser=new FirefoxBrowser();
		String[] downloads3={"Chrome","Firefox","Edge"};
		firefoxBrowser.settings(downloads3);
		String[] browsingHistorySites3={"github","chatgpt","no1 Batsman"};
		firefoxBrowser.displayHistory(browsingHistorySites3);
		System.out.println("End the applicationStarter in main");
	}
}