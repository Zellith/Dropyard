
public class Course {
	//fields
	private String classCode;
	private double prelim;
	private double midterm;
	private double endterm;
	
	//constructors methods
	public Course(String classCode){
		this.classCode = classCode;
	}
	
	public Course(Course course){
		this.classCode = course.getClassCode();
		this.prelim = course.getPrelim();
		this.midterm = course.getMidterm();
		this.endterm = course.getEndterm();
	}

	//setters and getters
	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public double getPrelim() {
		return prelim;
	}

	public void setPrelim(double prelim) {
		this.prelim = prelim;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getEndterm() {
		return endterm;
	}

	public void setEndterm(double endterm) {
		this.endterm = endterm;
	}
	
	public String toString(){
		return ("Classcode: "+classCode+"\n"+"Prelim: "+
				prelim+"\n"+"Midterm: "+midterm+"\n"+
				"Endterm: "+endterm);
	}
	
}
