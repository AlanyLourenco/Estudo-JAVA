public class Saque {
    private String descricao;
	  private double valor;
    private int dia;
public Saque(String descricao, Double valor, int dia)
    {this.descricao  = descricao;
      this.valor = valor;
      this.dia = dia;}
    public String getDescricao() 
    {return descricao;}

	  public double getValor() 
    {return valor;}	
    
    public int getDia() 
    {return dia;}	
		
	  public String toString () 
    {return dia + " _ " + descricao + " _ " + valor;}
}
