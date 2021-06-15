import java.util.Scanner;
public class NoElements
{
public static void main(String args[])
{
int n,i=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements to store: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter number of elements of array: ");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
count=count+1;
}
System.out.println("number of elements in the array: "+a.length);
System.out.println(count);
}
}
