package NestedClass.AnonymousNestedClass;
@FunctionalInterface
interface ANM{
	void m();
}
public class LambdaExpressionEx1 {

	public static void main(String[] args) {
		//using anonymous class
//		A a=new A() {
//			public void m() {
//				System.out.println("INDIA");
//			}
//		};
		
		ANM a=()->{
			System.out.println("INDIA");
		};
		
		a.m();
	}

}