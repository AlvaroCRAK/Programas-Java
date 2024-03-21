import java.awt.*;
import javax.swing.*;
public class NewWindow{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello world!");
    NewWindow(){
        label.setBounds(0, 0, 300, 50);
        label.setFont(new Font("MV boli", Font.PLAIN, 25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}