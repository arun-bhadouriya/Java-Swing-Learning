import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class eventHandling2{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,950,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c = frame.getContentPane();
        c.setLayout(null);
        JButton btn1 = new JButton("RED");
        btn1.setBounds(100,100,100,50);
        c.add(btn1);
        JButton btn2 = new JButton("YELOOW");
        btn2.setBounds(250,100,100,50);
        c.add(btn2);
        JButton btn3 = new JButton("GREEN");
        btn3.setBounds(400,100,100,50);
        c.add(btn3);

        //setting eventListener to buttons
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                c.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                c.setBackground(Color.YELLOW);
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                c.setBackground(Color.GREEN);
            }
        });
    }
}

