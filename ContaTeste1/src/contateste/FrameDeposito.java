package contateste;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class FrameDeposito extends JFrame{
    private int existe;
    private JTextField numero;
    private JTextField valor;
    private JButton ok;
    private JButton cancel;
    private JLabel numeroLabel;
    private JLabel valorLabel;

    public FrameDeposito() {
        super("Deposito");
        setLayout(new FlowLayout());

        numeroLabel = new JLabel("Numero Da Conta");
        add(numeroLabel);
        numero = new JTextField(10);
        add(numero);
        
        valorLabel = new JLabel("Valor");
        add(valorLabel);
        valor = new JTextField(10);
        add(valor);

        ok = new JButton("Ok");
        add(ok);
        OkHandler okHandler = new OkHandler();
        ok.addActionListener(okHandler);

        cancel = new JButton("Cancel");
        add(cancel);
        CancelHandler cancelHandler = new CancelHandler();
        cancel.addActionListener(cancelHandler);
    }
    
    private class OkHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            Banco banco = Banco.getInstance();
            existe = banco.realizaDeposito(Integer.parseInt(numero.getText()), Integer.parseInt(valor.getText()));
            if(existe == -1)
            {
                JOptionPane.showMessageDialog(null, "Conta nao existente!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!", "Saque", JOptionPane.PLAIN_MESSAGE);
            }
            dispose();
        }
    }
    private class CancelHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}
