package ihc;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private JButton plainJButton; //botao apenas com texto
    private JButton fancyJButton; //botao apenas com icones
    
    //buttonframe adiciona jbuttons ao jframe
    public ButtonFrame()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plainJButton = new JButton("Plain Button");
        add(plainJButton);
        
        Icon pickle = new ImageIcon(getClass().getResource("pickle.jpg"));
        Icon face = new ImageIcon(getClass().getResource("facebook.png"));
        fancyJButton = new JButton("Fancy Button", pickle);
        fancyJButton.setRolloverIcon(face);
        add(fancyJButton);
        
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
