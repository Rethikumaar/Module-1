import java.util.Scanner;
public class Student1 {
String USN, Name, branch, phone;
void insertRecord(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the USN");
USN = sc.next();
System.out.println("Enter the name");
Name = sc.next();
System.out.println("Enter the Branch");
branch = sc.next();
System.out.println("Enter the Phone no");
phone = sc.next();
}
void displayRecord()
 {
System.out.println(USN + "\t" + Name + "\t" + branch + "\t" + phone);
 }
public static void main(String args[]) {
 int i,n;
Student1 s[] = new Student1[100];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
n = sc.nextInt();
for ( i = 0; i < n; i++)
{
System.out.println("Enter the Student Details");
 s[i] = new Student1();
 s[i].insertRecord();
 }
 System.out.println("#### Student Record ###");
 System.out.println("USN\t\tName\tBranch\tPhone Number");
 for (i = 0; i < n; i++)
 {
 s[i].displayRecord();
 }
 sc.close();
}
}