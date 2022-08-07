import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JText {
    public static void main(String args[]){
        JFrame frame = new JFrame("JText tutrial");
        
        frame.setBounds(100,100,400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setBackground(Color.yellow);
        c.setLayout(null);
        JLabel label = new JLabel("Username  ");
        label.setBounds(10,10,450,100);
        c.add(label);

        JLabel l2 = new JLabel("Password  ");
        l2.setBounds(10,100,450,100);
        c.add(l2);

        JTextField field1= new JTextField("Enter Username ");
        field1.setBounds(100,40,200,30);
        c.add(field1);

        //how to set a password field 
        JPasswordField password = new JPasswordField("Password");
        password.setBounds(100,130,200,30);

        //setting passfield char 
        password.setEchoChar('*');
        c.add(password);

        //setting font to the Jtext area
        Font font = new Font("Arial",Font.BOLD,15);
        field1.setFont(font);

        Font passFont = new Font("Arial",Font.PLAIN,20);
        password.setFont(passFont);
        
        //to set the color of the text 
        field1.setForeground(Color.GRAY);
        password.setForeground(Color.GRAY);


        //Creating a button to register
        JButton btn = new JButton("Register");
        btn.setBounds(120,170,100,  50);
        btn.setBackground(Color.GRAY);
        btn.setForeground(Color.yellow);
        btn.setFont(font);

        //setting the cursor type for btn
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cursor);
        c.add(btn);
        

        //how to disable and enable a button
        btn.setEnabled(true);

        //how to restrrict user from editing a text in the text field
        // password.setEditable(false);

        frame.setVisible(true);
    }
}
