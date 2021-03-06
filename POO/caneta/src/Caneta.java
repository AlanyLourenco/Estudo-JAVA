public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void rabiscar(){
        if(this.tampada==true){
            System.out.println("Erro!");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }

    protected void tampar(){
        this.tampada=true;
    }

    protected void destampar(){
        this.tampada=false;
    }

    void status(){
        System.out.println("Modelo: "+this.modelo+"\n");
        System.out.println("Uma caneta: "+this.cor+"\n");
        System.out.println("Tampada? "+this.tampada+"\n");
        System.out.println("Ponta "+this.ponta+"\n");
        System.out.println("Carga "+this.carga+"\n");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}