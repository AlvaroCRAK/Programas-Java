import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    ImageIcon icon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        icon = new ImageIcon("icon.png");
        this.setIconImage(icon.getImage());
        this.setTitle("Tetris");
        this.getContentPane().setBackground(Color.BLACK);

        loadIcon = new ImageIcon("file.png");
        loadIcon = new ImageIcon(loadIcon.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
        saveIcon = new ImageIcon("disk.png");
        saveIcon = new ImageIcon(saveIcon.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));
        exitIcon = new ImageIcon("door.jpg");
        exitIcon = new ImageIcon(exitIcon.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH));

        menuBar = new JMenuBar();
        menuBar.setBackground(Color.BLACK);

        fileMenu = new JMenu("File");
        fileMenu.setForeground(Color.white);
        editMenu = new JMenu("Edit");
        editMenu.setForeground(Color.white);
        helpMenu = new JMenu("help");
        helpMenu.setForeground(Color.white);

        loadItem = new JMenuItem("Load");
        loadItem.setBackground(Color.BLACK);
        loadItem.setForeground(Color.white);
        saveItem = new JMenuItem("Save");
        saveItem.setBackground(Color.BLACK);
        saveItem.setForeground(Color.white);
        exitItem = new JMenuItem("Exit");
        exitItem.setBackground(Color.BLACK);
        exitItem.setForeground(Color.white);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loadItem) System.out.println("You loaded a file");
        else if(e.getSource() == saveItem) System.out.println("You saved a file");
        else if(e.getSource() == exitItem) System.exit(0);
    }
}
