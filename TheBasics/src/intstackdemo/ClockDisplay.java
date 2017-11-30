package intstackdemo;

	public class ClockDisplay {
		  private NumberDisplay hours;
		  private NumberDisplay minutes;
		  private String displayString;
		  
	
	// constructor creates clock with specified time
	public ClockDisplay(int hour, int min) {
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		setTime(hour, min);		// set clock time
		updateDisplay(); 		// update display
	}

	// increment clock by one minute
	public void timeTick() {
		minutes.increment();		// increment minutes
		if (minutes.getValue() == 60) { // rollover
			hours.increment();	// increment hours
			minutes.setValue(0);
		}		// increment minutes
		if (hours.getValue() == 24) { // rollover
				hours.setValue(0);// increment hours
		}
		updateDisplay();		// update display
	}			
	public void setTime(int hour, int min) {
		hours.setValue(hour);
		minutes.setValue(min);
		updateDisplay();
	}
	  
	public String getTime() {
		return displayString;
	}

	private void updateDisplay() {
		displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
	}


}
