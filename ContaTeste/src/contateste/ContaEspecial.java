package contateste;

public class ContaEspecial extends Conta{
    private float limiteNegativo;
    
    public ContaEspecial(String nome, int numero, float saldo, float limite, float limiteNegativo){
        super(nome, numero, saldo, limite);
        this.limiteNegativo = limiteNegativo;        
    }

    public float getLimiteNegativo() {
        return limiteNegativo;
    }

    public void setLimiteNegativo(float limiteNegativo) {
        this.limiteNegativo = limiteNegativo;
    }
    
    public void saque(int valor){
        
        if(valor <= limite && (saldo - valor) >= limiteNegativo){
            saldo = saldo - valor;           
        }
        else{
            System.out.println("\nErro ao sacar!!!\n");
        }
    }
    
}
