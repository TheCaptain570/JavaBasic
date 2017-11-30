package Stuff;

public class Things006 {

	public static void main(String[] args){
	
		Rectangle rect1 = new Rectangle(5,9);
		Rectangle rect2 = new Rectangle(6);
		Rectangle rect3 = new Rectangle();
	
	System.out.println("Rectangle");
	System.out.println("Length = " + rect1.length);
	System.out.println("Breadth = " + rect1.breadth);
	System.out.println("Area = " + rect1.GetArea());
	System.out.println("Perimeter = " + rect1.GetPerimeter());
	logln("\n\n");
	System.out.println("Rectangle");
	System.out.println("Length = " + rect2.length);
	System.out.println("Breadth = " +  rect2.breadth);
	System.out.println("Area = " + rect2.GetArea());
	System.out.println("Perimeter = " + rect2.GetPerimeter());
	logln("\n\n");
	System.out.println("Rectangle");
	System.out.println("Length = " + rect3.length);
	System.out.println("Breadth = " + rect3.breadth);
	System.out.println("Area = " + rect3.GetArea());
	System.out.println("Perimeter = " + rect3.GetPerimeter());

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