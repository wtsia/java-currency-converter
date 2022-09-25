import java.util.Scanner;

public class Conversion {
	/**
	 * Class converts currency from USD to RMB and vice versa
	 * @author Higinio L.P., Winston T.
	 */
	public static double unitUsdToRmb = 7.05;
	public static double unitRmbToUsd = 0.14;
	
	/**
	 * Method to convert USD to RMB
	 * @param USD input as a double
	 * @return USD converted to RMB
	 */
	public static double convertUsdToRmb (double input) {
		return input*unitUsdToRmb;
	}
	
	/**
	 * Method to convert RMB to USD
	 * @param RMB input as a double
	 * @return RMB converted to USD
	 */
	public static double convertRmbToUsd (double input) {
		return input*unitRmbToUsd;
	}
	
	/**
	 * presentMenu method 
	 * prints menu of options to the user and returns the options chosen by the user
	 * @return userInput
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
		return userInput;
	};
	
	/**
	 * Main method class
	 * @param args
	 * @return conversionResult, and converted currency
	 */
	public static void main(String[] args) {
		Scanner currencyAmount = new Scanner(System.in);
		
		int conversionType = presentMenu();
		double conversionResult = 0; //set default value to 0
		double currencyInput = 0; //set default value to 0
		String currencyType = "";
		
		if (conversionType == 3) {
			System.out.println("Exiting the tool... goodbye!");
			System.exit(0);
		} if (conversionType == 1) {
			System.out.println(conversionType + " you have chosen USD to RMB");
			
			// take input of USD and convert to RMB
			System.out.println("Type the value of currency to be input.");
			System.out.print("Your answer (USD): ");
			currencyInput = currencyAmount.nextDouble();
			conversionResult = convertUsdToRmb(currencyInput);
			currencyType = "RMB";
		} if (conversionType == 2) {
			System.out.println(conversionType + " you have chosen RMB to USD");
			
			// take input of RMB and convert to USD
			System.out.println("Type the value of currency to be input.");
			System.out.printf("Your answer (RMB): ");
			currencyInput = currencyAmount.nextDouble();
			conversionResult = convertRmbToUsd(currencyInput);
			currencyType = "USD";
		}
		
		System.out.printf("Your converted currency is %.1f %s\n", conversionResult, currencyType);
		System.out.println("Have a nice day!");
		System.exit(0);
	}
}

