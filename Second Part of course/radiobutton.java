import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
public class radiobutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        //How to use Radio Buttons
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(20,10,100,20);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(120,10,100,20);
        male.setSelected(true);

        male.setFont(new Font("sansserif",Font.ITALIC,16));
        female.setFont(new Font("sansserif",Font.ITALIC,16));

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        c.add(male);
        c.add(female);

        JRadioButton caste1 = new JRadioButton("General");
        caste1.setBounds(20,30,100,20);
        JRadioButton caste2 = new JRadioButton("OBC");
        caste2.setBounds(120,30,100,20);
        JRadioButton caste3 = new JRadioButton("SC");
        caste3.setBounds(220,30,100,20);
        JRadioButton caste4 = new JRadioButton("ST");
        caste4.setBounds(320,30,100,20);
        
        caste1.setSelected(true);
        caste3.setEnabled(false);
        ButtonGroup caste = new ButtonGroup();
        caste.add(caste1);
        caste.add(caste2);
        caste.add(caste3);
        caste.add(caste4);

        c.add(male);
        c.add(female);
        c.add(caste1);
        c.add(caste2);
        c.add(caste3);
        c.add(caste4);



        frame.setVisible(true);
    }
}
