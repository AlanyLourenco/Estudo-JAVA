public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String CorEscama) {
        this.corEscama = CorEscama;
    }
    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Vegetal");
    }

    @Override
    public void emitirSom() {
        System.out.println("psssss");
    }
    

}