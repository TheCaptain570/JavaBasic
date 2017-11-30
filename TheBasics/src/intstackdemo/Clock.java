package intstackdemo;

public class Clock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int data[] = {8,7,9,6,3};	
		
	ClockDisplay clk = new ClockDisplay(4,00);
	for(int i = 0; i<30;i++){
		System.out.println(clk.getTime());
		clk.timeTick();
		if(clk.getTime().equals("4:21"))
				{
			System.out.println("Devils lettuce time wooooooo");
		}
		//System.out.println(clk.getTime());
	}
	}
}


