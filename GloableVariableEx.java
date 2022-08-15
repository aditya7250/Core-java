package FinalKeyWord;
class X{
	static final int a=45;//Global Variable
	static int b=20;//Class level variable
	static {
		System.out.println("Hello X");
	}
}
public class GloableVariableEx {

	public static void main(String[] args) {
		System.out.println(X.a);
		System.out.println(X.b);
	}
}