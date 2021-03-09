/* First AWT program 
 * date : 28/2/21
 *IT includes frame, button and text field
*   */
import java.awt.*;

public class Awt_1
{
    public static void main(String[] args)
    {
        Frame f= new Frame("My first frame");
        f.setLayout(new FlowLayout());
        Button b = new Button("Frame");
        Label l= new Label("Name");
        TextField tf =new TextField(20);
        
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
        }}
