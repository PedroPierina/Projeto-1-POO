package ihc;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Ihc {

    public static void main(String[] args) {
        /*String firstNumber = JOptionPane.showInputDialog("Insira primeiro inteiro");
        String secondNumber = JOptionPane.showInputDialog("Insira segundo inteiro");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int soma = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "A soma eh " + soma, "nome",JOptionPane.ERROR_MESSAGE);*/
        
        /*LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(500, 500);
        labelFrame.setVisible(true);*/  
        
        /*TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(500, 500);
        textFieldFrame.setVisible(true);*/
        
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(500, 500);
        buttonFrame.setVisible(true);
    }
    
}
