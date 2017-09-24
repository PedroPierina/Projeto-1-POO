package contateste;

import java.util.Scanner;

public class ContaTeste {

    public static void main(String[] args) {
        int sair = 0;
        int o = 0, i = 0, valor, achei = 0;
        Conta c[] = new Conta[10];
        String nome;
        int numero;
        float saldo;
        float limite;
        float limiteNegativo;
        float rendimento;
        
        /*for(int j = 0; j < 10; j++){
            c[j] = new Conta();
        }*/
        
        Scanner input = new Scanner(System.in);
        
        while(sair != 1){
            System.out.println("1- Criar uma conta simples");
            System.out.println("2- Criar uma conta especial");
            System.out.println("3- Criar uma conta poupanca");
            System.out.println("4- Consultar saldo");
            System.out.println("5 - Deposito");
            System.out.println("6 - Saque");
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
                       
                       for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                               achei = 1;
                            }
                        }
                        if(achei == 1){
                            System.out.println("Conta ja existe!!!");
                        }
                        else{
                            c[i] = new ContaSimples(nome, numero, saldo, limite);
                            i++;
                            System.out.println("Conta criada com sucesso!!!\n");
                       }
                       achei = 0;
                       break;
                       
                    case 2:
                       System.out.printf("Insira o nome do titular: ");
                       nome = input.next();
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       System.out.printf("Insira o saldo da conta: ");
                       saldo = input.nextFloat();
                       System.out.printf("Insira o limite da conta: ");
                       limite = input.nextFloat();
                       System.out.printf("Insira o limite dos saques negativos: ");
                       limiteNegativo = input.nextFloat();
                       
                        for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                               achei = 1;
                            }
                        }
                        if(achei == 1){
                            System.out.println("Conta ja existe!!!");
                        }
                        else{
                            c[i] = new ContaEspecial(nome, numero, saldo, limite, limiteNegativo);
                            i++;
                            System.out.println("Conta criada com sucesso!!!\n");
                        }
                        achei = 0;
                       break;
                       
                    case 3:
                       System.out.printf("Insira o nome do titular: ");
                       nome = input.next();
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       System.out.printf("Insira o saldo da conta: ");
                       saldo = input.nextFloat();
                       System.out.printf("Insira o limite da conta: ");
                       limite = input.nextFloat();
                       System.out.printf("Insira a taxa de rendimento: ");
                       rendimento = input.nextFloat();
                       
                       for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                               achei = 1;
                            }
                        }
                        if(achei == 1){
                            System.out.println("Conta ja existe!!!");
                        }
                        else{
                            c[i] = new ContaPoupanca(nome, numero, saldo, limite, rendimento);
                            i++;
                            System.out.println("Conta criada com sucesso!!!\n");
                        }
                        achei = 0;
                        break;
                       
                    case 4:
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                                              
                        for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                               achei = 1;
                               System.out.printf("%.2f\n\n", c[j].getSaldo());
                            }
                        }
                        if(achei == 0){
                            System.out.println("Conta não encontrada!!!\n");
                        }
                        achei = 0;
                       
                       break;
                       
                    case 5:
                       System.out.printf("Insira o numero da conta: ");
                       numero = input.nextInt();
                       
                       for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                              achei = 1;
                              System.out.println("Insira o valor do deposito");
                              valor = input.nextInt();
                              
                              c[j].deposito(valor);
                            }
                       }
                       if(achei == 0){
                            System.out.println("Conta não encontrada!!!\n");
                        }
                       achei = 0;
                       
                       break;
                       
                    case 6:
                        System.out.printf("Insira o numero da conta: ");
                        numero = input.nextInt();
                       
                        for(int j = 0; j < i; j++){
                            if(c[j].getNumero() == numero){
                              achei = 1;
                              System.out.println("Insira o valor do saque");
                              valor = input.nextInt();
                              c[j].saque(valor);
                            }
                        }
                        
                        if(achei == 0){
                            System.out.println("Conta não encontrada!!!\n");
                        }
                        achei = 0;
                       
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
