import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener,MouseMotionListener{
    public int x_coordinate, y_coordinate;
     MouseDemo()
    {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    //Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You just clicked");
    }

    public void mousePressed(MouseEvent e){
        x_coordinate=e.getX();
        y_coordinate=e.getY();
        System.out.println("Mouse Click Coordinates x:" + x_coordinate+" y:"+y_coordinate);
    }

    //Override
    public void mouseReleased(MouseEvent e) {
    System.out.println("MouseReleased");
    }

    //Override
    public void mouseEntered(MouseEvent e) {
    System.out.println("Mouse entered");
    }

    //Override
    public void mouseExited(MouseEvent e) {
    System.out.println("Mouse Left");
    }


    public void mouseDragged(MouseEvent e){
        Graphics g =this.getGraphics();
        int x=e.getX(),y=e.getY();
        g.setColor(Color.RED);
        g.drawLine(x_coordinate,y_coordinate,x,y);
        x_coordinate=x;y_coordinate=y;
        
    }

    //Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String args[])
    {
        MouseDemo ch=new MouseDemo();
        ch.setTitle("Mouse Demo");
        ch.setSize(500,500);
        ch.setVisible(true);        
    }

}
