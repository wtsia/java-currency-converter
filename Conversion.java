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
		int userInput;
		Scanner in = new Scanner(System.in);
		
		System.out.println("****************************************************");
		System.out.println("*            CURRENCY CONVERSION TOOL              *");
		System.out.println("*                                                  *");
		System.out.println("*                    AUTHORS:                      *");
		System.out.println("*            Higinio L.P., Winston T.              *");
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
		userInput = in.nextInt();
		while ((userInput > 3) | (userInput < 1)) {
			System.out.println("Please enter a number corresponding to a relevant option (1-3)");
			System.out.print("Your answer:");
			userInput = in.nextInt();
		}
		// int conversionType = in.nextInt();
		// Print out for testing
		// System.out.println(conversionType);
		return userInput;
	};
	
	/**
	 * Main method class
	 * @parameters
	 * @return
	 *
	 */
	public static void main(String[] args) {
		Scanner currencyAmount = new Scanner(System.in);
		
		int conversionType = presentMenu();
		double conversionResult = 0; //set default value to 0
		double currencyInput = 0; //set default value to 0
		
		if (conversionType == 3) {
			System.out.println("Exiting the tool... goodbye!");
			System.exit(0);
		} if (conversionType == 1) {
			System.out.println(conversionType + " you have chosen USD to RMB");
			
			// take input of USD and convert to RMB
			System.out.println("Type the value of currency to be input.");
			System.out.print("Your answer (RMB): ");
			currencyInput = currencyAmount.nextDouble();
			conversionResult = convertUsdToRmb(currencyInput);
			
			System.out.printf("Your converted currency is %.1f RMB\n", conversionResult);
			System.out.println("Have a nice Day!");
			System.exit(0);
		} if (conversionType == 2) {
			System.out.println(conversionType + " you have chosen RMB to USD");
			
			// take input of RMB and convert to USD
			System.out.println("Type the value of currency to be input.");
			System.out.printf("Your answer (USD): ");
			currencyInput = currencyAmount.nextDouble();
			conversionResult = convertRmbToUsd(currencyInput);
			
			System.out.printf("Your converted currency is %.1f USD\n", conversionResult);
			System.out.println("Have a nice Day!");
			System.exit(0);
		} else {
			System.out.println("Error");
		}
	}
}

