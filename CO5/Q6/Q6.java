package choice;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class choice extends Applet implements ItemListener {

    Choice choice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection;

    public void init()
    {
        // Create the choice and add some choices
        choice = new Choice();
        choice.addItem("Select your desired shape");
        choice.addItem("Rectangle");
        choice.addItem("Triangle");
        choice.addItem("Square");
        choice.addItem("Circle");
        add(choice);
        choice.addItemListener(this);
    }

    public void itemStateChanged (ItemEvent e)
    {
        // set new selection index
        Selection = choice.getSelectedIndex();
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        if (Selection == 1)
        {

            g.drawRect(60,60,200,200);
        }
        if (Selection == 2)
        {
            g.drawLine(120, 130, 280, 130);
            g.drawLine(120, 130, 200, 65);
            g.drawLine(200, 65, 280, 130);
        }
        if (Selection == 3)
        {

            g.drawRect(150,150,100,100);
        }
        if (Selection ==4)
        {

            g.drawOval(150,150,140,140);
        }
    }
}