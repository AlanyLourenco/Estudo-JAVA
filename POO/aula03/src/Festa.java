public class Festa {
    int quantidadec= 30;
    private int quants=50;
    
    public void entrar(){
        cafe();
        salgado();
        cafe();
    }
    
    private void cafe(){
        quantidadec--;
       System.out.println("Bbebeu 1 xicara de café"); 
    }

    private void salgado(){
        quants--;
        System.out.println("Comeu 1 salgadinho");
    }
}
