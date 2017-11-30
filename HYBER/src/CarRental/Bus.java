package CarRental;
import java.io.IOException;
import java.util.Scanner;

public class Bus {

	Scanner scan = new Scanner(System.in);
    static public String[] transmission = new String[]{"Automatic","Manual"};
    static public int choice = 0;
    static public int choice2 = 0;
    
    public Bus(){
    
    }
    static public void Question1() throws IOException
    {
          
                Scanner scan = new Scanner(System.in);
                System.out.println("Transmission");
                System.out.println("[1] Automatic ");
                System.out.println("[2] Maneul ");
                choice = 0;
                choice = scan.nextInt();
                switch(choice) { 
                      case 1 : break; 
                      case 2 : break;
                      default: 
                      System.out.println("Invalid response");
                      }//scan.close();
                Extras();
          }
    
    static public void Extras() throws IOException
    {
                Scanner scan = new Scanner(System.in);
                System.out.println("Extras");
                System.out.println("[1] Luggage Storage ");
                System.out.println("[2] Nothing");
                choice2 = 0;
                //choice2 = scan2.nextInt();
                choice2 = scan.nextInt();
                switch(choice2) { 
                      case 1 : break; 
                      case 2 : break;
                      default: 
                      System.out.println("Invalid response");
                      }//scan.close();
                      Display();
    }

    static public void Display() throws IOException
    {
               int x = choice -1;
                System.out.println("Bus");
                System.out.println("Transmission = " + transmission[x]);
                System.out.println("Extras = " + choice);
                System.out.println("Price =  " + (500 + choice));
                Invoice.Thing();
    
    }

}
