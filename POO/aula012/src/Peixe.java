public class Peixe extends Reptil {

    public void bolhas(){
        System.out.println("Soutando bolha");
    }

    @Override
    public void alimentar() {
        System.out.println("Plancton");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub");
    }

    @Override
    public String getCorEscama() {
        return super.getCorEscama();
    }

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void setCorEscama(String CorEscama) {
        super.setCorEscama(CorEscama);
    }
   
    
}
