public class Cidade implements Publicavel {
    private int cod;
    private String nome;
    private int populacao;
    private float area;
    private String citFrot;

    public Cidade(){
        this.setCod(0000);
        this.setNome("NENHUM");
        this.setArea(0f);
    }

    public int getCod(){
        return cod;}
    public void setCod(int codigo){
        this.cod=codigo;}

    public int getPopulacao(){
        return populacao;}
    public void setPopulacao(int numpop){
        this.populacao=numpop;}

    public String getNome(){
        return nome;}
    public void setNome(String citnome){
        this.nome=citnome;}

    public String getCitFrot(){
        return citFrot;}
    public void setCitFront(String citfr){
        this.citFrot=citfr;}

    public float getArea(){
        return area;}
    public void setArea(float citarea){
        this.area=citarea;}

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
       if((this.getPopulacao()/this.getArea())>500){
        System.out.println("\nPopulação Elevada: "+this.getPopulacao()/this.getArea()+"\n");
       }
       else if((this.getPopulacao()/this.getArea())>=100 && (this.getPopulacao()/this.getArea())<=500){
        System.out.println("\nPopulação Regular: "+this.getPopulacao()/this.getArea()+"\n");
       }
       else if((this.getPopulacao()/this.getArea())<100){
        System.out.println("\nPopulação Baixa: "+this.getPopulacao()/this.getArea()+"\n");
       }
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n______________________________________\n");
        System.out.println("NOME: "+this.nome);
        System.out.println("COD: "+this.cod);
        System.out.println("POPULAÇÃO: "+this.populacao);
        System.out.println("ÁREA: "+this.area);
        //System.out.println("CIDADES QUE FAZ FRONTEIRA: ");
        
    }



}
