package oops;

public class Employee {
	int id;
	String name;

	Employee() {// default constructor//
		System.out.println("Default constractor");
	}

	Employee(int i/* 1 argument */) {
		id = i;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	Employee(int id, String name/* 2 arguments */) {
		this.id = id;
		this.name = name;//this keyword is used when static and arg variables are same// 
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(2001);
		e2.display();
		Employee e3 = new Employee(2002, "Arun");
		e3.display();

	}

}
