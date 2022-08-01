package Assignment7;
		class Demo{
			static int x;
			int y;
			Demo() {
			System.out.println("Hello");
			x=20;
			y=10;
			}
			static{
			System.out.println("Hi");
			}
			}
		public class Constructor2 {

			public static void main(String[] args) {
			Demo d1= new Demo();
			Demo d2= new Demo();
			System.out.println(d1.x);
			System.out.println(d1.y);
			System.out.println(d2.x);
			System.out.println(d2.y);
			}
			}