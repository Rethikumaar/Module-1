import java.util.Scanner;
public class Contion_esleif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter marks");
		Scanner s=new Scanner(System.in);
		marks=s.nextInt();
		if(marks>=60 && marks<=100)
			System.out.println("First class");
		else if(marks>=50 && marks<=59)
			System.out.println("2nd class");
		else if(marks>=40 && marks<=58)
			System.out.println("pass");
		else if(marks>=35 && marks<=39)
			System.out.println("poor");
		else 
			System.out.println("fail");
	}

}
