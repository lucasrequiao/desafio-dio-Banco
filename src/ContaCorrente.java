public class ContaCorrente extends Contas{
    @java.lang.Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.ImprimirInfosComuns();
    }
}
