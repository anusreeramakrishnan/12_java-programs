import java.util.Scanner;
class OddPosition
{
public static void main(String[]args)
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements to store");
n=sc.nextInt();
int a[]=new int[n];
int rev[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(" array elements in odd position");
for(i=0;i<n;i=i+2)
{
System.out.println(a[i]);
}
}
}