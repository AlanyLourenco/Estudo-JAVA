public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    float altura, peso;

    public void apresentar(){
        System.out.println("________________");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Nacionalidade: "+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Vitorias: "+ this.getVitorias()+" Derrotas: "+this.getDerrotas()+" Empates: "+this.getEmpates());
        System.out.println("________________");

    }
    public void status(){
        System.out.println("________________");
        System.out.println("Vitorias: "+ this.getVitorias()+" X Derrotas: "+this.getDerrotas());
        System.out.println("Categoria: "+this.categoria);
        System.out.println("________________");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
   public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    public Lutador(String nome,String nacionalidade,int idade,float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.idade=idade;
        this.altura=altura;
        this.setPeso(peso);
        this.vitorias=vitorias;
        this.derrotas=derrotas;
        this.empates=empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(peso<52.2){
            this.categoria="Invalido";
        }
        else if (peso<=70.3){
            this.categoria="Leve";
        }
        else if (peso<=83.9){
            this.categoria="Médio";
        }
        else if (peso<=120.2){
            this.categoria="Pesado";
        }
        else{
            this.categoria="Invalido";
        }
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    

}