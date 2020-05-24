package actors;

public class Student {
	
	public double g1,g2,g3;
	public String name;
	
	public double increaseGrade() {
		return g1+g2+g3;
	}
	
	public double missingPoints() {
		if (increaseGrade()<60.0) {
			return 60-increaseGrade();
		} else {
			return 0.0;
		}
	}
	

}
