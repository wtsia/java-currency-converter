import java.util.Scanner;

class Conversion {
	// constants for default conversion
	public static double unitUsdToRmb = 7.05;
	public static double unitRmbToUsd = 0.14;
	/**
	 * Method to convert USD to RMB
	 * Takes in an input and returns the unit conversion of USD to ROMB
	 */
	public static double convertUsdToRmb (double input) {
		return input*unitUsdToRmb;
	}
	
	/**
	 * presentMenu method 
	 * presents menu of options to the user and returns the options chosen by the user
	 * returns the value to main
	 */
	public static int presentMenu() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("****************************************************");
		System.out.println("*            CURRENCY CONVERSION TOOL              *");
		System.out.println("*                                                  *");
		System.out.println("*                   AUTHORS:                       *");
		System.out.println("*             Higino L.P., Winston T.              *");
		System.out.println("* https://github.com/wtsia/java-currency-converter *");
		System.out.println("*                                                  *");
		System.out.println("*             Choose Conversion Type:              *");
		System.out.println("*                                                  *");
		System.out.println("* 1. United States Dollar (USD) to Renminbu (RMB)  *");
		System.out.println("* 2. Renminbu (RMB) to United States Dollar (USD)  *");
		System.out.println("* 3. Exit                                          *");
		System.out.println("*         (enter conversion type below)            *");
		System.out.println("****************************************************");
		// 
		//
		
		int conversionType = in.nextInt();
		System.out.println(conversionType);
		return conversionType;
	}
	
//	/**
//	 * Main method class
//	 * @parameters
//	 * @return
//	 *
//	 */
//	public static void main(String[] args) {
//		Scanner scnr = new Scanner(System.in);
//
//		// comment
//		//
//	}

	public static void main(String[] args) {
		//scanner for input of conversion desired
//		System.out.println("Which option would you like to do:");
//		System.out.println("1.convert USD to RMB");
//		System.out.println("2.Convert RMB to USD");
//		System.out.println("3.Exit");
		
		presentMenu();
//		Scanner menuInput = new Scanner(System.in);
//		
//		System.out.println("Please input an option number");
//		
//		String optionNum = menuInput.nextLine();
//		System.out.println("You selected option " + optionNum + " ."); 
	}
}

