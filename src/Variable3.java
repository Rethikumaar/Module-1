
public class Variable3 {
	int a=10;
	static double b = 20.5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean c =true;
		System.out.println("diferent type of variable");
		Variable3 sc = new Variable3();
		System.out.println("static variable: "+b );
		System.out.println("instance variable:" + sc.a);
		System.out.println("local variable:" + c);
		System.out.println(sc.a  +" "+b+" "+c);
	}

}
