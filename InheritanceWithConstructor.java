package Inheritance;
class AAA {
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
	AAA() { 
		System.out.println("Hi A");
	}
}
class BBB extends AAA {
	int y=20;
	void m2() {
		System.out.println("Hello B");
	}
	BBB() { 
		System.out.println("Hi B");
	}
}
public class InheritanceWithConstructor {

	public static void main(String[] args) {
		BBB b1=new BBB();
		BBB b2=new BBB();
	}
}