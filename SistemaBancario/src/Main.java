import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente leandro = new Cliente("Leandro", "2718371");
        Cliente samara = new Cliente("Samara", "236127362");
        Conta cc= new ContaCorrente(leandro);
        Conta cp = new ContaPoupanca(samara);

        cc.depositar(100.00);
        cc.transferir(90.00,cp);
        cp.sacar(60.00);

        cc.imprimeExtrato();
        cp.imprimeExtrato();

    }
}

