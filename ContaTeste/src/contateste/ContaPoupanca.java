package contateste;

public class ContaPoupanca extends Conta{
    float rendimento;
    
    public void ContaPoupanca(String nome, int numero, float saldo, float limite, float rendimento){
        super(nome, numero, saldo, limite);
        this.rendimento = rendimento; 
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
    
    
}
