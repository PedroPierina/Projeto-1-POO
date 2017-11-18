package contateste;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CriaTela extends JFrame{
    private JButton simplesJButton; //botao apenas com texto
    private JButton especialJButton;
    private JButton poupancaJButton;
    
    //buttonframe adiciona jbuttons ao jframe
    public CriaTela()
    {
        super("Contas.exe");
        setLayout(new FlowLayout());
        
        SimplesHandler SimplesHandler = new SimplesHandler();
        EspecialHandler EspecialHandler = new EspecialHandler();
        PoupancaHandler PoupancaHandler = new PoupancaHandler();
        
        
        simplesJButton = new JButton("ContaSimples");
        add(simplesJButton);
        simplesJButton.addActionListener(SimplesHandler);
        
        especialJButton = new JButton("ContaEspecial");
        add(especialJButton);
        especialJButton.addActionListener(EspecialHandler);
        
        poupancaJButton = new JButton("ContaPoupança");
        add(poupancaJButton);
        poupancaJButton.addActionListener(PoupancaHandler);
        
        
    }
    
    private class SimplesHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            ButtonFrame telaCria = new ButtonFrame();
            telaCria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            telaCria.setSize(500, 500);
            telaCria.setVisible(true);
        }
    }
     private class EspecialHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            ButtonFrame telaCria = new ButtonFrame();
            telaCria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            telaCria.setSize(500, 500);
            telaCria.setVisible(true);
        }
    }
      private class PoupancaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            ButtonFrame telaCria = new ButtonFrame();
            telaCria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            telaCria.setSize(500, 500);
            telaCria.setVisible(true);
        }
    }
    
}
