/*
 * Making A button color changer*/
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ColorChanger extends JFrame implements ActionListener{

  private JButton red,blue,green,yellow,original;
  private JLabel label;

  public ColorChanger()
  {
    
    original = new JButton("original");
    original.addActionListener(this);
    add(original);

    yellow = new JButton("Yellow");
    yellow.addActionListener(this);
    add(yellow);

    red = new JButton("red");
    red.addActionListener(this);
    add(red);

    green = new JButton("green");
    green.addActionListener(this);
    add(green);
    
    blue = new JButton("blue");
    blue.addActionListener(this);
    add(blue);

    setLayout(new FlowLayout());
    setSize(700,700);
    setTitle("COLOR_CHANGER-BY PP");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    label = new JLabel("Select a Color");
    add(label);

  }

  public static void main(String[] args)
  {
    new ColorChanger();
  }

  // OVERIDING ACTION PERFORMED METHOD
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == original)
    {
      label.setText("Default Color");
      getContentPane().setBackground(Color.WHITE);
    }
    if(e.getSource() == yellow)
    {
      label.setText("Yello selected");
      getContentPane().setBackground(Color.YELLOW);

    }

    if (e.getSource() == red)
    {
      label.setText("red selected");
      getContentPane().setBackground(Color.RED);

    }

    if (e.getSource() == green)
    {
      label.setText("green selected");
      getContentPane().setBackground(Color.GREEN);
    }

    if(e.getSource() == blue)
    {
      label.setText("blue selected");
      getContentPane().setBackground(Color.BLUE);
    }
  }
} 
