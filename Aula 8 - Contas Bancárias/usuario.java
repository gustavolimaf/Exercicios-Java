public class usuario {
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria(54321, "Joaozinho");
        minhaConta.depositar(100.0);
        System.out.println("saldo atual: "+ minhaConta.verificarSaldo());
    }
}
