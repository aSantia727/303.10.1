
public class Boy extends Person {
	static double ageFactor = 1.1;
	public Boy(String aName) {
		name = "Mr. " + aName;
	}
	public String talk() {
		return(super.talk() + "... but I love Java class.");
	}
	public String walk() {
		return("I am now walking");
	}
}
