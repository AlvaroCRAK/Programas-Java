public class Main{
    public static void main(String[] args){
        new MyFrame();
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements KeyListener{
    ImageIcon icon;
    ImageIcon image;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("icon.png");
        image = new ImageIcon("cohete.png");
        image = new ImageIcon(image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(image);

        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX() - 10, label.getY()); break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10); break;
            case 'd': label.setLocation(label.getX() + 10, label.getY()); break;
            case 's': label.setLocation(label.getX(), label.getY() + 10); break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX() - 10, label.getY()); break;
            case 38: label.setLocation(label.getX(), label.getY() - 10); break;
            case 39: label.setLocation(label.getX() + 10, label.getY()); break;
            case 40: label.setLocation(label.getX(), label.getY() + 10); break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
