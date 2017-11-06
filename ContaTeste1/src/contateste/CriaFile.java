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
    
    public void addRecords()
    {
        ContaTeste record = new ContaTeste();
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s\n%s\n%s\n%s\n\n",
            "To terminate input, type the end-of-file indicator",
            "when you are prompted to enter input.",
            "On Unix/Linux/Mac OS X type <ctrl> d then press Enter",
            "On Windows type <ctrl> z then press Enter");
        
        System.out.printf("%s\n%s", "Enter account number (> 0), fisrt name, last name and balance.", "? ");
        
        while(input.hasNext())
        {
            try
            {
                record.setAccount(input.nextInt());
                record.setFirstName(input.nextInt());
                record.setLastName(input.nextInt());
                record.setBalance(input.nextInt());  
                
                if(record.getAccount() > 0)
                {
                    output.format("%d %s %s %.2f\n", record.getAccount()),
                    record.getFirstName(), record.getLastName(),
                    record.getBalance());                   
                }
                else
                {
                    System.out.println("Account number must be greater than 0.");
                }
            }
            catch(FormatterClosedException formatterClosedException)
            {
                System.err.println("Error writing to file.");
                return;
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again.");
            }              
        }
    }
    
    public void closeFile()
    {
        if(output != null)
        {
            output.close();
        }
    }
}

