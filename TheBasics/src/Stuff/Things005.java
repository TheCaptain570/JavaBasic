package Stuff;

import java.util.Arrays;
import java.util.Random;
import java.lang.*;


public class Things005 {

	public static void main(String[] args){
		Random rand = new Random();
		int Chessboard[][] = new int[16][16];
		
			/*	for(int i = 0;i < 8;i++){
					for(int j = 0;j < 8;j++){
						
						if(i%2 ==0 && j%2==0){log("1");}
						if(i%2 ==1 && j%2==0){log("2");}
						else log("0");
					}
					logln(" ");
				}*/
		//---------------------------------------------------------------------------
		//filling diagram
		for(int i = 0;i < 16;i++){
			for(int j = 0;j < 16;j++){
				
				Chessboard[i][j] = 0;
				if(i ==15 && j==15){Chessboard[rand.nextInt(15)][rand.nextInt(15)] = 3;}
				if( i%2== 0&& j%2 ==1 ){Chessboard[i][j] = 2;}
				if( i%2== 1&& j%2 ==0 ){Chessboard[i][j] = 2;}
				else{}
				}
			}
		//---------------------------------------------------------------------------
		// printing the thingy
		for(int i = 0;i < 16;i++){
			for(int j = 0;j < 16;j++){
				log(Chessboard[i][j]+" ");
				}
			logln(" ");
			}
		//----------------------------------------------------------------------------
		log("\n\n\n\n\n");
		//---------------------------------------------------------------------------
		//filling diagram
		for(int i = 0;i < 16;i++){
			for(int j = 0;j < 16;j++){
				
				Chessboard[i][j] = 0;
				if(i ==15 && j==15){Chessboard[rand.nextInt(15)][rand.nextInt(15)] = 5;}
				if( i%2== 1&& j%2 ==1 ){Chessboard[i][j] = 2;}
				if( i%2== 0&& j%2 ==0 ){Chessboard[i][j] = 2;}
				else{}
				}
			}
		//---------------------------------------------------------------------------
		// printing the thingy
		for(int i = 0;i < 16;i++){
			for(int j = 0;j < 16;j++){
				log(Chessboard[i][j]+" ");
				}
			logln(" ");
			}
		//-----------------------------------------------------------------------------		
		
		
		
		
		
		
		
		logln("\n\n\n");
		
		
		
		/*
		for(int i = 0;i < 8;i++){
			for(int j = 0;j < 8;j++){

				Chessboard[i][j] = 0;

				if( i + j == 7){Chessboard[i][j] = 2;}
				//if( i + j == 5){Chessboard[i][j] = 2;}
				//if( i + j == 3){Chessboard[i][j] = 2;}
				///if( i + j == 9){Chessboard[i][j] = 2;}
				//if( i + j == 11){Chessboard[i][j] = 2;}
				//if( i + j == 13){Chessboard[i][j] = 2;}
				//if( i + j == 1){Chessboard[i][j] = 2;}
				if( i==j){Chessboard[i][j] = 2;}
				else{}
				log(Chessboard[i][j]+" ");
				}
			logln(" ");
			}	*/	

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