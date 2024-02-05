
public class Contas {
    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTAS = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Contas() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = NUMERO_CONTAS++;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }
    public void Sacar(double valor){
        this.saldo -= valor;
    }
    public void Transferir(double valor, Contas contaDestino){
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    public void ImprimirExtrato(){

    }

    protected void ImprimirInfosComuns(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numeroConta);
        System.out.println(("Saldo: " + this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Contas{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
