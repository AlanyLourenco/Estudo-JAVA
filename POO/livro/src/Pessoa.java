public class Pessoa{
    private String nome;
    private int idade;
    private String sex;

    public void fazerAniversario(){
        this.idade++;
    }
    public Pessoa(String nome,int idade,String sex){
        this.nome=nome;
        this.idade=idade;
        this.sex=sex;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSex() {
        return sex;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
