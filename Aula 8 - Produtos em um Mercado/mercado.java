public class mercado {
    public static void main(String[] args) {
        produto produto = new produto("Camisa", 29.99, 50);

        // Adicionando 10 unidades ao estoque
        produto.adcionarEstoque(10);

        // Removendo 5 unidades do estoque
        produto.removerEstoque(5);

        // Calculando o valor total em estoque
        double valorTotal = produto.calcTotEStoque();
        System.out.println("Valor total em estoque: R$" + valorTotal);
    }
}
