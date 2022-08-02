package Constructor;
class PP{
	int x=10;
	void print(int x) {
		this.x=x;
		x++;
		System.out.println("Hello" +x);
	}
}
public class SuperKeywordEx2 {

	public static void main(String[] args) {
		PP p=new PP();
		p.print(40);
		System.out.println(p.x);
	}
}