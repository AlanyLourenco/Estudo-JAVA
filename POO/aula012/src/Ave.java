public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("Construindo Ninho...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        System.out.println("Fruta");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Canto");
        
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
        
    }
}
