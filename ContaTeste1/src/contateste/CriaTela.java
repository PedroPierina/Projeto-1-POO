package contateste;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CriaTela extends JFrame {
    private JButton simplesJButton; //botao apenas com texto
    private JButton especialJButton;
    private JButton poupancaJButton;
    private JButton cancel;

    //buttonframe adiciona jbuttons ao jframe
    public CriaTela() {
        super("Contas.exe");
        setLayout(new FlowLayout());

        SimplesHandler simplesHandler = new SimplesHandler();
        EspecialHandler especialHandler = new EspecialHandler();
        PoupancaHandler poupancaHandler = new PoupancaHandler();
        CancelHandler cancelHandler = new CancelHandler();

        simplesJButton = new JButton("ContaSimples");
        add(simplesJButton);
        simplesJButton.addActionListener(simplesHandler);

        especialJButton = new JButton("ContaEspecial");
        add(especialJButton);
        especialJButton.addActionListener(especialHandler);

        poupancaJButton = new JButton("ContaPoupança");
        add(poupancaJButton);
        poupancaJButton.addActionListener(poupancaHandler);

        cancel = new JButton("Cancel");
        add(cancel);
        cancel.addActionListener(cancelHandler);

    }

    private class SimplesHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            FrameSimples contaSimples = new FrameSimples();
            contaSimples.setSize(200, 300);
            contaSimples.setVisible(true);
            dispose();
        }
    }

    private class EspecialHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            FrameEspecial contaEspecial = new FrameEspecial();
            contaEspecial.setSize(400, 300);
            contaEspecial.setVisible(true);
            dispose();
        }
    }

    private class PoupancaHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            FramePoupanca contaPoupanca = new FramePoupanca();
            contaPoupanca.setSize(400, 300);
            contaPoupanca.setVisible(true);
            setVisible(false);
        }
    }
    
    private class CancelHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }

}
