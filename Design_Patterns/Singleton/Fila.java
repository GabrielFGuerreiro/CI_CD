package Singleton;

public final class Fila
{
    private Fila(){}
    
    private static Fila fila;

    public static Fila getInstance()
    {
        if (fila == null)
        {
            fila = new Fila();
        }
        return fila;
    }
}