package contateste;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private JButton criaContaJButton; //botao apenas com texto
    private JButton consultaJButton;
    private JButton saqueJButton;
    private JButton depositoJButton;
    private JButton rendimentoJButton;
    
    //buttonframe adiciona jbuttons ao jframe
    public ButtonFrame()
    {
        super("Contas.exe");
        setLayout(new FlowLayout());
        
        CriaHandler criaHandler = new CriaHandler();
        ConsultaHandler consultaHandler = new ConsultaHandler();
        SaqueHandler saqueHandler = new SaqueHandler();
        DepositoHandler depositoHandler = new DepositoHandler();
        RendimentoHandler rendimentoHandler = new RendimentoHandler();
        
        criaContaJButton = new JButton("Cria Conta");
        add(criaContaJButton);
        criaContaJButton.addActionListener(criaHandler);
        
        consultaJButton = new JButton("Consulta Saldo");
        add(consultaJButton);
        consultaJButton.addActionListener(consultaHandler);
        
        saqueJButton = new JButton("Saque");
        add(saqueJButton);
        saqueJButton.addActionListener(saqueHandler);
        
        depositoJButton = new JButton("Deposito");
        add(depositoJButton);
        depositoJButton.addActionListener(depositoHandler);
        
        rendimentoJButton = new JButton("rendimentoHandler");
        add(rendimentoJButton);
        rendimentoJButton.addActionListener(criaHandler);
    }
    
    private class CriaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            CriaTela telaCria = new CriaTela();
            telaCria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            telaCria.setSize(500, 500);
            telaCria.setVisible(true);
        }
    }
    private class ConsultaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
    private class SaqueHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
    private class DepositoHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
    private class RendimentoHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
   
}
