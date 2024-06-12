package Strategy;

public class Geometrica implements ICalcMedia
{
    public double CalculaMedia(double P1,double P2)
    {
        return Math.sqrt(P1*P2);
    }

    public String Situacao(double media)
    {
        if(media>7)
            return "Aprovado";

        else
            return "Reprovado";
    }
}