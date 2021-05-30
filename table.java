import javax.swing.*;    
public class table {    
    JFrame f;    
    table(){    
    f=new JFrame();    
    String data[][]={ {"01","Amay","8.8"},    
                          {"02","Bhavya","7.8"},    
                          {"03","Pranjal","8.9"},    
                            {"04","Rudhresh","7.5"}};
    String column[]={"ID","NAME","CGPA"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
}     
public static void main(String[] args) {    
    new table();    
}    
}  
