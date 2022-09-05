package Interface;
interface I{
	int x=10;
	void m() ;
	default void xyz() {
		System.out.println("I- XYZ");
	}
	static void incapp() {
		System.out.println("INCAPP");
	}
}
interface J{
	void m2() ;
	default void xyz() {
		System.out.println("J- XYZ");
	}
}
class ABC{
	public void xyz() {
		System.out.println("Abc- XYZ");
	}
}
class M extends ABC implements I{
	public void m() {
		System.out.println("Hello M");
		System.out.println(x);
		xyz();
		//incapp();//error
		I.incapp();
	}
}
class N implements I,J{
	public void m() {
		System.out.println("Hello N");
		xyz();
	}
	public void m2() {
		System.out.println("Hi N");
		xyz();
	}
	public void xyz() {
		System.out.println("N- XYZ");
	}
}
public class InterfaceDefaultStaticMethodEx {

	public static void main(String[] args) {
		System.out.println(I.x);
		I.incapp();
		I i=new M();
		i.m();
		i.xyz();
		i=new N();
		i.m();
		i.xyz();
		M m=new M();
		m.m();
		m.xyz();
		System.out.println(m.x);
		//m.incapp();//error
	}
}