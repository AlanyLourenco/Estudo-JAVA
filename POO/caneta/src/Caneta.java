public class Caneta{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if(this.tampada==true){
            System.out.println("Erro!");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }

    void tampar(){
        this.tampada=true;
    }

    void destampar(){
        this.tampada=false;
    }

    void status(){
        System.out.println("Modelo: "+this.modelo+"\n");
        System.out.println("Uma caneta: "+this.cor+"\n");
        System.out.println("Tampada? "+this.tampada+"\n");
        System.out.println("Ponta "+this.ponta+"\n");
        System.out.println("Carga "+this.carga+"\n");
    }
}