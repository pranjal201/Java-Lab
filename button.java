import java.awt.*;
import java.awt.event.*;

class button extends Frame
{
   public static void main(String args[])
   {
       button f = new button();   
    f.setSize(500,500);
    f.setVisible(true);
    f.setTitle("btn");
    f.setLayout(null);
    Button b = new Button("Pranjal");
    Button b2 = new Button("BUTTON");
    b.setBackground(Color.black);
    b.setForeground(Color.white);
    b.setBounds(50,50,80,60);
    b2.setBounds(200,80,80,30);
    f.add(b);
    f.add(b2);
   }
   


}
