package Constructor;
class C{
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	C(String a,int b){
		System.out.println("Hello A");
		x=a;
		y=b;
	}
	C(String a){
		this("KK",80);
		System.out.println("Ok A");
		x=a;
	}
}
public class Initializeblock3 {

	public static void main(String[] args) {
		C a=new C("GG");
		a.show();
	}
}