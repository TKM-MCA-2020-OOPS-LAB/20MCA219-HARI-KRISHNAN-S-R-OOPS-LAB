import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="Q1.class" width=500 height=500></applet>*/
public class Q1 extends Applet{
       public void paint(Graphics g){		
               g.drawLine(35,35, 300, 35);
               g.drawRect(60, 70, 250, 50);
               g.drawOval(200, 200, 200, 180);
  }
}