package Stuff;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Things004 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		logln("Welcome to BMC Investments");
		logln("--------------------------");
		log("Enter amount to invest:");
		double Money = scan.nextDouble();
		log("Enter yearly interest rate: %");
		double Interest = scan.nextDouble();
		double Minterest = (Interest/1200);
		double XX = Money;
		logln("\n \n \n");
		logln("Projection for investment of: " + Money);
		logln("over a period of 2 years");
		logln("**************************");
		logln("Month: \t Ammount:       Full Ammount:");
		DecimalFormat df = new DecimalFormat("#.##");
		for(int i = 1;i<25; i++){

			Money = (Minterest*Money) + Money;
			System.out.printf("%d \t £%.2f  \t  £%.6f  \n",i, Money, Money);
		}
		logln("Money Earned: £" +df.format(Money - XX) + "  on your original investment");
	} 
	
    private static void logln(String number)
    {
        System.out.println(number);
    
    }
    private static void logln(double number)
    {
        System.out.println(number);
    
    }
    private static void logln(int number)
    {
        System.out.println(number);
    
    }
    private static void log(String number)
    {
        System.out.print(number);
    
    }
    private static void log(double number)
    {
        System.out.print(number);
    
    }
    private static void log(int number)
    {
        System.out.print(number);
    
    }
}