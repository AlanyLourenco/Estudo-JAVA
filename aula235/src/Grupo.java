import java.util.ArrayList;
public class Grupo {
    private String nome;
    Loja loja;
    ArrayList <Interesse> interesses = new ArrayList<Interesse>();
    public void adicionaInteresse(String nome) {
		interesses.add(new Interesse(nome));}
    public Grupo(String nome, Loja loja){
        this.nome=nome;
        this.loja=loja;}
    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}}
