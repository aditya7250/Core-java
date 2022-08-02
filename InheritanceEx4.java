package Assignment9;
class G{
int x=10;
G() {
System.out.println("Hi A");
}
G(int a) {
this();
System.out.println("Hello A");
x=a;
}
}
class TY extends G{
int y;
TY() {
super(5);
System.out.println("Hi B");
}
TY(int b) {
x=y=b;
System.out.println("Hello B");
}
}
public class InheritanceEx4 {

	public static void main(String[] args) {
TY b= new TY();
TY b2= new TY(5);
System.out.println(b.x+"\t"+b.y);
System.out.println(b2.x+"\t"+b2.y);
}
}