import java.util.ArrayList;

public class Cidade implements Publicavel {
    private String cod;
    private String nome;
    private int populacao;
    private double area;
    ArrayList <Cidade> front= new ArrayList <Cidade>();

    public Cidade(String cod, String nome, double d)
    {   this.cod = cod;
        this.nome = nome;
        this.area = d;
    }


   
    public void setPopulacao(int numpop){
        this.populacao=numpop;}


    public String getCitFrotcm(Cidade cidade){
      String ath = "Cidades em Comum";

      for(int i = 0; i < this.front.size(); i++)
      {
        for(int j = 0; j < this.front.size(); j++)
        {
         if(this.front.get(i) == cidade.front.get(i)){
            ath = ath + "\n" + "| " + this.front.get(i).mostrarDados();
         }
        }
      }
      
        return ath ;}

    public void setCitFront(Cidade citfr){
        this.front.add(citfr);}

   

    public boolean cidadesIguais(Cidade b){
        boolean v=false;
        if((this.nome==b.nome)&&(this.cod==b.cod)){
            v=true;
            System.out.println("\nCidades iguais!\n");
            return v;
        }
        else{
        return v;}
    }

    /*public void isLimitrofe(Cidade l){

    }*/

    public void densidade(){
       if((this.populacao/this.area)>500){
        System.out.println("\nPopulação Elevada: "+this.populacao/this.area+"\n");
       }
       else if((this.populacao/this.area)>=100 && (this.populacao/this.area)<=500){
        System.out.println("\nPopulação Regular: "+this.populacao/this.area+"\n");
       }
       else if((this.populacao/this.area)<100){
        System.out.println("\nPopulação Baixa: "+this.populacao/this.area+"\n");
       }
    }

    @Override
    public String mostrarDados() {
        String cid = "\n Nome: " + this.nome + "\n Cod: " + this.cod + "\n População: " + this.populacao + "\n Area: " + this.area + "\n Cidades vizinhas: ";
        if(this.fronteira.size() == 0)
        {
            return city;
        }
        city = city +  "\n" + "Lista de cidades vizinhas: ";
       for(int i = 0; i < this.fronteira.size(); i++)
       {
        
        city = city + "\n" + "| " +fronteira.get(i).nome;
       }
       re
        return cid;   
    }



}
