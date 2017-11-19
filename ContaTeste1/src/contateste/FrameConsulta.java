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

public class FrameConsulta extends JFrame {
    private JTextField numero;
    private JButton ok;
    private JButton cancel;
    private JLabel numeroLabel;
    private float saldo;

    public FrameConsulta() {
        super("Consultar Saldo");
        setLayout(new FlowLayout());

        numeroLabel = new JLabel("Numero Da Conta");
        add(numeroLabel);
        numero = new JTextField(10);
        add(numero);

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
            try {
                saldo = banco.consulta(Integer.parseInt(numero.getText()));
                if(saldo == -1)
                {
                    JOptionPane.showMessageDialog(null, "Conta nao existente!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Saldo da conta " + numero.getText() + " = " + saldo, "Consulta de saldo", JOptionPane.PLAIN_MESSAGE);
                }
                dispose();
            } catch (NumberFormatException number) {
                JOptionPane.showMessageDialog(null, "Insira uma entrada valida!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }            
        }
    }
    private class CancelHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}
