public class TesteMain {
    public static void main(String[] args) throws Exception {
        Cidade c1=new Cidade();
        c1.setNome("CIT");
        c1.setArea(2005.4f);
        c1.setCod(1001001);
        c1.setPopulacao(7000);

        Cidade c2=new Cidade();
        c2.setNome("CIT");
        c2.setArea(200.4f);
        c2.setCod(1001001);
        c2.setPopulacao(1700000);

        c1.cidadesIguais(c2);
        c1.densidade();
        c2.densidade();

        c1.mostrarDados();
        c2.mostrarDados();
    } 
}
