package GamyCode;

import java.util.Scanner;


public class CSelectionScreen {

	public static void main(String[] args){
		//int open = 0;
		Scanner scan = new Scanner(System.in);
		//while( open != 1){
		PickType();

		//}
		scan.close();	
	}// end main
	
//
//-------------------------------------------------------------
//	
	static public void PickType()	{	
		int choice = 0;
		while(choice != 4){
		Scanner scan = new Scanner(System.in);
		logln("Pick a Hero type");
		logln("[1] Dexerity Hero");
		logln("[2] Intelligence Hero");
		logln("[3] Strength Hero");
		logln("[4] Exit");
		//int choice = 0;
		choice = scan.nextInt();
		switch(choice) { 
    case 1 : TypeDex(); break; 
    case 2 : TypeInt(); break;
    case 3 : TypeStr(); break;
    case 4 : break; 
    default: 
        System.out.println("Invalid response");
		}
		}
	}
//
//-------------------------------------------------------------
//
	static public void TypeDex()	{
		Scanner scan = new Scanner(System.in);
		logln("Pick a Hero");
		logln("[1] Katarina");
		logln("[2] WindRanger");
		logln("[3] Bounty Hunter");
		logln("[4] Lucian");
		logln("[5] Varus");
		logln("[6] Exit");
		int dexchoice = 0;
		dexchoice = scan.nextInt();
		switch(dexchoice) { 
    case 1 : StatsDisplay Katarina = new StatsDisplay(dexchoice); Katarina.Dexdisplay(); break;
    case 2 : StatsDisplay WindRanger = new StatsDisplay(dexchoice); WindRanger.Dexdisplay(); break;
    case 3 : StatsDisplay Bounty_Hunter = new StatsDisplay(dexchoice); Bounty_Hunter.Dexdisplay(); break;
    case 4 : StatsDisplay Lucian = new StatsDisplay(dexchoice); Lucian.Dexdisplay(); break;
    case 5 : StatsDisplay Varus = new StatsDisplay(dexchoice); Varus.Dexdisplay(); break;
    case 6 : break; 
    default: 
        System.out.println("Invalid response");
		}
		//scan.close();
	}
//
//-------------------------------------------------------------
//
		static public void TypeInt()	{
			Scanner scan = new Scanner(System.in);
			logln("Pick a Hero");
			logln("[1] Ryze");
			logln("[2] Morgana");
			logln("[3] Silencer");
			logln("[4] Pugna");
			logln("[5] Puck");
			logln("[6] Exit");
			int intchoice = 0;
			intchoice = scan.nextInt();
			switch(intchoice) { 
		    case 1 : StatsDisplay Ryze = new StatsDisplay(intchoice); Ryze.Intdisplay(); break;
		    case 2 : StatsDisplay Morgana = new StatsDisplay(intchoice); Morgana.Intdisplay(); break;
		    case 3 : StatsDisplay Silencer = new StatsDisplay(intchoice); Silencer.Intdisplay(); break;
		    case 4 : StatsDisplay Pugna = new StatsDisplay(intchoice); Pugna.Intdisplay(); break;
		    case 5 : StatsDisplay Puck = new StatsDisplay(intchoice); Puck.Intdisplay(); break;
	    default: 
	     System.out.println("Invalid response");
			}
			//scan.close();
	}
	//
	//-------------------------------------------------------------
	//
		static public void TypeStr()	{	
		Scanner scan = new Scanner(System.in);
		logln("Pick a Hero");
		logln("[1] Darius");
		logln("[2] Axe");
		logln("[3] Juggernaut");
		logln("[4] DrMumdo");
		logln("[5] Talon");
		logln("[6] Exit");
		int strchoice = 0;
		strchoice = scan.nextInt();
		switch(strchoice) { 
	    case 1 : StatsDisplay Darius = new StatsDisplay(strchoice); Darius.Strdisplay(); break;
	    case 2 : StatsDisplay Axe = new StatsDisplay(strchoice); Axe.Strdisplay(); break;
	    case 3 : StatsDisplay Juggernaut = new StatsDisplay(strchoice); Juggernaut.Strdisplay(); break;
	    case 4 : StatsDisplay DrMumdo = new StatsDisplay(strchoice); DrMumdo.Strdisplay(); break;
	    case 5 : StatsDisplay Talon = new StatsDisplay(strchoice); Talon.Strdisplay(); break;
		    default: 
		    System.out.println("Invalid response");
			}
		//scan.close();
	}
		//
		//-------------------------------------------------------------
		//



	
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
} //end package
    
   