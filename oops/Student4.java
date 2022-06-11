package oops;

public class Student4 {
int id;
String name;
Student4(int i,String n){
	id=i;
	name=n;
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student4 s1=new Student4(101,"Arun");
Student4 s2=new Student4(102,"Bobby");
s1.display();
s2.display();
	}

}
