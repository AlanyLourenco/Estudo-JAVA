public class TesteMain {
    public static void main(String[] args) throws Exception {
        Cidade c1=new Cidade("1001001","CIT",2005.4);
       
        c1.setPopulacao(7000);

        Cidade c2=new Cidade("1001001","CIT",200.4);
        c2.setPopulacao(1700000);

        c1.cidadesIguais(c2);
        c1.densidade();
        c2.densidade();

       System.out.println(c1.mostrarDados());
        //c2.mostrarDados();
    } 
}
