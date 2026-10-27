package petlucas;

public class Produto {
    private String nome;
    private float preco;
    private String imagem;
    private String tipo;
    
    public Produto(String nome, float preco, String imagem, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
        this.tipo = tipo;
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
    
    public String getTipo() {
        return tipo;
    }
}
