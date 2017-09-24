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
    
    
}
