import java.util.Scanner; 
public class condition_if { 
public static void main(String[] args) { 
 int pwd; 
 System.out.println("enter password"); 
 Scanner s=new Scanner(System.in); 
 pwd=s.nextInt(); 
 if(pwd==12345) 
 { 
 System.out.println(" My name is Rao"); 
 System.out.println(" My age is 21"); 
 System.out.println("my phone number is 9757777777"); 
 
 } 
 else
 { 
 System.out.println(" Wrong password"); 
 } 
 
 }
}