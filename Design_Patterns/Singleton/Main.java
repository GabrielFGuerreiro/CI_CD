package Singleton;

public class Main
{
    public static void main(String[] args)
    {
        Fila filaDeImpressao = Fila.getInstance();

        // Exibindo o menu
        filaDeImpressao.exibirMenu();
    }
}
