//Name- Pranjal Parmar
//19100BTIT06590
import java.awt.Dimension;
import javax.swing.*;

public class internal{

    public static void main(String[] args) {

        JFrame frame = new JFrame("");
        JLabel label = new JLabel("Pranjal Parmar [19100BTIT06590]");
        label.setVisible(false);
        JPanel panel = new JPanel();
        panel.add(label);

        JButton btn = new JButton("Show INFORMATION");
    btn.addActionListener(e -> {
        if (!label.isVisible()) {
            label.setVisible(true);
        }
    });
        panel.add(btn);
        frame.add(panel);
        frame.setSize(new Dimension(500, 500));

        frame.setVisible(true);
    }
}
