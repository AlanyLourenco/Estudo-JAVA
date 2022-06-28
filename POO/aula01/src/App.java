public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //celulares sendo criados
        //iphone 12
        //note20 ultar
        //xiomi mi 11 pro

        //declarando objeto do tipo celular
        //instanciando objeto= criar novo
        Celular celular =new Celular();
        
        celular.nome="iphone 12";
        celular.tela=6.1f;
        celular.armazenamento=256;
        celular.sistemaOperacional= "IOS";

        System.out.format("Celular %s com tela de %.1f com %d gb e s.o. %s\n",celular.nome,celular.tela,celular.armazenamento,celular.
        sistemaOperacional);

        Celular celular02 =new Celular();
        
        celular02.nome="note";
        celular02.tela=6.9f;
        celular02.armazenamento=256;
        celular02.sistemaOperacional= "ANDROID";

        System.out.format("Celular %s com tela de %.1f com %d gb e s.o. %s\n",celular02.nome,celular02.tela,celular02.armazenamento,celular02.sistemaOperacional);
    }
}
