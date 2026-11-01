package petlucas;

public class Produto {
    private String nome;
    private String descricao;
    private float preco;
    private String imagem;
    private String tipo;
    
    public Produto(String nome, String descricao, float preco, String imagem, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }
    
    public String getTipo() {
        return tipo;
    }
}
