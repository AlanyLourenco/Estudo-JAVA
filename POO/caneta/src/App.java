public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1=new Caneta();
        c1.cor="Azul";
        c1.modelo="BIC";
        //c1.tampada=false;
        //c1.ponta=0.5;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.rabiscar();

        //Caneta c2= new Caneta();
        //System.out.println("Hello, World!");
    }
}
// +: publico- classe atual e todas as outras
// -: privado- somente classe atual
// #: protegido- classe atual e sub-classes