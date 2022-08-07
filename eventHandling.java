import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    private Container c ;
    MyFrame(){
        this.setVisible(true);
        this.setBounds(100,100,900,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("DOSomething");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e ){
        c.setBackground(Color.GREEN);
    }
}
public class eventHandling{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        
    }
}

