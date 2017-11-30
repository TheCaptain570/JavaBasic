package intstackdemo;

public class NumberDisplay {
	private int value;
	private int limit;

	// Constructor sets upper limit for display
	public NumberDisplay(int rolloverLimit) {
		this.value = rolloverLimit;
	}
	
	// set display value (within limits)
	public void setValue(int newValue) {
		this.value = newValue;}
	
	// increment display value. Roll over if necessary.
	public void increment() {
		this.value++;
	}	

	// return display value
	public int getValue() {
		
		return this.value;
	}

	//return two digit display string. e.g. “09”, “23” etc.
	public String getDisplayValue() {
		return ""+this.value;
	}
}


