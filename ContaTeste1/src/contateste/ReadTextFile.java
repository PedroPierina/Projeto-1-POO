package contateste;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private Scanner input;
    
    public void openFile(){
        try{
            input = new Scanner(new File("clientes.txt"));   
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro abrindo o arquivo");
            System.exit(1);
        }
    }
    
    public void readRecords(Conta c[], int n){
        Conta recordSimples = new ContaSimples();
        ContaEspecial recordEspecial = new ContaEspecial();
        ContaPoupanca recordPoupanca = new ContaPoupanca();
        ContaEspecial auxE;
        ContaPoupanca auxP;
        
        int count = 0, zero = 0;
        int auxCodigo;
        try
        {
            while(input.hasNext()){
                if(input.nextInt() == 1){
                    recordSimples.setNumero(input.nextInt());
                    recordSimples.setNome(input.next());
                    recordSimples.setSaldo(input.nextFloat());
                    recordSimples.setLimite(zero);
                    c[count] = recordSimples;
                }
                if(input.nextInt() == 2){
                    recordEspecial.setNumero(input.nextInt());
                    recordEspecial.setNome(input.next());
                    recordEspecial.setSaldo(input.nextFloat());
                    recordEspecial.setLimite(input.nextFloat());
                    c[count] = recordEspecial;
                }
                if(input.nextInt() == 3){
                    recordPoupanca.setNumero(input.nextInt());
                    recordPoupanca.setNome(input.next());
                    recordPoupanca.setSaldo(input.nextFloat());
                    recordPoupanca.setLimite(zero);
                    c[count] = recordPoupanca;
                }
                count++;
            }
        }
        catch(NoSuchElementException elementException){
            System.err.println("Arquivo fora de formatacao");
            input.close();
            System.exit(1);
        }
        catch(IllegalStateException stateException){
            System.err.println("Erro: Nao foi possivel ler o arquivo");
            System.exit(1);
        }
    }
    public void closeFile(){
        if(input != null)
            input.close();
    }
}
