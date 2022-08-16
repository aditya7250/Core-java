package NestedClass.AnonymousNestedClass;
@FunctionalInterface
interface Abce{
	void xyz();
}
public class LambdaExpressionEx6 {

	public static void main(String[] args) {
		Abce a=()-> System.out.println("Hello"); 
		a.xyz();
		a.xyz();
	}

}