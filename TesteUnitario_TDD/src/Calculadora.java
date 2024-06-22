

public class Calculadora
{
    private int a,b;

    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}
    public int getA() {return a;}
    public int getB() {return b;}

    public int diferenca(int a,int b)
    {
        // throw new RuntimeException("Não feito"); //Para o teste dar ERRADO
        return this.a - this.b;  //Para o teste dar CERTO
    }

    public int divisao(int a,int b)
    {
        //throw new RuntimeException("Não feito"); //Para o teste dar ERRADO
        return this.a/this.b; //Para o teste dar CERTO
    }

    public int produto(int a,int b)
    {
        throw new RuntimeException("Não feito"); //Para o teste dar ERRADO
        //return this.a * this.b; //Para o teste dar CERTO
    }

    public int soma(int a,int b)
    {
        throw new RuntimeException("Não feito"); //Para o teste dar ERRADO
        //return this.a + this.b; //Para o teste dar CERTO
    }
}