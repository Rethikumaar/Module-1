import java.util.Scanner;
public class PerimeterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in); //enter the no.
		double radius=s.nextDouble();
		double perimeter;
		double area;
	if(radius<0)
	{
		System.out.println("please enter non zero positive number");
	}
	else
	{
		perimeter=2*Math.PI*radius;
		area=Math.PI*radius*radius;
		System.out.println(perimeter);
		System.out.println(area);
	}
	}

}
