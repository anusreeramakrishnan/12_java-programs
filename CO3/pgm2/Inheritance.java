import java.util.Scanner;

class Employee{
int empid;
String name;
String address;
int salary;
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter empid:");
empid=sc.nextInt();
System.out.println("enter name:");
name=sc.next();
System.out.println("enter salary:");
salary=sc.nextInt();
System.out.println("enter address:");
address=sc.next();
}
}
class Teachers extends Employee{
String Department;
String Subject;
Teachers()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter Department:");
Department=sc.next();
System.out.println("enter Subject:");
Subject=sc.next();
}
void display()
{
System.out.println("empid:"+super.empid);
System.out.println("name:"+super.name);
System.out.println("address:"+super.address);
System.out.println("Salary:"+super.salary);
System.out.println("Department:"+Department);
System.out.println("Subject:"+Subject);
System.out.println();
}
}
public class Inheritance
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of Subjects:");
n=sc.nextInt();
Teachers obj[]=new Teachers[n];
for(int i=0;i<n;i++)
{
obj[i]=new Teachers();
}
for(int i=0;i<n;i++)
{
obj[i].display();
}
}
}


 
