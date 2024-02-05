class ConDemo{
	int id;
	public ConDemo(int value)
	{
		id=value;
		System.out.println("Inside the Parameter Construct"+" "+"id value"+" "+value);
	}
}
public class ParameterisedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo obj=new ConDemo(10);
	}

}
