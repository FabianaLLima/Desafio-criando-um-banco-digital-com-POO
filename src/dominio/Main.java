package dominio;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();

        cc.transferir(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
