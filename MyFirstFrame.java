import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
class MyFirstFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        // frame.setSize(400,400); //to set size of the frame
        // frame.setLocation(500,100); //to set the location from left and top

        // Instead of setSize(width,height) and setLocation(x,y) { we can use frame.setBounds(x,y,width,height) }
        frame.setBounds(500,50,500,500);

        //this is how we set image icon of the applicaton
        ImageIcon icon = new ImageIcon("dp.jpg");
        frame.setIconImage(icon.getImage());
        
        //set background color of the application
        Container c = frame.getContentPane();
        c.setBackground(Color.GRAY);

        //restricting user from resizing Frame
        frame.setResizable(false);

        //setting title of the application
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}