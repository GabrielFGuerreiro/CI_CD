package Facade;

public class Combo
{
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void CriarCombo(int tipo)
    {
        switch(tipo)
        {
            case 1:
                burguer = new Burguer("Burguer Master", 15.00, 200);
                sobremesa = new Sobremesa("Sundae", 7.50, "Médio");
                bebida = new Bebida("Refrigerante", 5.00, 500);
                break;

            case 2:
                burguer = new Burguer("Super Burguer", 20.00, 300);
                sobremesa = new Sobremesa("Brownie", 10.00, "Grande");
                bebida = new Bebida("Suco Natural", 6.50, 600);
                break;
                
            default:
                throw new IllegalArgumentException("Tipo de combo inválido.");
        }
    }

    public String toString()
    {
        return "Combo Selecionado:\n" +
        burguer.detalhes() + "\n" +
        sobremesa.detalhes() + "\n" +
        bebida.detalhes();
    }
}
