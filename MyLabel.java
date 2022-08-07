import java.awt.*;

import javax.swing.*;
public class MyLabel {
    public static void main(String[] args){
        JFrame frame = new JFrame("JLabel");

        JLabel label = new JLabel("username : ");
        JLabel myAppTitle = new JLabel("WELCOME TO THE SNAKE GAME");

        //set font of the label 
        // ImageIcon img = new ImageIcon("snake.jpg");
        // label.setIcon(img);
        // Font font = new Font("Arial",Font.ITALIC,30);
        // myAppTitle.setFont(font);
        myAppTitle.setBounds(5,-10,900,100);
        myAppTitle.setForeground(Color.GRAY);
        label.setBounds(10,10,450,100);
        
        frame.add(label);
        frame.add(myAppTitle);

        frame.setLayout(null);
        
        frame.setBounds(200,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        Container c = frame.getContentPane();
        c.setBackground(Color.RED);
        
        frame.setVisible(true);
    }
}
