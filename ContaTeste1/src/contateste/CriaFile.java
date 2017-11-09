package contateste;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriaFile {
    private Formatter output; 
    
    public void openFile()
    {
        try{
            output = new Formatter("clientes.txt");
        }
        catch(SecurityException securityException)
        {
            System.err.println("Voce nao tem acesso a esse arquivo!!!");
            System.exit(1);
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.err.println("Erro ao abrir ou criar arquivo!!!");
            System.exit(1);
        }
    }
    
    public void addRecords(Conta c[], int n)
    {
        Conta recordSimples = new ContaSimples();
        ContaEspecial recordEspecial = new ContaEspecial();
        ContaPoupanca recordPoupanca = new ContaPoupanca();
        ContaEspecial auxE;
        ContaPoupanca auxP;
        
        try
        {
            for(int i = 0; i < n; i++)
            {
                if(c[i] != null)
                    if(c[i] instanceof ContaSimples)
                    {
                        recordSimples.setNumero(c[i].getNumero());
                        recordSimples.setNome(c[i].getNome());
                        recordSimples.setSaldo(c[i].getSaldo());  

                        output.format("Conta - %d Nome - %s Saldo - %.2f |", recordSimples.getNumero(), recordSimples.getNome(), recordSimples.getSaldo());
                    }
                    else if(c[i] instanceof ContaEspecial)
                    {
                        auxE = (ContaEspecial)c[i];
                        recordEspecial.setNumero(c[i].getNumero());
                        recordEspecial.setNome(c[i].getNome());
                        recordEspecial.setSaldo(c[i].getSaldo());
                        recordEspecial.setLimiteNegativo(auxE.getLimiteNegativo());

                        output.format("Conta - %d Nome - %s Saldo - %.2f Limite - %.2f |", recordEspecial.getNumero(), recordEspecial.getNome(), recordEspecial.getSaldo(), recordEspecial.getLimiteNegativo());
                    }
                    else if(c[i] instanceof ContaPoupanca)
                    {
                        auxP = (ContaPoupanca)c[i];
                        recordPoupanca.setNumero(c[i].getNumero());
                        recordPoupanca.setNome(c[i].getNome());
                        recordPoupanca.setSaldo(c[i].getSaldo());
                        recordPoupanca.setRendimento(auxP.getRendimento());

                        output.format("Conta - %d Nome - %s Saldo - %.2f Rendimento - %.2f |", recordPoupanca.getNumero(), recordPoupanca.getNome(), recordPoupanca.getSaldo(), recordPoupanca.getRendimento());
                    }
            }
        }
        catch(FormatterClosedException formatterClosedException)
        {
            System.err.println("\n\nErro na escrita de arquivo!!!\n\n");
        }
        /*catch(NoSuchElementException elementException)
        {
            System.err.println("\n\nEntrada invalida. Please try again.\n\n");
        }*/
    }
    
    public void closeFile()
    {
        if(output != null)
        {
            output.close();
        }
    }
}

