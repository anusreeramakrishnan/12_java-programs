class Complex{
int real;
int img;
void add (int a,int b,int c,int d){
real=a+c;
img=b+d;
System.out.println("complex numbres after addition is:"+real+"+"+img+"i");
}
}
class ComplexAdd{
public static void main(String args[]){
Complex c=new Complex();
c.add(4,5,6,7);
}
}