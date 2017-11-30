package Stuff;

public class Things003 {

	public static void main(String[] args) {
		int NUM = 0;
			for(int i = 0;i < 8;i++){
				for(int j = 0;j < 8;j++){
					log(Integer.toHexString(NUM)+ ",");
					NUM ++;


				}
				logln(" ");
			}
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
		    