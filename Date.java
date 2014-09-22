
public class Date {
	//fields
	private int month;
	private int day;
	private int year;
	
	//constructor methods
	public Date(int mm, int dd, int yyyy){
		month = mm;
		day = dd;
		year = yyyy;
	}
	
	public Date(Date d){
		this.month = d.getMonth();
		this.day = d.getDay();
		this.year = d.getYear();
	}
	
	//setters and getters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString(){
		return (month+"/"+day+"/"+year);
	}

}
