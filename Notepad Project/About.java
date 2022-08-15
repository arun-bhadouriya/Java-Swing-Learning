import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame{
    About(){
        setTitle("About Notepad Application");
        setSize(400,300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon(getClass().getResource("titleImg.jpg"));
        ImageIcon ic = new ImageIcon(icon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        this.setIconImage(ic.getImage());
        setLayout(null);

        JLabel img = new JLabel(ic);
        img.setBounds(50,50,80,80);
        add(img);

        Font aboutFont = new Font(Font.SANS_SERIF,Font.BOLD,12);
        JLabel textLabel = new JLabel("<html>Welcome to Notepad<br> Notepad is a simple text editor for microsoft windows and a basic text editing program which enables computer users to create documnets.<br>All Right Reserved @2022</html>");
        textLabel.setBounds(50,150,300,100);
        textLabel.setFont(aboutFont);
        add(textLabel);
        setVisible(true);
    } 
    public static void main(String[] args) {
        new About();
    }   
}
