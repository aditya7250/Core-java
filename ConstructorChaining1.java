package Constructor;
class Bird{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Bird(String n,int a){
		this();//constructor chaining statement
		System.out.println("Hello Bird");
		name=n;
		age=a;
	}
	Bird(){
		System.out.println("Hi Bird");
	}
}
public class ConstructorChaining1 {

	public static void main(String[] args) {
		Bird b1=new Bird("Gogo",5);
		b1.show();
	}
}