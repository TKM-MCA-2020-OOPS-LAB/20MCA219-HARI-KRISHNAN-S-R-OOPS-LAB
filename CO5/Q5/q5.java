import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class q5 extends Applet implements ActionListener{
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3;
Label l1,l2,l3;
       public void init(){
l1=new Label("Enter 1st num ");
l1.setBounds(100,40,100,20);
t1=new TextField();
t1.setBounds(210,40,100,20);
l2=new Label("Enter 2nd num");
l2.setBounds(100,80,100,20);
t2=new TextField();
t2.setBounds(210,80,100,20);
l3=new Label("Result");
l3.setBounds(100,120,100,20);
t3=new TextField();
t3.setBounds(210,120,100,20);
b1=new Button("add");
b1.setBounds(80,150,60,50);
b2=new Button("sub");
b2.setBounds(130,150,60,50);
b3=new Button("mul");
b3.setBounds(180,150,60,50);
b4=new Button("div");
b4.setBounds(230,150,60,50);
b5=new Button("mod");
b5.setBounds(280,150,60,50);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setLayout(null);
   }
 public void actionPerformed(ActionEvent e){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
      if(e.getSource()==b1){
      int s=a+b;
      t3.setText(String.valueOf(s));
      }
      if(e.getSource()==b2){
      t3.setText(String.valueOf(a-b));
      }
      if(e.getSource()==b3){
      t3.setText(String.valueOf(a*b));           
      }
      if(e.getSource()==b4){
      t3.setText(String.valueOf(a/b));           
      }
      if(e.getSource()==b5){
      t3.setText(String.valueOf(a%b));           
      }

   }
}
/*
<applet code="q5.class" width="500" height="300">
</applet>
*/