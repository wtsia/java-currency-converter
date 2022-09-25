import java.util.Scanner;

class Conversion {
	/**
	 * constants for default conversion:
	 * @parameters unitUsdToRmb
	 * @parameter unitRmbToUsd
	 */
	public static double unitUsdToRmb = 7.05;
	public static double unitRmbToUsd = 0.14;
	
	/**
	 * Method to convert USD to RMB
	 * Takes in an input and returns the unit conversion of USD to ROMB
	 * @parameters double input
	 * @return input*unitUsdToRmb
	 */
	public static double convertUsdToRmb (double input) {
		return input*unitUsdToRmb;
	}
	public static double convertRmbToUsd (double input) {
		return input*unitRmbToUsd;
	}
	
	/**
	 * presentMenu method 
	 * presents menu of options to the user and returns the options chosen by the user
	 * @return conversionType as input value
	 */
	public static int presentMenu() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("****************************************************");
		System.out.println("*            CURRENCY CONVERSION TOOL              *");
		System.out.println("*                                                  *");
		System.out.println("*                    AUTHORS:                      *");
		System.out.println("*             Higino L.P., Winston T.              *");
		System.out.println("* https://github.com/wtsia/java-currency-converter *");
		System.out.println("*                                                  *");
		System.out.println("*             Choose Conversion Type:              *");
		System.out.println("*                                                  *");
		System.out.println("* 1. United States Dollar (USD) to Renminbu (RMB)  *");
		System.out.println("* 2. Renminbi (RMB) to United States Dollar (USD)  *");
		System.out.println("* 3. Exit                                          *");
		System.out.println("*         (enter conversion type below)            *");
		System.out.println("****************************************************\n");
		
		System.out.print("Your answer:");
		// int conversionType = in.nextInt();
		// Print out for testing
		// System.out.println(conversionType);
		return in.nextInt();
	};
	
	/**
	 * Main method class
	 * @parameters
	 * @return
	 *
	 */
	public static void main(String[] args) {
		int conversionType = presentMenu();
		
		if (conversionType == 3) {
			System.out.println("Exiting the tool... goodbye!");
			System.exit(0);
		} else {
			System.out.println(conversionType + " is the chosen type");
		}
	}
}

