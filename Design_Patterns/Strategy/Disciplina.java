package Strategy;

public class Disciplina
{
    private ICalcMedia CalcMedia;
    public double media;
    private String nome;
    private double P1;
    private double P2;
    public String situacao;


   public Disciplina(ICalcMedia CalcMedia) {this.CalcMedia=CalcMedia;}

   public void setNome(String nome) {this.nome=nome;}
   public void setP1(double P1) {this.P1=P1;}
   public void setP2(double P2) {this.P2=P2;}


   public String getNome() {return nome;}
   public double getP1() {return P1;}
   public double getP2() {return P2;}
   public String getSituacao() {return situacao;}
   public double getMedia() {return media;}

   public void CalcularMedia()
   {
        this.media = CalcMedia.CalculaMedia(P1, P2);
        this.situacao = CalcMedia.Situacao(media);
   }


}