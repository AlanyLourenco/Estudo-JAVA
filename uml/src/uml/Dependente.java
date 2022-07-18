package uml;
public class Dependente extends Socio {

    private int tipo;

   Dependente(String nome, int idade, char sexo, int tipo){
     super(nome, idade, sexo);
     this.tipo = tipo;}

   public int getTipo(){
       return this.tipo;}
   public double calcularValorMensalidade(){
       if(tipo == 1 || tipo == 2){
           if((this.getIdade())<10){return 100.00;}
          else if(this.getIdade() >= 10 && this.getIdade() < 21){return 150.00;}
          else if(this.getIdade() >= 21 && this.getIdade() < 65){return 200.00;}
          else if((this.getIdade()) > 65){return 80.00;}}
       if(tipo == 3){
           if((this.getIdade())<65){return 250.00;}
           else if((this.getIdade())>65){return 150.00;}}
       return 0.0;}
   /*Implemente os construtores inicializando todos os atributos; e os métodos toString()  retornando o número do título, o nome e a idade (para titular) e o nome, o tipo e a idade (para dependentes), e os que mais forem necessários;*/
   public String toString(){
       String  Titulare = "\nNOME: " + super.getNome() + "\nIDADE: " + super.getIdade() + "\nSEXO: " + super.getSexo() + "\n" + "\nTIPO DEPENDENTE: " + this.getTipo() + "\nVALOR MENSALIDADE: " + this.calcularValorMensalidade();
       return Titulare;
     }
}