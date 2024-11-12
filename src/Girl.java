
public class Girl extends Person {
	static double ageFactor = 1.3;
	public Girl(String aName) {
		name = "Ms. " + aName;
	}
	public String jump() {
		return("I am jumping.");
	}
	public static double lifeSpan() {
		return(LifeSpan * ageFactor);
	}
}
