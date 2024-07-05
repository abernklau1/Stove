/*
 * @enum Setting
 * @author Andrew Bernklau
 * @author Peyton Calvert
 * @collaborators
 * @source
 * 
 * Purpose: This enum contains data that helps simulate the setting of a burner on a stove
 */


public enum Setting {
	
	// Each burner has 4 setting values w/ string representations
	OFF ("---"),
	LOW ("--+"),
	MEDIUM ("-++"),
	HIGH ("+++");

	// String representation of the setting
	private String settingRep;

	// Constructor that sets the string representation
	private Setting(String settingRep) {
		this.settingRep = settingRep;
	}
	
	public String toString() {
		return "[" + settingRep + "]";
	}
}




