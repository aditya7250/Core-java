package Assignment9;
class PXY{
int x=10;
PXY() {
System.out.println("Hi A");
}
PXY(int a) {
this();
System.out.println("Hello A");
x=a;
}
}
class WUV extends PXY{
WUV(int b) {
x=b;
System.out.println("Hi B");
}
}
public class InheritanceEx3 {

	public static void main(String[] args) {
WUV b=new WUV(5);
System.out.println(b.x);
PXY a=new PXY(3);
System.out.println(a.x);
}
}