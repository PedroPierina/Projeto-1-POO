package contateste;

import java.util.Scanner;

public class ContaTeste {

    public static void main(String[] args) {
        int sair = 0;
        int o = 0, i = 0, valor;
        Conta c[] = new Conta[10];
        String nome;
        int numero;
        float saldo;
        float limite;
        
        for(int j = 0; j < 10; j++){
            c[j] = new Conta();
        }
        
        Scanner input = new Scanner(System.in);
        
        while(sair != 1){
            System.out.println("1- Criar uma conta");
            System.out.println("2- Consultar saldo");
            System.out.println("3 - Deposito");
            System.out.println("4 - Saque");
            System.out.println("0- Sair");
            o = input.nextInt();
            
               switch(o){
                   case 1:
                       System.out.printf("Insira o nome do titular: ");
                       nome = input.next();
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       System.out.printf("Insira o saldo da conta: ");
                       saldo = input.nextFloat();
                       System.out.printf("Insira o limite da conta: ");
                       limite = input.nextFloat();
                       c[i].setNome(nome);
                       c[i].setNumero(numero);
                       c[i].setSaldo(saldo);
                       c[i].setLimite(limite);
                       i++;
                       System.out.println();
                       break;
                   case 2:
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                                              
                       for(int j = 0; j < i; j++){
                           if(c[j].getNumero() == numero){
                               System.out.printf("%.2f\n\n", c[j].getSaldo());
                           }
                       }
                       
                       break;
                   case 3:
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       
                       for(int j = 0; j < i; j++){
                           if(c[j].getNumero() == numero){
                              System.out.println("Insira o valor do deposito");
                              valor = input.nextInt();
                              
                              c[j].deposito(valor);
                           }
                       }
                       
                       break;
                   case 4:
                         System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       
                       for(int j = 0; j < i; j++){
                           if(c[j].getNumero() == numero){
                              System.out.println("Insira o valor do saque");
                              valor = input.nextInt();
                              c[j].saque(valor);
                           }
                       }
                       break;
                   case 0:
                       sair = 1;
                       break;
                   default:
                       System.out.println("Entrada invalida!");
               }
        }
    }
    
}
