import java.awt.*;
import javax.swing.*;
public class Borderlyt{
    JFrame f;
    Borderlyt(){
        f=new JFrame();
        JButton b1=new JButton("1STBT");
        JButton b2=new JButton("2ND BT");
        JButton b3=new JButton("3RD BT");
        JButton b4=new JButton("4Th BT");
        JButton b5=new JButton("4Th BT");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main (String[] args){
        new Borderlyt();
    }
}
