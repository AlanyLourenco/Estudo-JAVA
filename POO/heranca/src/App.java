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

        p2.setCurso("E.S");
        p3.setSalario(5000f);
        p4.setSetor("INF.");


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
