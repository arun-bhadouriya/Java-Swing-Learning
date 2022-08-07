import java.awt.*;
import javax.swing.*;

public class myJBUTTON {
    public static void main(String[] args){
        JFrame frame = new JFrame("JBUTTON");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        

        Container c = frame.getContentPane();
        c.setLayout(null);

        //create a button

        //setting a image in the button
        ImageIcon icon = new ImageIcon("dp.jpg");

        JButton button = new JButton(icon);
        button.setText("Register");
        button.setSize(icon.getIconWidth(),icon.getIconHeight());
        button.setLocation(10,10);
        button.setEnabled(true);

        //setting a curson as hand in the button 
        Cursor crsr = new Cursor(Cursor.CROSSHAIR_CURSOR);
        button.setCursor(crsr);

        // button.setVisible(false);
        c.add(button);
        frame.setVisible(true); 
    }
}
