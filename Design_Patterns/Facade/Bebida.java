package Facade;

public class Bebida extends Produto
{
    private int ml;

    public Bebida(String descricao, double preco, int ml)
    {
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl() {return ml;}

    @Override
    public String detalhes()
    {
        return getDescri() + " (" + ml + "ml) - R$" + getPreco();
    }
}