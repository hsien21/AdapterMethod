
public class BannerAdpaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banner banner = new Banner("Hello");
		
		banner.showWithAster();
		banner.showWithParen();

	}

}

class Banner{
	private String string;
	
	public Banner(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}
	
	public void showWithParen() {
	    System.out.println("(" + string + ")");
	  }
	  public void showWithAster() {
	    System.out.println("*" + string + "*");
	  }
}

abstract interface Print {
	public abstract void printWeek();
	public abstract void printStrong();
}

class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeek() {
		// TODO Auto-generated method stub
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}
	
	
	
}
