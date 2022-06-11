package oops;

public class S2 {
void m(S2 obj){
	System.out.println("m");
}
void n(){
	m(this);
}
	public static void main(String[] args) {
S2 s1=new S2();
s1.n();
	}

}
