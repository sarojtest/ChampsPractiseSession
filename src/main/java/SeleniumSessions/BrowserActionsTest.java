package SeleniumSessions;

public class BrowserActionsTest {

	public static void main(String[] args) {

		BrowserActions bra = new BrowserActions();
		bra.launchBrowser("firefox");
		bra.launchUrl("http://www.google.com");
		bra.doGetTitle();
		if (bra.doGetTitle().equals("Google")) {
			System.out.println("title is correct" );
		}
		else {
			System.out.println("title is not correct");
		}
		bra.quitBrowse();
	}

}
