/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateExample {
    private static SessionFactory factory;
    private static ServiceRegistry registry;
    private static Scanner in = new Scanner(System.in);
   
    public static void main(String[] args) {
        try{
           // factory = new Configuration().configure().buildSessionFactory();
            Configuration configuration = new Configuration().configure();
            registry = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            factory = configuration.buildSessionFactory(registry);
        }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
//------------------------------------------------------------------------------------------------       
      HibernateExample HE = new HibernateExample();
      String more = "yes";
      employeeIDs employ;
  
      /* Add few employee records in database */
      while(more.charAt(0) == 'y' || more.charAt(0) =='Y')
      {
  		int choice = 0;
  		while(choice != 5){
  		Scanner scan = new Scanner(System.in);
  		System.out.println("Pick a Vehicle type");
  		System.out.println("[1] Bus");
  		System.out.println("[2] Car");
  		System.out.println("[3] Motorbike");
  		System.out.println("[4] Van");
 		System.out.println("[5] Exit");
  		choice = scan.nextInt();
  		switch(choice) { 
      case 1 :employ = HE.addBus(); break; 
      case 2 :employ = HE.addCar(); break;
      case 3 :employ = HE.addMotorbike(); break;
      case 4 :employ = HE.addVan(); break;
      case 5 : break; 
      default: 
          System.out.println("Invalid response");
  			}
  		
    	  
    	  
          //empID = HE.addEmployee();
         // System.out.println("More employees? (y/n)");
         // more = in.nextLine();
      }
        //empID = HE.addEmployee();
        System.out.println("More employees? (y/n)");
        more = in.nextLine();
      //HE.listEmployees();    
      StandardServiceRegistryBuilder.destroy(registry);
      }
   }
    
    
//-----------------------------------------------------------------------------------------------
   /* Method to CREATE an employee in the database */
   public employeeIDs addBus(){
       
	   	String Transmission = "";
	   	String Extra = "";
 		int choice = 0;
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Pick Transmission type");
 		System.out.println("[1] Automatic");
 		System.out.println("[2] Manual");
 		choice = scan.nextInt();
 		switch(choice) { 
     case 1 : Transmission = "Automatic" ; break; 
     case 2 : Transmission = "Manual"; break; 
     default: 
         System.out.println("Invalid response");}
 		choice = 0;
 		System.out.println("Pick Extras type");
 		System.out.println("[1] Nothing");
 		System.out.println("[2] Luggage Storage");
 		System.out.println("[3] SatNav");
 		
 		choice = scan.nextInt();
 		switch(choice) { 
     case 1 : Extra = "Nothing" ; break; 
     case 2 : Extra = "Luggage Storage"; break; 
     case 3 : Extra = "SatNav"; break; 
     default: 
         System.out.println("Invalid response");}	   
	   
     
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      Integer employeeID2 = null;
      try{
         tx = session.beginTransaction();
         Bus bus = new Bus(Transmission, Extra);//---------------------

         employeeID = (Integer) session.save(bus);
         
         int aa =0;
         int bb =employeeID;
         int cc =0;
         int dd =0;
         Vehicle vehicle = new Vehicle(aa,bb,cc,dd, Transmission, Extra);
         employeeID2 = (Integer) session.save(vehicle);         
         
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      employeeIDs hhhh = new employeeIDs();
      hhhh.employeeID = employeeID;
      hhhh.employeeID2 = employeeID2;
      return hhhh;
   }
  //--------------------------------------------------------------
   public employeeIDs addCar(){
       
	   	String Transmission = "";
	   	String Extra = "";
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick Transmission type");
		System.out.println("[1] Automatic");
		System.out.println("[2] Manual");
		choice = scan.nextInt();
		switch(choice) { 
    case 1 : Transmission = "Automatic" ; break; 
    case 2 : Transmission = "Manual"; break; 
    default: 
        System.out.println("Invalid response");}
		choice = 0;
		System.out.println("Pick Extras type");
		System.out.println("[1] Nothing");
		System.out.println("[2] CarSeat");
		System.out.println("[3] SatNav");
		
		choice = scan.nextInt();
		switch(choice) { 
    case 1 : Extra = "Nothing" ; break; 
    case 2 : Extra = "CarSeat"; break; 
    case 3 : Extra = "SatNav"; break; 
    default: 
        System.out.println("Invalid response");}
    
     Session session = factory.openSession();
     Transaction tx = null;
     Integer employeeID = null;
     Integer employeeID2 = null;
     try{
        tx = session.beginTransaction();
        Car car = new Car(Transmission, Extra);//---------------------

        employeeID = (Integer) session.save(car);
        int aa =employeeID;
        int bb =0;
        int cc =0;
        int dd =0;
        Vehicle vehicle = new Vehicle(aa,bb,cc,dd, Transmission, Extra);
        employeeID2 = (Integer) session.save(vehicle);
        tx.commit();
     }catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     }finally {
        session.close(); 
     }
     employeeIDs hhhh = new employeeIDs();
     hhhh.employeeID = employeeID;
     hhhh.employeeID2 = employeeID2;
     return hhhh;
  }
   //--------------------------------------------------------------
   public employeeIDs addMotorbike(){
       
	   	String EngineSize = "";
	   	String Extra = "";
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick Engine Size type");
		System.out.println("[1] 50cc");
		System.out.println("[2] 100cc");
		System.out.println("[3] 200cc");
		System.out.println("[4] 2000000cc");
		choice = scan.nextInt();
		switch(choice) { 
   case 1 : EngineSize = "50cc" ; break; 
   case 2 : EngineSize = "100cc"; break; 
   case 3 : EngineSize = "200cc" ; break; 
   case 4 : EngineSize = "2000000cc"; break; 
   default: 
       System.out.println("Invalid response");}
		choice = 0;
		System.out.println("Pick Extras type");
		System.out.println("[1] Nothing");
		System.out.println("[2] Helmet");
		
		choice = scan.nextInt();
		switch(choice) { 
   case 1 : Extra = "Nothing" ; break; 
   case 2 : Extra = "Helmet"; break; 
   default: 
       System.out.println("Invalid response");}
    
     Session session = factory.openSession();
     Transaction tx = null;
     Integer employeeID = null;
     Integer employeeID2 = null;
     try{
        tx = session.beginTransaction();
        Motorbike motorbike = new Motorbike(EngineSize, Extra);//---------------------

        employeeID = (Integer) session.save(motorbike);
        int aa =0;
        int bb =0;
        int cc =employeeID;
        int dd =0;
        Vehicle vehicle = new Vehicle(aa,bb,cc,dd, EngineSize, Extra);
        employeeID2 = (Integer) session.save(vehicle);        
        tx.commit();
     }catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     }finally {
        session.close(); 
     }
     employeeIDs hhhh = new employeeIDs();
     hhhh.employeeID = employeeID;
     hhhh.employeeID2 = employeeID2;
     return hhhh;
  }
   
   //--------------------------------------------------------------
   public employeeIDs addVan(){
       
	   	String Transmission = "";
	   	String Extra = "";
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick Transmission type");
		System.out.println("[1] Automatic");
		System.out.println("[2] Manual");
		choice = scan.nextInt();
		switch(choice) { 
   case 1 : Transmission = "Automatic" ; break; 
   case 2 : Transmission = "Manual"; break; 
   default: 
       System.out.println("Invalid response");}
		choice = 0;
		System.out.println("Pick Extras type");
		System.out.println("[1] Nothing");
		System.out.println("[2] Ladder");
		System.out.println("[3] SatNav");
		
		choice = scan.nextInt();
		switch(choice) { 
   case 1 : Extra = "Nothing" ; break; 
   case 2 : Extra = "Ladder"; break; 
   case 3 : Extra = "SatNav"; break; 
   default: 
       System.out.println("Invalid response");}
    
     Session session = factory.openSession();
     Transaction tx = null;
     Integer employeeID = null;
     Integer employeeID2 = null;
     try{
        tx = session.beginTransaction();
        Van van = new Van(Transmission, Extra);//---------------------

        employeeID = (Integer) session.save(van);
        int aa =0;
        int bb =0;
        int cc =0;
        int dd =employeeID;
        Vehicle vehicle = new Vehicle(aa,bb,cc,dd, Transmission, Extra);
        employeeID2 = (Integer) session.save(vehicle);         
        tx.commit();
     }catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     }finally {
        session.close(); 
     }
     employeeIDs hhhh = new employeeIDs();
     hhhh.employeeID = employeeID;
     hhhh.employeeID2 = employeeID2;
     return hhhh;
  }
   
   public class employeeIDs{
	   int employeeID ;
	   int employeeID2;
   }
   /* Method to print all the employees */
  /* public void listBus(){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
  
        List buses = session.createQuery("FROM Bus").list();//--------------------------
         for (Iterator iterator1 = 
            buses.iterator(); iterator1.hasNext();){
            Bus bus = (Bus) iterator1.next();  //----------------------------
            System.out.println("Transmission: " + bus.getTransmission()); 
            System.out.println("  Extra: " + bus.getExtras()); 
     
            }   
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }*/
}