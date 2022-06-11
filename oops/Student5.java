package oops;

public class Student5 {
int id;
String name;
int age;
public Student5(int i,String n) {
	// TODO Auto-generated constructor stub
id=i;
name=n;
}
public Student5(int i,String n,int a) {
	id=i;
	name=n;
	age=a;
	// TODO Auto-generated constructor stub
}
void display() {
	System.out.println(id+" "+name+" "+age);
}
public static void main(String[] args) {
	Student5 s1=new Student5(501,"Akhil");
	Student5 s2=new Student5(502,"Benny",21);
	s1.display();
	s2.display();
	// TODO Auto-generated method stub

	}

}
