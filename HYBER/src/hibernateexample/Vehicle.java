package hibernateexample;

public class Vehicle {
    
    private int id;
    private int carcar;
    private int busbus;
    private int motorbikemotorbike;
    private int vanvan;
    private String Transmission;
    private String Extras;
   

   public Vehicle() { }
   public Vehicle(int carcar, int busbus, int motorbikemotorbike, int vanvan, String Transmission, String Extras) 
   {
	  this.carcar = carcar;
	  this.busbus = busbus;
	  this.motorbikemotorbike = motorbikemotorbike;
	  this.vanvan = vanvan;
      this.Transmission = Transmission;
      this.Extras = Extras;
   }
      
   public int getId() {
       return id;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   public String getTransmission() {
       return Transmission;
   }
   
   public void setcarcar(int carcar) {
       this.carcar = carcar;
   }  
   
   
   public int getcarcar() {
       return carcar;
   }

   public void setbusbus(int busbus) {
       this.busbus = busbus;
   }  
   
   
   public int getbusbus() {
       return busbus;
   }

   public void setmotorbikemotorbike(int motorbikemotorbike) {
       this.motorbikemotorbike = motorbikemotorbike;
   }  
   
   
   public int getmotorbikemotorbike() {
       return motorbikemotorbike;
   }
   public void setvanvan(int vanvan) {
       this.vanvan = vanvan;
   }  
   
   
   public int getvanvan() {
       return vanvan;
   }  
   
   
   
   public void setTransmission(String Transmission) {
       this.Transmission = Transmission;
   }   
   
   
   public String getExtras() {
       return Extras;
   }
   
   public void setExtras(String Extras) {
       this.Extras = Extras;
   }   
}
