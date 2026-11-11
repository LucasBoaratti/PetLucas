package petlucas;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;
    
    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    // Método get que calcula o preço total
    public float getPrecoTotal() {
        return produto.getPreco() * quantidade;
    }
}
