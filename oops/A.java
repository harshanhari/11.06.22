package oops;

public class A {
void m() {
	System.out.println("m");
}
void n() {
	System.out.println("n");
	this.m();
}
}
