import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class RainbowWriter extends JFrame implements ActionListener{  
private JFrame f;  
private JButton back,fore;  
private JTextArea ta;  
RainbowWriter(){  
    this.back=new JButton("Background");  
    back.setBounds(10,400,190,30);  
    this.fore=new JButton("TextColor");  
    fore.setBounds(300,400,190,30);  
    ta=new JTextArea();  
    ta.setBounds(30,80,550,300);  
    Font font=new Font("Arial",Font.ITALIC,18);
    ta.setFont(font);
    
    this.back.addActionListener(this);
    this.fore.addActionListener(this);
    add(back);add(ta);add(fore);  
    setLayout(null);  
    setSize(600,600);  
    setVisible(true);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public void actionPerformed(ActionEvent e){  
    if(e.getSource() == back){
    Color c1=JColorChooser.showDialog(this,"Background",Color.CYAN);  
    ta.setBackground(c1);  
    }
    if(e.getSource() == fore){
    Color c=JColorChooser.showDialog(this,"TextColor",Color.BLACK);  
    ta.setForeground(c);  

    }
}
public static void main(String[] args) {  
    new RainbowWriter();  
}  
}  
