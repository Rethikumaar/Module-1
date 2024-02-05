import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String  USN;
	String Name;
	String department;
	System.out.println("enter USN ");
	USN=s.next();
	System.out.println("Enter name");
	Name=s.next();
	System.out.println("Enter department");
	department=s.next();
	
	System.out.println("USN:"+USN);
	System.out.println("Name:"+Name);
	System.out.println("Department:"+department);
	s.close();
	}

}
