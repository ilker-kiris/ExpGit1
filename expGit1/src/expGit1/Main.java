package expGit1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalesData salesData = new SalesData();
		
		displayGreetings();
		salesData.display();

	}
	
	private static void displayGreetings(){
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
	}

}
