public class Main{
    public static void main(String[] args){
        new MyFrame();
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hotdogIcon;
    ImageIcon hamburgerIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.jpg");
        hamburgerIcon = new ImageIcon("hamburger.jpg");
        hotdogIcon = new ImageIcon("hotdog.jpg");

        pizzaButton = new JRadioButton();
        hotdogButton = new JRadioButton();
        hamburgerButton = new JRadioButton();

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == pizzaButton) System.out.println("You ordered pizza!");
        else if(e.getSource() == hamburgerButton) System.out.println("You ordered a hamburger!");
        else if(e.getSource() == hotdogButton) System.out.println("You ordered a hotdog!");
    }
}
