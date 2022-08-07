import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
public class mycombobox {
    public static void main(String[] args) {
        JFrame f = new JFrame("JComboBox");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setSize(700,500);
        
        //aligning frame to center
        f.setLocationRelativeTo(null);;
        
        //defining container with our content pane
        Container c = f.getContentPane();
        c.setLayout(null);
        
        //JcomboBox 
        String values[] = {"A","B","C","D"};
        JComboBox<String> b1 = new JComboBox<>(values);
        b1.setBounds(100,100,100,30);
        b1.setSelectedIndex(1);;
        
        //to add items in the JCOMBOBOX
        b1.addItem("Arun");

        JButton btn = new JButton();
        btn.setText("Click");
        btn.setBounds(100,200,100,30);

        JLabel label = new JLabel("");
        label.setBounds(100,300,100,40);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String item = (String)b1.getSelectedItem();
                int idx = b1.getSelectedIndex();
                label.setText(item+" at index "+idx);
            }
        });

        c.add(label);
        c.add(btn);
        c.add(b1);
        
        b1.setEditable(true);
        f.setVisible(true);
    }
}
