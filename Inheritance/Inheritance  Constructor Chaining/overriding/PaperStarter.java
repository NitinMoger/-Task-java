class PaperStarter
{
	public static void main(String... papers)
	{
		System.out.println("Start the PaperStarter in MAin");
		NewsPaper newsPaper1=new NewsPaper();
		NewsPaper newsPaper=new NewsPaper("Black",3,50,12.8d,10.2d,"Plan","ClassMate",true,true,1);
		newsPaper.literature();
		newsPaper.systematic();
		newsPaper.apaFormat();
		newsPaper.apaStyle();
		newsPaper.methodsSection();
		newsPaper.scientificPaper();
		newsPaper.write();
		newsPaper.read();
		newsPaper.study();
		newsPaper.cut();
		newsPaper.craft();
		newsPaper.design();
		newsPaper.art();
		newsPaper.reuse("Hindustan","Gray");
		
		
		System.out.println("End the Remote STarter in Main");
	}
}
