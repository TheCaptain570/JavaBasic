package Stuff;

public class Employee 
	{
		static public String name;
		static public String employeeID;
		static public String department;
		static public double morale;
		
	
	public Employee(String Newname,String NewemployeeID,String Newdepartment)
	{
		this.name = Newname;
		this.employeeID = NewemployeeID;	
		this.department = Newdepartment;

	}


	 static public void display()
	 {
			
			System.out.println("Guy");
			System.out.println("Name = " + name);
			System.out.println("EmployeeID = " + employeeID);
			System.out.println("Department = " + department);

	}
	 
	 static public void Payslip()
	 {
			System.out.println("Name = " + name);
			System.out.println("Hours = " + 50);

	}
	 
}//end class employee
