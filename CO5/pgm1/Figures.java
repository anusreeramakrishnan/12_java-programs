import java.awt.*;
import java.applet.*;
/*
<applet code="Figures" width=400 height=200>
</applet>
*/
public class Figures extends Applet {
public void paint(Graphics g) {
g.drawLine(200,20,250,180);
g.fillRect(90,20,40,50);
g.fillOval(20,20,40,40);
}
}