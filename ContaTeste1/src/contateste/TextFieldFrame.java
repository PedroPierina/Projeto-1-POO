package contateste;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    
    //construtor adiciona jtextfields a jframe
    public TextFieldFrame()
    {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout()); //configura o layout de frame
        
        //constroi textfield com 10 colunas
        textField1 = new JTextField(10);
        add(textField1); //adiciona textField1 ao JFrame
        
        //constroi campo de texto com texto padrao
        textField2 = new JTextField("Enter text here");
        add(textField2); //adiciona textField2 ao JFrame
        
        //constroi textfield com o texto padaro e 21 colunas
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3); //adiciona textField3 ao JFrame
        
        //constroi passwordfield com texto padrao
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    
    private class TextFieldHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String string = "";
            
            if(event.getSource() == textField1)
            {
                string = String.format("textField1: %s", event.getActionCommand());
            }
            else if(event.getSource() == textField2)
            {
                string = String.format("textField2: %s", event.getActionCommand());
            }
            else if(event.getSource() == textField3)
            {
                string = String.format("textField3: %s", event.getActionCommand());
            }
            else if(event.getSource() == passwordField)
            {
                string = String.format("passwordField: %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
}


