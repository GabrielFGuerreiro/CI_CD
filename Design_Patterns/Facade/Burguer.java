package Facade;

public class Burguer extends Produto
{
    private int gramas;
    
    public Burguer(String descricao, double preco, int gramas)
    {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getgGramas() {return gramas;}

    @Override
    public String detalhes()
    {
        return getDescri() + " (" + gramas + "g) - R$" + getPreco();
    }
}