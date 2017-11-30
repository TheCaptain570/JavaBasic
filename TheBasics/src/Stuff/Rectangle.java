package Stuff;

public class Rectangle 
{
	public double length;
	public double breadth;
	
	public static int counter = 0;
	
public Rectangle()
{
	this.length = 8;
	this.breadth = 6;
	counter++;
}
public Rectangle(double length)
{
	this.length = length;
	this.breadth = length;
	counter++;
}
public Rectangle(double length,double breadth)
{
	this.length = length;
	this.breadth = breadth;
	counter++;
}

	
 public double GetArea()
 {
	 
	 double area = length * breadth;
	 return area;
 }
	
 public double GetPerimeter()
 {
	 
	 double perimeter = 2*(length * breadth);
	 return perimeter;
 }
 public void ChangeLength(double Newlength, double length)
 {
	 
	 length = Newlength;
 }
 public void ChangeBreadth(double breadth, double Newbreadth)
 {
	 breadth = Newbreadth;
 }
 
}
