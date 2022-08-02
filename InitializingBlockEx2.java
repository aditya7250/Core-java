package Assignment8;
class Emp{
String name;
Emp() {
System.out.println("Hello Emp");
name="Rahul";
}
static{
System.out.println("Hi Emp");
}
{
System.out.println("I am Emp");
}
}
public class InitializingBlockEx2 {

	public static void main(String[] args) {
Emp e1= new Emp();
Emp e2= new Emp();
System.out.println(e1.name);
}
}