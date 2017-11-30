package CarRental;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Invoice {
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader reader = new BufferedReader(input);
	public static void main(String[] args) throws IOException{
		int i;
		Thing();
	}
		static public void Thing() throws IOException{


	      
	      
	      double quotePrice = 500;
	      
	            System.out.println("What is your name?");

				String name= reader.readLine();
	            System.out.println("What is your DOB?");
	            String DOB= reader.readLine();
	            System.out.println("What is your address?");
	            String address= reader.readLine();
	            System.out.println("What is your license number?");
	            int licenseNo = Integer.parseInt(reader.readLine());
	            
	      
	            System.out.println("INVOICE");
	            System.out.println("Name: " + name);
	            System.out.println("DOB: " + DOB);
	            System.out.println("Address: " +address);
	            System.out.println("License Number: "+licenseNo);
	            System.out.println("Quote Price: £" +quotePrice);
	            int Rcars = 10;
	            int RVan = 10;	 
	            int RBus = 10;
	            int Rbike = 10;
	            System.out.println("\n \nVehicle Pool  \n");
	            
	            System.out.println("Car: " + Rcars);
	            System.out.println("Van: " + RVan);
	            System.out.println("Bus: " + RBus);
	            System.out.println("Motorbike: " + Rbike);
	      }

	
	
}
