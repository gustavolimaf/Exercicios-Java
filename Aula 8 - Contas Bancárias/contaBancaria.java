public class contaBancaria {
    public double saldo;
    public int numero;
    public String titular;

    public contaBancaria(int i, String joaozinho) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public double verificarSaldo(){
        return saldo;
    }
}
