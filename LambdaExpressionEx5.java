package NestedClass.AnonymousNestedClass;
@FunctionalInterface
interface Addition{
	int add(int a,int b);
}
public class LambdaExpressionEx5 {

	public static void main(String[] args) {
//		Addition a=(x,y)->{ return x+y;};
//		incapp(a);
		
		//or 
		
		incapp((x,y)->{ return x+y;});
	}
	static void incapp(Addition a) {
		System.out.println("Sum: "+a.add(9, 6));
	}
}