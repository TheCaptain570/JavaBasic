package CarRental;
import java.io.IOException;
import java.util.Scanner;


public class Vehicle {

	protected int lengthOfRental, noOfPassengers, vehicleType;
    protected String colour;
    //int newTypeVehicle, 
    public Vehicle () 
    {//int newRentalLength, int newPassengerNo, String newColour
          //lengthOfRental = newRentalLength;
          //noOfPassengers = newPassengerNo;
          //vehicleType = newTypeVehicle;
          //colour = newColour;
          
    }
    
    static public void display() throws IOException
    {
                Scanner scan = new Scanner(System.in);
                System.out.println("Vehicle Choice");
                System.out.println("[1] Car");
                System.out.println("[2] Van");
                System.out.println("[3] Bus");
                System.out.println("[4] Motorbike");
                System.out.println("[5] Exit");
                int choice = 0;
                choice = scan.nextInt();
                switch(choice) { 
                      case 1 : Car.Question1(); break; 
                      case 2 : Van.Question1();break;
                      case 3 : Bus.Question1(); break;
                      case 4 : Motorbike.Question1();break;
                      case 5 : break;
                      default: 
                      System.out.println("Invalid response");
                      }//scan.close();
    }

    public void details(){
          System.out.println("Vehicle details");
          System.out.println("Length of rental: " +lengthOfRental);
          System.out.println("Number of passengers: " +noOfPassengers);
          //System.out.println("Type of vehicle: " +vehicleType);
          System.out.println("Colour selected: " +colour);
    }
    

	
}
