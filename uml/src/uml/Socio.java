package uml;

public abstract class Socio {

    private String nome;
    private int idade;
    private char sexo;

    Socio(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo  = sexo;}

    public String getNome(){
        return this.nome;}
    public int getIdade(){
        return this.idade;}
    public char getSexo(){
        return this.sexo;}

    public abstract double calcularValorMensalidade();  
}
