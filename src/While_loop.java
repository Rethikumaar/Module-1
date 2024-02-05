import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num>=0)
		{
			if(num%2==0)
			{
				System.out.println("Even number");
				break;
			}
			else
			{
				System.out.println("odd numder");
				break;
			}
		}
		System.out.println("Loop Endded");
		s.close();
	}

}
