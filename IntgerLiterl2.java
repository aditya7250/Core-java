public class IntgerLiterl2 {
 static public void main(String[]args){
   int a = 104;
   System.out.println(a);
   int b = 0104;
   System.out.println(b);
   int c = 0x104;
   System.out.println(c);
   int d = 0b10;
   System.out.println(d);
   int x = 34_4_4_45_00;//Allowed
   System.out.println(x);
   /*int y = 08;
   int z = 09; *///error
  }
}
