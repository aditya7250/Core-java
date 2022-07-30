package Assignment5;
class Animal{
String name;
private int age;
String color;
void input() {
name="xyz";
age=15;
}
void show() {
System.out.println(name+age+color);
}
}
public class OppEx2 {

	public static void main(String[] args) {
	
Animal a= new Animal();
a.show();
a.input();
Animal b= new Animal();
a.show();
b.show();
}
}