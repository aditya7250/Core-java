package Assignment9;
class A{
int x;
A() {
System.out.println("Hi A");
x=10;
}
}
class B extends A{
int y;
B() {
System.out.println("Hello B");
x=15;
}
void show(){
System.out.println(x);
System.out.println(y);
}
}
public class InheritanceEx1 {

	public static void main(String[] args) {
B b= new B();
b.show();
}
}