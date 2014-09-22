
public class Name {
	//fields
	private String first;
	private String middle;
	private String last;
	
	//constructors
	public Name(Name name){
		this.first = name.getFirst();
		this.middle = name.getMiddle();
		this.last = name.getLast();
	}
	
	public Name(String first, String middle, String last){
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	
	//setters and getters
	public void setFirst(String first){
		this.first = first;
	}
	
	public String getFirst() {
		return first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	public String toString(){
		return (first+" "+middle+" "+last);
	}
}
