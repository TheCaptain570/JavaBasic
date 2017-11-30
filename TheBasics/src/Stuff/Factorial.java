package Stuff;

import java.util.Scanner;

public class Factorial {
	static long ans=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		long num = scan.nextLong(); // nextInt();
		
		System.out.println("Calculating...");
		System.out.println(Recurrision(num));
	}
	
	
	public static long Recurrision(long num){
		ans = ans* num; 
		num -=1;
		if(num > 0){Recurrision(num);}
		return ans;
	}
	public static int Recurrision2(int num){
		if(num <= 0){return 1;}
		return Recurrision2(num-1);
	}
		
	
}
