public class Main {
    public static void main(String[] args) {
        Contas contaCorrente = new ContaCorrente();
        Contas contaPoupanca = new ContaPoupanca();

        contaCorrente.Depositar(100);
        contaCorrente.ImprimirExtrato();
        System.out.println("--------------");

        contaCorrente.Transferir(50, contaPoupanca);
        contaCorrente.ImprimirExtrato();
        contaPoupanca.ImprimirExtrato();
    }
}
