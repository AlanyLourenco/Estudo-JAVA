public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Pessoa[] p= new Pessoa[2];
        Livro[] l= new Livro[2];

        p[0]=new Pessoa("Alany",19,"F");
        p[1]=new Pessoa("Filipe",20,"M");
        /*p[2]=new Pessoa("Arthur Conan Doyle",50,"M");
        p[3]=new Pessoa("Miguel de Cervantes Saavedra", 40, "M");*/

        l[0]=new Livro("sherlock holmes","Arthur Conan Doyle", 1000, p[1]);
        l[1]=new Livro("Dom Quixote de la Mancha","Miguel de Cervantes Saavedra", 1000, p[0]);

        l[0].abrir();
        l[0].folhear(500);
        l[0].proxPag();

        System.out.println(l[0].toString());
        System.out.println(l[1].toString());
    }
}
