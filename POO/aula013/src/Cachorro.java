public class Cachorro extends Lobo {
    public void emitirSom(){
        System.out.println("Au Au!");
    }
    public void reagir(String fr){
        if(fr.equals("Comida")||fr.equals("Olá")){
            System.out.println("Feliz");
        }
        else{
            System.out.println("Latir");
            this.emitirSom();
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Feliz");
        }
        else{
            System.out.println("Latir");
        }}

}
