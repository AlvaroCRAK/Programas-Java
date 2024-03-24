import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyPanel extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 900;
    final int PANEL_HEIGHT = 900;
    Image enemy;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("veigar.png").getImage();
        timer = new Timer(1, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(x >= PANEL_WIDTH + 66 - enemy.getWidth(null) || x < - 66) xVelocity = xVelocity * - 1;
        x = x + xVelocity;
        if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) yVelocity = yVelocity * - 1;
        y = y + yVelocity;
        repaint();
    }
}