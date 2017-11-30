package Stuff;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Week4D2 {
	public static void main(String[] args)throws IOException{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    Scanner scan = new Scanner(System.in);
	    //////////////////////////////////////////////////////////////////////////
		/*log("Please enter your name.");
		String name1 = in.readLine();
		name(name1); */
	    //////////////////////////////////////////////////////////////////////////
		/*log("Please enter first number");
		double number01 = scan.nextDouble();
		log("Please enter second number");
		double number02 = scan.nextDouble();
		while(scan!=null){
		log("Please enter operation");
		log("1.	+");
		log("2.	-");
		log("3.	/");		
		log("4.	*");
		double op = scan.nextDouble();		
		if(op == 1){add(number01,number02);}
		if(op == 2){minus(number01,number02);}
		if(op == 3){divide(number01,number02);}
		if(op == 4){multi(number01,number02);}
		}*/
	    //////////////////////////////////////////////////////////////////////////
	    //fizzybuzztime();
	    //////////////////////////////////////////////////////////////////////////
	    /*
	    String[] things = new String[4];
	    things[0] = "d";
	    things[1] = "u";
	    things[2] = "c";
	    things[3] = "k";
	    for(int i = 0; i < things.length; i++)
	    {log(things[i]);}
	    */
	    //////////////////////////////////////////////////////////////////////////
	    ArrayList<String> students = new ArrayList<String>();
	    students.add("Anne");
	    students.add("Brain");
	    students.add("Claire");
	    students.add("Dylan");
	    students.add("Ellen");
	    
	    log(students.get(0));
	    //////////////////////////////////////////////////////////////////////////
	    
		in.close();
		scan.close();
	}
	
	private static void name(String name1){

		if( name1.equals("Chuck Norris")){
			log("I heard you can send a roundhouse kick through Email...  \n");
			}
		else if(name1.equals( "CHUCK NORRIS")){
				log(" CAPS MEANS SHOUTING");
		}
		else{
		log("Hello " + name1 + "\n");}
		//log(name1.length());
	}	
	private static void add(double number01,double number02){
		double number03 = number01 + number02;
		System.out.println(number01 + " + " + number02 + " = " + number03);
	}
	private static void minus(double number01,double number02){
		double number03 = number01 - number02;
		System.out.println(number01 + " - " + number02 + " = " + number03);
	}	
	private static void divide(double number01,double number02){
		double number03 = number01 / number02;
		System.out.println(number01 + " / " + number02 + " = " + number03);
	}
	private static void multi(double number01,double number02){
		double number03 = number01 * number02;
		System.out.println(number01 + " * " + number02 + " = " + number03);
	}
	private static void fizzybuzztime(){
	    for (int i = 1; i < 100; i ++)
	    	if(i % 5 ==0 && i % 3 ==0){log("Fizz Buzz");}	    	
	    	else if(i % 3 ==0){log("Fizz");} 
	    	else if(i % 5 ==0){log("Buzz");}
	    	else{log(i);}
	}
	private static void log(String number)
    {
        System.out.println(number);
    
    }
    private static void log(double number)
    {
        System.out.println(number);
    
    }

}