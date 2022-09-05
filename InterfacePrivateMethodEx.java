package Interface;
interface A{
	void m();
	default void xyz() {
		System.out.println("A- XYZ");
		pqr();
		mno();
	}
	static void abc() {
		System.out.println("A- ABC");
		//pqr();//error
		mno();
	}
	private void pqr() {
		System.out.println("PQR");
	}
	private static void mno() {
		System.out.println("MNO");
	}
}
class X implements A{
	public void m() {
		System.out.println("Hello X");
		//mno(); //error
		//pqr(); //error
	}
}
public class InterfacePrivateMethodEx {

	public static void main(String[] args) {
		//A.mno(); //error
		A.abc();
		A a=new X();
		a.m();
		//a.mno(); //error
		//a.pqr(); //error
		a.xyz();
	}

}