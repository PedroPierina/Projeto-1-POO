package contateste;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel label1; //apenas com texto
    private JLabel label2; //construido com texto e icone
    private JLabel label3; //com texto e icone adds
    
    public LabelFrame()
    {
        super("Testando JLabel");
        setLayout(new FlowLayout());
        
        //construtor jlabel com um arg de str
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("This is label1");
        add(label1); //adiciona label1 ao jframe 
        
        //construtor jlabel com str, icon e arg de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("facebook.png"));
        label2 = new JLabel("Label com texto e icone", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        //construtor jlabel sem args
        label3 = new JLabel();
        label3.setText("Label com icone e texto embaixo");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
