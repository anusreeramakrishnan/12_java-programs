import java.awt.*;
import java.applet.*;
/*
<applet code="Maximum" width=400 height=400>
<param name=num1 value=25>
<param name=num2 value=50>
<param name=num3 value=100>
</applet>
*/
public class Maximum extends Applet {
String param;
int max;
public void init(){
setBackground(Color.yellow);
setForeground(Color.red);
}

public void start(){
param=getParameter("num1");
int a=Integer.parseInt(param);
param=getParameter("num2");
int b=Integer.parseInt(param);
param=getParameter("num3");
int c=Integer.parseInt(param);
if(a>b)
 {
   if(a>c)
    {
      max=a;
    }
   else
    {
      max=c;
    }
 }
else
 {
  if(b>c)
   {
     max=b;
   }
  else
   {
    max=c;
   }
  }
}

public void paint(Graphics g){
  g.drawString("Largest number: "+String.valueOf(max), 150, 150);
}
}