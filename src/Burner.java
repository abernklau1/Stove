// Package not detected, please report project structure on CodeTogether's GitHub Issues

public class Burner {
    public static enum Temperature {
        BLAZING,
        HOT,
        WARM,
        COLD;
    }
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;
    public static final int TIME_DURATION = 2;
    
    public Burner(){
        myTemperature = Temperature.COLD;
        mySetting = Setting.OFF;
        timer = 0;
    }
	public void plusButton() {
		// TODO Auto-generated method stub
		switch(mySetting){
            case OFF: mySetting = Setting.LOW; timer = TIME_DURATION; break;
            case LOW: mySetting = Setting.MEDIUM; break;
            case MEDIUM: mySetting = Setting.HIGH; break;
            case HIGH: break;
        }
	}
	public void minusButton() {
		// TODO Auto-generated method stub
        switch(mySetting){
            case OFF: break;
            case LOW: mySetting = Setting.OFF; break;
            case MEDIUM: mySetting = Setting.LOW; break;
            case HIGH: mySetting = Setting.MEDIUM; break;
        }
        timer = TIME_DURATION;
		
	}
	public void updateTemperature() {
		// TODO Auto-generated method stub

        if (timer > 0){
            timer--;
        } 
        if (timer == 0){
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
	
	public void display() {
		String stringRep = null;
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
