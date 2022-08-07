import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class mycheckbox {
    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBoxtutorial");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);

        //defining container with our content pane

        Container c = f.getContentPane();
        c.setLayout(null);
        //checkbox tutorial

        JCheckBox b1 = new JCheckBox("High School");
        JCheckBox b2 = new JCheckBox("Intermediate");
        JCheckBox b3 = new JCheckBox("Graduation");
        JCheckBox b4 = new JCheckBox("Post Graduation");

        b1.setBounds(10,10,200,20);
        b2.setBounds(10,30,200,20);
        b3.setBounds(10,50,200,20);
        b4.setBounds(10,70,200,20);

        //setSelected method 
        //setEnabled method
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);

        f.setVisible(true);
    }
}
