package petlucas;

public class Produto {
    private String nome;
    private float preco;
    private String imagem;
    
    public Produto(String nome, float preco, String imagem) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }
}
