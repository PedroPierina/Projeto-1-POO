package contateste;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private JButton criaContaJButton;
    private JButton consultaJButton;
    private JButton saqueJButton;
    private JButton depositoJButton;
    private JButton rendimentoJButton;
    
    public ButtonFrame()
    {
        super("Contas.exe");
        setLayout(new FlowLayout());
        
        CriaHandler criaHandler = new CriaHandler();
        ConsultaHandler consultaHandler = new ConsultaHandler();
        SaqueHandler saqueHandler = new SaqueHandler();
        DepositoHandler depositoHandler = new DepositoHandler();
        RendimentoHandler rendimentoHandler = new RendimentoHandler();
        
        criaContaJButton = new JButton("Criar Conta");
        add(criaContaJButton);
        criaContaJButton.addActionListener(criaHandler);
        
        consultaJButton = new JButton("Consultar Saldo");
        add(consultaJButton);
        consultaJButton.addActionListener(consultaHandler);
        
        saqueJButton = new JButton("Saque");
        add(saqueJButton);
        saqueJButton.addActionListener(saqueHandler);
        
        depositoJButton = new JButton("Deposito");
        add(depositoJButton);
        depositoJButton.addActionListener(depositoHandler);
        
        rendimentoJButton = new JButton("Rendimento");
        add(rendimentoJButton);
        rendimentoJButton.addActionListener(rendimentoHandler);
        
    }
    
    private class CriaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            CriaTela telaCria = new CriaTela();
            telaCria.setSize(300, 300);
            telaCria.setVisible(true);
        }
    }
    private class ConsultaHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            FrameConsulta consultar = new FrameConsulta();
            consultar.setSize(300, 300);
            consultar.setVisible(true);
        }
    }
    private class SaqueHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            FrameSaque saque = new FrameSaque();
            saque.setSize(300, 300);
            saque.setVisible(true);
        }
    }
    private class DepositoHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            FrameDeposito deposito = new FrameDeposito();
            deposito.setSize(300, 300);
            deposito.setVisible(true);
        }
    }
    private class RendimentoHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            Banco banco = Banco.getInstance();
            banco.rendimento();
        }
    }
   
}
