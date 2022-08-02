package Inheritance;
class A {
	int x=10;
	static int z=10;
	private int g=60;
	void showG() {
		System.out.println(g);
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class B extends A{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		System.out.println(x);
		//System.out.println(g);//error
		showG();
	}
}
public class InheritanceEx1 {

	public static void main(String[] args) {
		A a=new A();
		a.x=15;
		a.z=15;
		System.out.println(a.x);//15
		System.out.println(a.z);//15
		a.m1();
		B b=new B();
		System.out.println(b.x);//10
		System.out.println(b.z);//15
		System.out.println(b.y);//20 
		//System.out.println(b.g);//error
		b.showG();
		b.m1();
		b.m2();
		
	}
}