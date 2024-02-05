public class ContaPoupanca extends Contas{
    @java.lang.Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.ImprimirInfosComuns();
    }
}
