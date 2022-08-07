import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class registrationForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(700,500);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        Container c = f.getContentPane();
        c.setLayout(null);
        JLabel heading = new JLabel("REGISTRATION FORM",JLabel.CENTER);
        heading.setSize(600,50);
        heading.setFont(new Font("Cursive",Font.BOLD,25));
        //input for name
        JLabel name = new JLabel("Name");
        name.setBounds(50,55,100,50);
        JTextField inputName = new JTextField();
        inputName.setBounds(130,70,150,20);
        //input for mobile
        JLabel mobile = new JLabel("Mobile");
        mobile.setBounds(50,85,100,50);
        JTextField inputMobile = new JTextField();
        inputMobile.setBounds(130,100,150,20);
        //input for Gender
        JLabel gender = new JLabel("Gender");
        gender.setBounds(50, 115, 100, 50);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(130, 120, 60, 40);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 120, 150, 40);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        male.setSelected(true);
        //Input fir DOB
        JLabel dob = new JLabel("DOB");
        dob.setBounds(50, 155, 100, 20);

        //dates Array
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Integer dates[] = new Integer[31];
        for(Integer i = 0; i<31;i++) dates[i] = i+1;
        Integer years[] = new Integer[121];
        int x = 0;
        for(Integer i = 2020 ; i>=1900; i--) years[x++] = i;
        // Arrays.sort(years); 
        JComboBox<Integer> date = new JComboBox<>(dates);
        date.setBounds(130, 160, 50, 20);
        JComboBox<String> month = new JComboBox<>(months);
        month.setBounds(190, 160, 50, 20);
        JComboBox<Integer> year = new JComboBox<>(years);
        year.setBounds(250, 160, 60, 20);
        //input for address
        JLabel address = new JLabel("Address"); 
        address.setBounds(50,200,50,20);
        JTextArea inputAdress = new JTextArea("Enter your adress here. ");
        inputAdress.setBounds(130,200,200,50);
        inputAdress.setLineWrap(true);
        
        //T&c
        JCheckBox termsCheckBox = new JCheckBox("Please Accept above T&C.");
        termsCheckBox.setBounds(100, 250, 200, 50); 
        // JLabel tc = new JLabel("Please Accept above T&C.");
        // tc.setBounds(120,265,200,20);
        //Button t o submit the form

        JButton btnSubmitForm = new JButton("Submit");
        btnSubmitForm.setSize(100,30);
        btnSubmitForm.setLocation(150,300);
        
        //Label for showing the submission
        JLabel submitted = new JLabel("");
        submitted.setBounds(100,350,250,20);

        JTextArea submittedInfo = new JTextArea();
        submittedInfo.setBounds(350,55,300,250);
        submittedInfo.setEditable(false);
        submittedInfo.setLineWrap(true);
        btnSubmitForm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String msg = "Resgistration Successfull!!";
                boolean isTandC = termsCheckBox.isSelected();
                if(isTandC){
                    submitted.setText(msg);
                    String name1 = inputName.getText();
                    String mobile1 = inputMobile.getText();
                    String address1 = inputAdress.getText();
                    String gender1 = "male";
                    String dob = date.getSelectedItem() +"-"+ month.getSelectedItem() + "-" + year.getSelectedItem();
                    if(female.isSelected()) gender1="female";
                    submittedInfo.setText("Name: "+name1+"\n"+"Mobile: "+mobile1+"\n"+"Gender: "+gender1+"\n"+"DOB : "+ dob+"\n"+"Adress: "+address1);
                } 
                else{
                    submittedInfo.setText("");
                    submitted.setText("Please accept terms and conditions.");   
                }
                }
        });


        //adding all the components
        c.add(heading);
        c.add(name);
        c.add(inputName);
        c.add(mobile);
        c.add(inputMobile);
        c.add(gender);
        c.add(male);
        c.add(female);
        c.add(dob);
        c.add(date);
        c.add(month);
        c.add(year);
        c.add(address);
        c.add(inputAdress);
        c.add(termsCheckBox);
        // c.add(tc);
        c.add(btnSubmitForm);
        c.add(submitted);
        c.add(submittedInfo);
        f.setVisible(true);
    }
}
