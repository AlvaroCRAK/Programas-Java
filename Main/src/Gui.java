import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
public class Gui extends JFrame{
    Gui(){
        Border border = BorderFactory.createLineBorder(new Color(119, 255, 176), 10);
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon("sara.jpg");

        ImageIcon icon = new ImageIcon("icon.png");

        label.setText("Saramalacara");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(201, 255, 0));
        label.setFont(new Font("MV Boli", Font.PLAIN, 70));
        label.setIconTextGap(-50);
        label.setBackground(new Color(0, 0, 0));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.setTitle("Sara Malacara");
        this.setVisible(true);
        this.add(label);
        this.pack();
    }
}