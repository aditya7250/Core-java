package Constructor;
class CCC{
	int x=10;
	//int y=20;
	void print() {
		System.out.println("Hello C");
	}
}
class D extends CCC {
	int y=20;
	int x=50;
	void m() {
		int z=40;
		int x=90;
		System.out.println(x);//90
		System.out.println(this.x);//50
		System.out.println(super.x);//10
		System.out.println(y);//20
		System.out.println(z);//40
		print();//Hello D
		this.print();//Hello D
		super.print();//Hello C
	}
	void print() {
		System.out.println("Hello D");
	}
}
public class SuperKeywordEx1 {

	public static void main(String[] args) {
		D d=new D();
		d.m();
		System.out.println(d.x);//50
		//System.out.println(d.super.x);//error
		System.out.println(d.y);//20
		//System.out.println(d.z);//error
		CCC c=new CCC();
		System.out.println(c.x);//10
	}
}