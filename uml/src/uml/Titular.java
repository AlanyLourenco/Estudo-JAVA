package uml;
import java.util.ArrayList;

public class Titular extends Socio implements Associacao {
    
    private int numTitulo;
    ArrayList <Dependente> dependentes = new ArrayList <Dependente>();
    Titular(String nome, int idade, char sexo, int numTitulo){
        super(nome, idade, sexo);
        this.numTitulo = numTitulo;}

    /*Implemente o método associarObjetos que vai associar um dependente a um titular, ou seja, adicionar um dependente à lista dos dependentes do titular; */    
    public void associarObjetos(Dependente dependente){
       this.dependentes.add(dependente);}
    public int getNumTitulo(){
        return this.numTitulo;}
    public double calcularValorMensalidade(){
        /*        ◦ Se titular (acima de 21 anos):
            ▪ de 21 a 65 – 500,00
            ▪ acima de 65 – 200,00
        ◦ Se dependentes:
            ▪ Para filho/filha (tipo = 1) ou marido/esposa (tipo = 2)
                • até 10 anos – 100,00
                • de 10 a 21 – 150,00
                • de 21 a 65 – 200,00
                • acima de 65,00 – 80,00
            ▪ Para outros tipos (tipo = 3)
                • até 65 anos – 250,00
                • acima de 65 – 150,00*/
        if(this.getIdade() >= 21){
            if((this.getIdade()) >= 21 && this.getIdade() <= 65){return 500.00;}
            else if(this.getIdade() > 65){return 200.00;}}
        return 0.0;}
     /*Implemente os construtores inicializando todos os atributos; e os métodos toString()  retornando o número do título, o nome e a idade (para titular) e o nome, o tipo e a idade (para dependentes), e os que mais forem necessários;*/
    public String toString(){
      String  Titulare = " NOME: " + super.getNome() + "\n IDADE: " + super.getIdade() + "\n SEXO: " + super.getSexo() + "\n" + "\n NUM TITULAR: " + this.getNumTitulo() + "\n VALOR DA MENSALIDADE: " + this.calcularValorMensalidade() + "\n DEPENDENTES:";
      for(int i = 0; i < dependentes.size(); i++){
        Titulare = Titulare + "\n" + dependentes.get(i) + ";";}
    return Titulare;}}