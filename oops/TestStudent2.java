package oops;

public class TestStudent2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();

		s1.id = 201;
		s1.name = "Harshan";
		System.out.println(s1.id + " " + s1.name);
		Student1 s2 = new Student1();
		s2.id = 202;
		s2.name = "Arya";
		System.out.println(s2.id + " " + s2.name);
	}

}
