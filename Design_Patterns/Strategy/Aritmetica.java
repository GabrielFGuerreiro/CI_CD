package Strategy;

public class Aritmetica implements ICalcMedia
{
    public double CalculaMedia(double P1,double P2)
    {
        return (P1+P2)/2;
    }

    public String Situacao(double media)
    {
        if(media>5)
            return "Aprovado";

        else
            return "Reprovado";
    }
}