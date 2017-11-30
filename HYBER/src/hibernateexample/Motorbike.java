package hibernateexample;

public class Motorbike {
	    
	     private int id;
	     private String EngineSize;
	     private String Extras;
	    

	    public Motorbike() { }
	    public Motorbike(String EngineSize, String Extras) 
	    {
	       this.EngineSize = EngineSize;
	       this.Extras = Extras;
	    }
	       
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getEngineSize() {
	        return EngineSize;
	    }
	    
	    public void setEngineSize(String EngineSize) {
	        this.EngineSize = EngineSize;
	    }   
	    
	    
	    public String getExtras() {
	        return Extras;
	    }
	    
	    public void setExtras(String Extras) {
	        this.Extras = Extras;
	    }   
	}
