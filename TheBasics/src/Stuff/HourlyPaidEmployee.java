package Stuff;

public class HourlyPaidEmployee extends Employee {
	
	static public double HourlyRate;

	public HourlyPaidEmployee(String name,String employeeID,String department, double rate)
	{
		super (employeeID, name, department);
		HourlyRate = rate;
	}
	 static public void display()
	 {
		 	Employee.display();
			System.out.println("Rate " + HourlyRate);
	}
	 static public void Payslip()
	 {
			Employee.Payslip();
			System.out.println("Hourly Pay = " + HourlyRate);
			System.out.println("Pay = " + (HourlyRate*50));
	}
	 
	 
	 
	 
}
