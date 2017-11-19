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

public class FrameEspecial extends JFrame {

    private JTextField nome;
    private JTextField numero;
    private JTextField saldo;
    private JTextField limite;
    private JButton ok;
    private JButton cancel;
    private JLabel nomeLabel;
    private JLabel numeroLabel;
    private JLabel saldoLabel;
    private JLabel limiteLabel;

    public FrameEspecial() {
        super("Criando Conta Especial");
        setLayout(new FlowLayout());

        nomeLabel = new JLabel("Nome");
        add(nomeLabel);
        nome = new JTextField(10);
        add(nome);

        numeroLabel = new JLabel("Numero");
        add(numeroLabel);
        numero = new JTextField(10);
        add(numero);

        saldoLabel = new JLabel("Saldo");
        add(saldoLabel);
        saldo = new JTextField(10);
        add(saldo);
        
        limiteLabel = new JLabel("Limite de Saldo");
        add(limiteLabel);
        limite = new JTextField(10);
        add(limite);

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
                banco.criaContaEspecial(nome.getText(), Integer.parseInt(numero.getText()), Float.parseFloat(saldo.getText()), Float.parseFloat(limite.getText()));
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
