public enum Setting {
	OFF ("---"),
	LOW ("--+"),
	MEDIUM("-++"),
	HIGH("+++");

	public String settingRep;

	private Setting(String settingRep) {

		this.settingRep = settingRep;
	}
	
	public String toString() {
		return "[" + settingRep + "]";
	}
}




