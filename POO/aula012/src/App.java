public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Mamifero m=new Mamifero();
        Reptil r = new Reptil();
        Peixe p=new Peixe();
        Ave a= new Ave();

        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();

    }
}
