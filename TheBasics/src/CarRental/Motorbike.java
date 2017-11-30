package CarRental;

import java.util.Scanner;
public class Motorbike {
	Scanner scan = new Scanner(System.in);
	static public int[] engineSize = new int[]{300,500,200000};
	static public int choice = 0;
	static public int choice2 = 0;
	
	public Motorbike(){
	
	}
	 static public void Question1()
	 {
		 
			Scanner scan = new Scanner(System.in);
			System.out.println("Engine Size");
			System.out.println("[1] 300cc");
			System.out.println("[2] 500cc");
			System.out.println("[3] 200,00cc");
			System.out.println("[4] Exit");
			int choice = 0;
			choice = scan.nextInt();
			switch(choice) { 
				case 1 : break; 
				case 2 : break;
				case 3 : break;
				case 4 : break; 
				default: 
				System.out.println("Invalid response");
				}//scan.close();
		}
	
	 static public void Extras()
	 {
			Scanner scan = new Scanner(System.in);
			System.out.println("Extras");
			System.out.println("[1] Helmet ");
			System.out.println("[2] Nothing");
			int choice = 0;
			//choice2 = scan2.nextInt();
			choice = scan.nextInt();
			switch(choice) { 
				case 1 : break; 
				case 2 : break;
				default: 
				System.out.println("Invalid response");
				}scan.close();
	}

	 static public void Display()
	 {
		 	int x = choice+1;
		 	System.out.println("I like boys with big arms");
//			System.out.println("MotorBike");
//			System.out.println("Engine = " + engineSize[x] + "cc");
//			System.out.println("Extras = " + choice);
//			System.out.println("Price =  " + (100 + choice));
	 
	}

}
		

