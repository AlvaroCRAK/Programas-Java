public class Main{
    public static void main(String[] args){
        new Game();
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Game{
    JLabel label;
    JFrame frame;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        label = new JLabel();
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBounds(0, 0, 100, 100);

        leftAction = new LeftAction();
        upAction = new UpAction();
        rightAction = new RightAction();
        downAction = new DownAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);

        frame.add(label);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX() - 15, label.getY());
        }
    }
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY() - 15);
        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX() + 15, label.getY());
        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY() + 15);
        }
    }
}
