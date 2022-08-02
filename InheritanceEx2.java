package Assignment9;
class ACD{
int x;
ACD() {
this(2);
System.out.println("Hi A");
}
ACD(int a) {
x=a;
System.out.println("Hello A");
}
}
class BC extends ACD{
BC() {
System.out.println("Hi B");
}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
BC b=new BC();
System.out.println(b.x);
}
}