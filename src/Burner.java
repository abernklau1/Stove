/*
 * @class Burner
 * @author Andrew Bernklau
 * @author Peyton Calvert
 * @collaborators
 * @source
 * 
 * Purpose: Simulates a single burner on a stove
 */

public class Burner {
	
	// Enum to hold temperature values
    public static enum Temperature {
        BLAZING,
        HOT,
        WARM,
        COLD;
    }
    
    // Each burner has a temperature, setting, and timer 
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;
    public static final int TIME_DURATION = 2;
    
    // Constructor to set myTemperature, mySetting, and timer to their default values
    public Burner(){
        myTemperature = Temperature.COLD;
        mySetting = Setting.OFF;
        timer = 0;
    }
    
    public Temperature getTemperature(){
        return this.myTemperature;
    }
    
    // Increases the value of the setting on the burner
	public void plusButton() {

		switch(mySetting){
            case OFF: mySetting = Setting.LOW; timer = TIME_DURATION; break;
            case LOW: mySetting = Setting.MEDIUM; break;
            case MEDIUM: mySetting = Setting.HIGH; break;
            case HIGH: break;
        }
	}
	
	// Decreases the value of the setting on the burner
	public void minusButton() {

        switch(mySetting){
            case OFF: break;
            case LOW: mySetting = Setting.OFF; break;
            case MEDIUM: mySetting = Setting.LOW; break;
            case HIGH: mySetting = Setting.MEDIUM; break;
        }
        timer = TIME_DURATION;
		
	}
	
	// Updates the temperature value depending on the timer, setting and temperature values
	public void updateTemperature() {

		// Every 2 'minutes' the temperature changes
        if (timer > 0){
            timer--;
        } 
        if (timer == 0){
        	
        	// Depending on the setting, the temperature may rise or lower or stay the same
            switch(mySetting){
                case OFF:
                    if(myTemperature == Temperature.BLAZING){
                        myTemperature = Temperature.HOT;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.HOT){
                        myTemperature = Temperature.WARM;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.WARM){
                        myTemperature = Temperature.COLD;
                        timer = TIME_DURATION;
                    }
                    else;
                    
                break;

                case LOW:
                    if(myTemperature == Temperature.BLAZING){
                        myTemperature = Temperature.HOT;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.HOT){
                        myTemperature = Temperature.WARM;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.COLD){
                        myTemperature = Temperature.WARM;
                        timer = TIME_DURATION;
                    }
                    else;
                break;
                
                case MEDIUM:
                    if(myTemperature == Temperature.BLAZING){
                        myTemperature = Temperature.HOT;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.WARM){
                        myTemperature = Temperature.HOT;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.COLD){
                        myTemperature = Temperature.WARM;
                        timer = TIME_DURATION;
                    }
                    else;
                break;

                case HIGH:
                    if(myTemperature == Temperature.HOT){
                        myTemperature = Temperature.BLAZING;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.WARM){
                        myTemperature = Temperature.HOT;
                        timer = TIME_DURATION;
                    }
                    else if(myTemperature == Temperature.COLD){
                        myTemperature = Temperature.WARM;
                        timer = TIME_DURATION;
                    }
                    else;
                break;
            }
        }
		
	}
	
	// Displays the setting of the burner
	public void display() {
		String stringRep = null;
		
		// Determine text trailing setting display
		switch(myTemperature){
            case COLD: stringRep = "cooool"; break;
            case WARM: stringRep = "warm"; break;
            case HOT: stringRep = "CAREFUL"; break;
            case BLAZING: stringRep = "VERY HOT! DON'T TOUCH"; break;
            default: break;
        }
		
		System.out.println(mySetting.toString() + "..." + stringRep);
	}
}
