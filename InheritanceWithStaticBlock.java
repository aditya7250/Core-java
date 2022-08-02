package Inheritance;
class AA{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
	static {
		System.out.println("Hi A");
	}
}
class BB extends AA {
	int y=20;
	void m2() {
		System.out.println("Hello B");
	}
	static {
		System.out.println("Hi B");
	}
}
public class InheritanceWithStaticBlock {

	public static void main(String[] args) {
		System.out.println("Hi main");
		AA a=new AA();
		BB b1=new BB();
		BB b2=new BB();
	}
}