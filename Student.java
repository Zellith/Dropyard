
public class Student extends Person{
	//fields
	private String idNumber;
	private String cmy;
	private Course[] subject = new Course[3];
	
	//constructor methods
	public Student (String idNumber, Name studName) {
		super(studName);
		this.idNumber = idNumber;
	}
	
	public Student(Student stud){
		super(stud);
		this.idNumber = stud.getIdNumber();
		this.cmy = stud.getCmy();
	}
	
	//setters and getters
	
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getCmy() {
		return cmy;
	}

	public void setCmy(String cmy) {
		this.cmy = cmy;
	}

	public Course[] getSubject() {
		return subject;
	}

	public void setSubject(Course[] subject) {
		this.subject[0] = new Course(subject[0]);
		this.subject[1] = new Course(subject[1]);
		this.subject[2] = new Course(subject[2]);
	}

	public double computeAverage(int x){
		return ((subject[x].getPrelim()*.3)+(subject[x].getMidterm()*.3)+(subject[x].getEndterm()*.4));
	}
	
	public String toString(){
		return ("\nName: "+super.getName()+"\nStudent ID Nunber: "+idNumber+"\nCourse: "+cmy+
				"\nBirthDate: "+super.getBirthDate()+"\nSex: "+super.getSex()+
				"\nCivilStaus: "+super.getCivilStatus()+"\nCitizenship: "+super.getCitizenship()+
				"\nAddress: "+super.getAddress()+"\nHeight: "+super.getHeight()+
				"\nWeight: "+super.getWeight());
	}
}
