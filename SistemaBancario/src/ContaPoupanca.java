public class ContaPoupanca  extends Conta{
    @Override
    public void imprimeExtrato(){
        System.out.println("--- Extrato Conta Poupança ---");
        super.infoComum();
    }
}
