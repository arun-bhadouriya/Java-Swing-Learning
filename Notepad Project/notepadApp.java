import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

class notepadApp extends JFrame implements ActionListener{
    JTextArea textField;
    notepadApp(){
        this.setTitle("Notepad Application");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("titleImg.jpg");
        this.setIconImage(icon.getImage());

        //MenuBar for the App
        JMenuBar menubar = new JMenuBar();
        
        //File menu for the App
        JMenu fileMenu = new JMenu("File");
        JMenuItem file1 = new JMenuItem("New");
        JMenuItem file2 = new JMenuItem("Open");
        JMenuItem file3 = new JMenuItem("Save");
        JMenuItem file4 = new JMenuItem("Exit");
        JMenuItem file5 = new JMenuItem("Print");

        fileMenu.add(file1);
        fileMenu.add(file2);
        fileMenu.add(file3);
        // fileMenu.add(file4);
        fileMenu.add(file5);
        fileMenu.add(file4);
        menubar.add(fileMenu);

        //Edit menu for the app
        JMenu editMenu = new JMenu("Edit");
        JMenuItem e1 = new JMenuItem("Cut");
        JMenuItem e2 = new JMenuItem("Copy");
        JMenuItem e3 = new JMenuItem("Paste");
        JMenuItem e4 = new JMenuItem("Select All");
        editMenu.add(e1);
        editMenu.add(e2);
        editMenu.add(e3);
        editMenu.add(e4);

        menubar.add(editMenu);

        //Help menu 
        JMenu help = new JMenu("Help");
        JMenuItem h1 = new JMenuItem("About");
        help.add(h1);

        h1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new About();
            }
        });

        menubar.add(help);

        textField = new JTextArea();
        textField.setLineWrap(true);
        textField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        JScrollPane scrollPane = new JScrollPane(textField);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane);

        setJMenuBar(menubar);
        
        //adding action listener to menu items
        file1.addActionListener(this);
        file1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));

        file2.addActionListener(this);
        file2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        
        file3.addActionListener(this);
        file3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        // file4.addActionListener(this);
        file4.addActionListener(this);
        file4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK));
        file5.addActionListener(this);
        file5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        

        e1.addActionListener(this);
        e2.addActionListener(this);
        e3.addActionListener(this);
        e4.addActionListener(this);
        
        h1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("new")){
            //New menu functionaities
            textField.setText(null);
        }
        else if(e.getActionCommand().equalsIgnoreCase("save")){
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Only Text Files", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(textFilter);

            int action = fileChooser.showSaveDialog(null);
            if(action != JFileChooser.APPROVE_OPTION){
                return;
            }
            else{
                String fileName = fileChooser.getSelectedFile().getAbsolutePath().toString();
                if(!fileName.contains(".txt")){
                    fileName+=".txt";
                }

                try{
                    BufferedWriter w = new BufferedWriter(new FileWriter(fileName));
                    textField.write(w);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        else if(e.getActionCommand().equalsIgnoreCase("open")){
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Only Text Files", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(textFilter);
            int action = fileChooser.showOpenDialog(null);

            if(action!=JFileChooser.APPROVE_OPTION){
                return;
            }else{
                try{
                    BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                    textField.read(br,null);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        else if(e.getActionCommand().equalsIgnoreCase("print")){
            try{
                textField.print();
            }catch(Exception ex){
                System.out.print(ex);
                return;
            }
        }
        else if(e.getActionCommand().equalsIgnoreCase("exit")){
            System.exit(0);
        }
        else if(e.getActionCommand().equalsIgnoreCase("cut")){
            textField.cut();
        }
        else if(e.getActionCommand().equalsIgnoreCase("copy")){
            textField.copy();
        }
        else if(e.getActionCommand().equalsIgnoreCase("paste")){
            textField.paste();
        }
        else if(e.getActionCommand().equalsIgnoreCase("select all")){
            textField.selectAll();
        }
    }
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new notepadApp().setVisible(true);
    }
    
}