package String;
public class StringEx11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Rahul");//String is Immutable
		s1.concat("Incapp");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Rahul");//StringBuilder is Mutable
		s2.append("Incapp");
		System.out.println(s2);
	}
}