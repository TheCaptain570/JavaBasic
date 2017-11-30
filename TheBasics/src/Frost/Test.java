package Frost;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
		Lanes L1 = new Lanes("L1");
		Lanes L2= new Lanes("L2");
		Lanes L3 = new Lanes("L3");
		//L1.Display();
		//L2.Display();
		//L3.Display();
		int aa = 0;
		while(aa ==0)
		{
			Action(L1,L2,L3);
		}
	}
	

static public void Action(Lanes L1,Lanes L2,Lanes L3)	{	
		int choice = 0;
		while(choice != 4){
			L1.Display();
			L2.Display();
			L3.Display();
		Scanner scan = new Scanner(System.in);
		System.out.println("Action");
		System.out.println("[1] shuffle and respawn");
		System.out.println("[2] Kill L1:B");
		System.out.println("[3] Kill L2:E");
		System.out.println("[4] Exit");
		//int choice = 0;
		choice = scan.nextInt();
	switch(choice) { 
    	case 1 : SandR(L1); break; 
    	case 2 : Kill1(L1); break;
    	case 3 : Kill2(L2); break;
    	case 4 : break; 
    	default: 
        System.out.println("Invalid response");
				}
		}
	}

static public void SandR(Lanes L1)	{

	L1.M2 = L1.M3;
	L1.M3 = L1.M4;
	L1.M4 = L1.M5;
	L1.M5 = L1.M6;
	L1.M6 = L1.X;
}
static public void Kill1(Lanes L1)	{
	L1.X = L1.M2;
	L1.DeathM2();
	
}
static public void Kill2(Lanes L2)	{
	L2.DeathM5();
}



}
