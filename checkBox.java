public class Main{
    public static void main(String[] args){
        new MyFrame();
    }
}
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    ImageIcon mal;
    ImageIcon check;
    ImageIcon image;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        mal = new ImageIcon("mal.png");
        check = new ImageIcon("check.png");
        image = new ImageIcon("icon.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("MV boli", Font.PLAIN, 35));
        checkBox.setIcon(mal);
        checkBox.setSelectedIcon(check);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}
