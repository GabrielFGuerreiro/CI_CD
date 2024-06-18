package Facade;

abstract class Produto
{
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescri() {return descricao;}

    public double getPreco() {return preco;}

    public abstract String detalhes();
}