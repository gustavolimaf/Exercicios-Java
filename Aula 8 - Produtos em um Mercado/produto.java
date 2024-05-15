public class produto {
    public String nome;
    public double preco;
    public int quantEstoque;
    public produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public void adcionarEstoque(int quantidade) {
        quantEstoque += quantidade;
    }
    public void removerEstoque(int quantidade) {
        if (quantidade <= quantEstoque) {
            quantEstoque -= quantidade;
        }else {
            System.out.println("Quantidade solicitada maior que a quantidade em estoque.");
        }
    }
    public double calcTotEStoque(){
        return quantEstoque * preco;
    }
}
