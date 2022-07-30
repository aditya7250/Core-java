package Assignment5;
class A1{
private int x;
public void show() {
x++;
System.out.println(x);
}
}
public class OppEx3 {

	public static void main(String[] args) {
A1 a= new A1();
a.show();
A1 b= new A1();
a.show();
b.show();
}
}
