package hibernateexample;

// Generated Dec 30, 2016 12:36:26 PM by Hibernate Tools 4.3.1

	public class Van  {
	    
	     private int id;
	     private String Transmission;
	     private String Extras;
	    

	    public Van() { }
	    public Van(String Transmission, String Extras) 
	    {
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
