public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Personagem heroi= new Personagem();
        heroi.nome="hercules";
        heroi.nivel=3;
        heroi.forca=10;

        heroi.statusPer();
        heroi.atacar("hydra");
    }
}
