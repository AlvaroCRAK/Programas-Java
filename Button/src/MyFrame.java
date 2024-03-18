import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {
        //ImageIcon imageHappy = new ImageIcon("feliz.png");
        //ImageIcon imageSad = new ImageIcon("triste.png");

        label = new JLabel();
        //label.setIcon(imageHappy);
        label.setText("Vivir se vuelve m`as llevadero!");
        label.setBounds(10, 150, 600, 50);
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setForeground(Color.magenta);
        label.setVisible(false);
        label.setBorder(BorderFactory.createCompoundBorder());
        label.setBackground(Color.cyan);
        label.setOpaque(true);

        button = new JButton();
        button.setBounds(10, 250, 400, 50);
        button.addActionListener(this);
        button.setText("Cuando dices mi nombre");
        //button.setIcon(imageSad);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("MV Boli", Font.PLAIN, 30));
        //button.setIconTextGap(-5);
        button.setForeground(Color.red);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEmptyBorder());


        this.setLayout(null);
        this.setSize(550, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}