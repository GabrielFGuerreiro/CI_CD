package Facade;

class Sobremesa extends Produto
{
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho)
    {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {return tamanho;}
    
    @Override
    public String detalhes()
    {
        return getDescri() + " (" + tamanho + ") - R$" + getPreco();
    }
}