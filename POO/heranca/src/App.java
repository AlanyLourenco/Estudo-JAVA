public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Pessoa p1=new Pessoa();
        Aluno p2= new Aluno();
        Professor p3= new Professor();
        Funcionario p4=new Funcionario();

        p1.setNome("Alany");
        p2.setNome("Filipe");
        p3.setNome("Gabriely");
        p4.setNome("Silva");

        System.out.println(p1.toString());
    }
}
