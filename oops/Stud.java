package oops;

public class Stud {
	int id;
	String name,course;
	float fees;

	Stud(int id, String name, float fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;

	}
	public Stud(int id,String name,float fees,String course) {
	this(id,name,fees);
	this.course=course;
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(id + " " + name + " " + fees+" "+course);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1 = new Stud(101, "Arun", 2000f);
		Stud s2 = new Stud(102, "Boss", 3000f,"Java");
		s1.display();
		s2.display();
	}

}
