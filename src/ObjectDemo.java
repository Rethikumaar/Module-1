
public class ObjectDemo {

	public static void main(String[] args) {
		int a=10,b=20;
		int c;
		System.out.println("Hello this is my first program");
		ObjectDemo v1=new ObjectDemo();
		c=v1.add(20,20);
		System.out.println("The Mul of a and b is"+v1.mul(a,b));
		System.out.println("The sum of a and b is "+c);
	}
	int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
	int mul(int a,int b)
	{
		return a*b;
		
	}

}
