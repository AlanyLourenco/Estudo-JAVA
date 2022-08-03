public class Pessoa {
    private String nome;
    private int idade;
    private String sex;

    public Pessoa(String nome, int idade, String sex){
        this.nome=nome;
        this.idade=idade;
        this.sex=sex;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void fazerAniver(){
        this.idade++;

    }
}
