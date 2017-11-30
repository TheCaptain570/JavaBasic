package Stuff;
import java.util.Random;


public class MA {

	public static void main(String[] args) {

		for(int i= 0; i<20; i++){
			Random rand = new Random();
			int X = rand.nextInt(10);
			log("[Atk,Def,Spd]");
			log("[" + X+ ",");
			for(int j= 0; j<1; j++){
				Random rand2 = new Random();
				int Y = rand2.nextInt(10);
				log(Y + ",");
			}
			for(int k= 0; k<1; k++){
				Random rand3 = new Random();
				int Z = rand3.nextInt(10);
				log(Z+ "]\n");
			}
		}
		
		
	}
	
	
	private static void log(String number)
    {
        System.out.print(number);
    
    }
    private static void log(int number)
    {
        System.out.print(number);
    
    }
    private static void log(double number)
    {
        System.out.print(number);
    
    }
}
