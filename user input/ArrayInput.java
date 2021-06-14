import java.util.Scanner;
public class ArrayInput{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of elements to store: ");
n=sc.nextInt();
int[] array = new int[10];
System.out.println("enter the elements of the array: ");
for(int i=0; i<n; i++)
{
array[i]=sc.nextInt();
}
System.out.println("array elements are: ");
for (int i=0; i<n; i++)
{
System.out.println(array[i]);
}
}
}