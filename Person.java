
public class Person {
	//fields
	private Name name;
	private Date birthDate;
	private char sex;
	private char civilStatus;
	private String citizenship;
	private String address;
	private double height;
	private double weight;
	
	//constructor methods
	public Person(Name name){
		this.name = name; 
	}
	
	public Person(Person tao){
		this.name = tao.getName();
		this.birthDate = tao.getBirthDate();
		this.sex = tao.getSex();
		this.civilStatus = tao.getCivilStatus();
		this.citizenship = tao.getCitizenship();
		this.address = tao.getAddress();
		this.height = tao.getHeight();
		this.weight = tao.getWeight();
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(char civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	public int computeAge(int currentYear){
		return (currentYear - birthDate.getYear());
	}
	
	public String toString(){
		return ("Name: "+name.toString()
				+ "\nBirthDate: " + birthDate.toString()
				+ "\nSex: " + sex +"\nCivil Staus: " +civilStatus
				+ "\nAddress: " + address + "\nHeight: " + height
				+ "\nWeight: " + weight);
	}
	
}
