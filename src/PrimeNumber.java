import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the number");
		int n=s.nextInt();
		m=n-1;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime number");
		}
		else
		{
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+"is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n+"is a prime number");
		}
		s.close();
		}
	}


