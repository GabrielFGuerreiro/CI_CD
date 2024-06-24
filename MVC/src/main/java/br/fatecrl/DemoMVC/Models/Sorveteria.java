package br.fatecrl.DemoMVC.Models;

public class Sorveteria
{
    private String tipo;
    private String sabor;
    private float valor;

    public Sorveteria(String tipo, String sabor, float valor)
    {
        this.tipo = tipo;
        this.sabor = sabor;
        this.valor = valor;
    }
    
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setSabor(String sabor) {this.sabor = sabor;}
    public void setValor(float valor) {this.valor = valor;}

    public String getTipo() {return tipo;}
    public String getSabor() {return sabor;}
    public float getValor() {return valor;}
}
