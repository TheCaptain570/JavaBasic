package CarRental;
import java.io.IOException;
import java.util.Scanner;


public class Van {

	Scanner scan = new Scanner(System.in);
    static public String[] transmissionType = new String[]{"Automatic","Manual"};
    static public String[] extra = new String[]{"Ladder","Roof Rack","Sat Nav"};
    static public int choice = 0;
    static public int choice2 = 0;
    
    public Van(){
    
    }
    static public void Question1() throws IOException
    {
          
                Scanner scan = new Scanner(System.in);
                System.out.println("Transmission Type");
                System.out.println("[1] Automatic");
                System.out.println("[2] Manual");
                System.out.println("[3] Exit");
                choice = 0;
                choice = scan.nextInt();
                switch(choice) { 
                      case 1 : break; 
                      case 2 : break;
                      case 3 : break;
                      default: 
                      System.out.println("Invalid response");
                      //return choice;
                      }//scan.close();
                Extras();
          }
    
    static public void Extras() throws IOException
    {
                Scanner scan = new Scanner(System.in);
                System.out.println("Extras");
                System.out.println("[1] Ladder ");
                System.out.println("[2] Roof Rack");
                System.out.println("[3] Sat Nav");
                System.out.println("[4] Nothing");
                choice2 = 0;
                choice2 = scan.nextInt();
                switch(choice2) { 
                      case 1 : break; 
                      case 2 : break;
                      case 3 : break;
                      case 4 : break;
                      default: 
                      System.out.println("Invalid response");
                      }//scan.close();
                      Display();
    }

    static public void Display() throws IOException
    {
                int x = choice -1;
                int y = choice2 -1;
                System.out.println("Van2");
                System.out.println("Transmission = " + transmissionType[x]);
                System.out.println("Extras = " + extra[y]);
                System.out.println("Price =  " + (250 + choice));
                Invoice.Thing();
    
    }
	
}
