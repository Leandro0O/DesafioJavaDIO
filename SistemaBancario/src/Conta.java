public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static Integer SEQUENCIAL = 1;

    protected   int agencia;
    protected   int numConta;
    protected   double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
    }


    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void infoComum(){
        System.out.println(String.format("Agencia: %d\nNúmero Conta: %d\nSaldo: R$ %.2f",this.agencia,this.numConta,this.saldo));
    }
}
