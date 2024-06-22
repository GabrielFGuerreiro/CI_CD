import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTestTest
{
    @org.junit.jupiter.api.Test
    public void diferenca()
    {
        Calculadora calculadora = new Calculadora();

        calculadora.setA(5);
        calculadora.setB(4);

        assertEquals(1,calculadora.diferenca(calculadora.getA(), calculadora.getB()));
    }

    @org.junit.jupiter.api.Test
    void divisao()
    {
        Calculadora calculadora = new Calculadora();

        calculadora.setA(10);
        calculadora.setB(2);

        assertEquals(5,calculadora.divisao(calculadora.getA(), calculadora.getB()));
    }

    @org.junit.jupiter.api.Test
    void produto()
    {
        Calculadora calculadora = new Calculadora();

        calculadora.setA(2);
        calculadora.setB(2);

        assertEquals(4,calculadora.produto(calculadora.getA(), calculadora.getB()));
    }

    @org.junit.jupiter.api.Test
    void soma()
    {
        Calculadora calculadora = new Calculadora();

        calculadora.setA(1);
        calculadora.setB(1);

        assertEquals(2,calculadora.soma(calculadora.getA(), calculadora.getB()));
    }
}