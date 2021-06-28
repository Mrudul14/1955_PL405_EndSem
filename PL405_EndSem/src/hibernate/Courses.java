package hibernate;

public class Courses {
	
	String name;
	
	int isa1, isa2, isa3, endsem;


	public Courses(int isa1, int isa2, int isa3, int endsem) {
		super();
		this.isa1 = 0;
		this.isa2 = 0;
		this.isa3 = 0;
		this.endsem = 0;
	}


	public Courses(String string) {
		// TODO Auto-generated constructor stub
		
		name = string;
		
	}


	public void setMarks(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
		isa1 = i;
		isa2 = j;
		isa3 = k;
		endsem = l;
		
	}

}
