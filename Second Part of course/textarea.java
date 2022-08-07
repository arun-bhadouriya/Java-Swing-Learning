import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
public class textarea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        JTextArea area = new JTextArea("Arun Bhadouriya is king.");
        area.setBounds(10,50,250,200);
        area.setLineWrap(true);
        area.setFont(new Font("sansserif",Font.BOLD,15));
        // area.setEditable(true);

        //How to use Radio Buttons
        c.add(area);   



        frame.setVisible(true);
    }
}
