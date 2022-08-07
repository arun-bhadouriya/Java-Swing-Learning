import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{

    JTextField input1,input2; 
    JLabel l1,l2;
    JButton add,sub,mul,div;
    JLabel result;
    Container c;
   
    MyFrame() {
        this.setTitle("Simple Calculator");
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //label for two inputs
        l1 = new JLabel("First Number : ");
        l2 = new JLabel("Second Number :");
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,70,100,20);

        //adding buttons to calculator (add,mul,sub,div)
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");

        add.setBounds(10,100,50,20);
        sub.setBounds(70,100,50,20);
        mul.setBounds(130,100,50,20);
        div.setBounds(190,100,50,20);

        //adding actionListener on these buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        //inputs for two numbers
        input1 = new JTextField();
        input2 = new JTextField();
        input1.setBounds(110,50,100,20);
        input2.setBounds(110,70,100,20);

        //Result Label for calculator
        result = new JLabel("Result : ");
        result.setBounds(10,130,500,20);
        
        //declaring container for calculator
        c = this.getContentPane();
        c.setLayout(null);
        c.add(input1);
        c.add(input2);
        c.add(l1);
        c.add(l2);
        c.add(add);
        c.add(mul);
        c.add(sub);
        c.add(div);
        c.add(result);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
            //add functionality
            float num1=0,num2=0;
            if(input1.getText()!=null){
                num1 = Float.valueOf(input1.getText());
            }
            if(input2.getText()!=null){
                num2 = Float.valueOf(input2.getText());
            }
            String resultText = "Result : ";
            if(num1>=0 && num2>=0) resultText+=(num1+num2);
            result.setText(resultText);
        }else if(e.getSource() == div){
            //divide functionality
            float num1=0,num2=0;
            if(input1.getText()!=null){
                num1 = Float.valueOf(input1.getText());
            }
            if(input2.getText()!=null){
                num2 = Float.valueOf(input2.getText());
            }
            String resultText = "Result : ";
            if(num1>=0 && num2>=0 && num2>0) resultText+=(num1/num2);
            else resultText+= "Add valid inputs please. ";
            result.setText(resultText);
        }else if(e.getSource() == mul){
            //multiply functionality
            float num1=0,num2=0;
            if(input1.getText()!=null){
                num1 = Float.valueOf(input1.getText());
            }
            if(input2.getText()!=null){
                num2 = Float.valueOf(input2.getText());
            }
            String resultText = "Result : ";
            if(num1>=0 && num2>=0) resultText+=(num1*num2);
            result.setText(resultText);
        }else{
            //subtract functionality
            float num1=0,num2=0;
            if(input1.getText()!=null){
                num1 = Float.valueOf(input1.getText());
            }
            if(input2.getText()!=null){
                num2 = Float.valueOf(input2.getText());
            }
            String resultText = "Result : ";
            if(num1>=0 && num2>=0) resultText+=(num1-num2);
            result.setText(resultText);
        }
    }
    
}

public class Calculator {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}
