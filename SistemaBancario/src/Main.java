public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100.00);
        cc.transferir(90.00,cp);

        cc.imprimeExtrato();
        cp.imprimeExtrato();
    }
}
