import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
import java.awt.Container;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    private Container c;
    JTextField user;
    JPasswordField pass;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        
        c= this.getContentPane();
        c.setLayout(null);
        JLabel label1= new JLabel("UserName :");
        JLabel label2= new JLabel("PassWord :");
        label1.setBounds(100, 100, 100, 50);
        label2.setBounds(100, 130, 100, 50);

        c.add(label1);
        c.add(label2);

        user = new JTextField();
        pass = new JPasswordField();
        user.setBounds(180,120,100,20);
        pass.setBounds(180,150,100,20);
        c.add(user);
        c.add(pass);

        JButton btn1 = new JButton("SignUp");
        btn1.setBounds(150,180,100,20);
        c.add(btn1);
        this.setVisible(true);
        btn1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(user.getText());
        System.out.println(pass.getPassword());
    }
}
public class LoginForm {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
