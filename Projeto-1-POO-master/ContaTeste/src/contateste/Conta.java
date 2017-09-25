package contateste;

public abstract class Conta {
    protected String nome;
    protected int numero;
    protected float saldo;
    protected float limite;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public Conta(String nome, int numero, float saldo, float limite){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public Conta(){
        nome = "Sem nome";
        numero = 0;
        saldo = 0.0f;
        limite = 0.0f;
    }
    
    public void saque(int valor){
        
        if(0 <= (this.getSaldo() - valor)){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque feito com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void deposito(int valor){
        this.saldo = this.saldo + valor;
    }
    
}
