import java.awt.event.*;
import javax.swing.*;
public class LaunchPage implements ActionListener{
    JButton button = new JButton("New Window");
    JFrame frame = new JFrame();
    LaunchPage(){
        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose();
            new NewWindow();
        }
    }
}