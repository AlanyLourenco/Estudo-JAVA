package uml;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main 
{   public static void main(String[] args)
    {   ArrayList <Titular> titulares = new ArrayList <Titular>();
        int testes = 3;

        for(int i = 0; i < testes; i++)
        {  //Solicitar ao usuário usando JoptionPane os dados dos titulares
            //À medida que o usuário informar os dados o sistema deve instanciar os sócios titular e armazená-los em uma lista de sócios (ainda sem os dependentes)
            String nome = JOptionPane.showInputDialog("NOME TITULAE: ");
           int idade = Integer.parseInt(JOptionPane.showInputDialog("IDADE TITULAR: "));
           String exo = JOptionPane.showInputDialog("SEXO TITULAR: ");
           char sexo = exo.charAt(0);
           int numTitulo = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DO TITULO DO TITIULAR: "));
           Titular titu = new Titular(nome, idade, sexo, numTitulo);
           titulares.add(titu);
        }


        for(int i = 0; i < titulares.size(); i++)
        { int dep = Integer.parseInt( JOptionPane.showInputDialog( "PARA: " + titulares.get(i).getNome() + " COM NUMERO: " + titulares.get(i).getNumTitulo() + " DIGITE A QUANTIDADE DE DEPENDENTES"));
          if(dep>0)
            {  for(int j = 0; j < dep; j++)
                {   String nome = JOptionPane.showInputDialog("NOME DEPENDENTE: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("IDADE DEPENDENTE: "));
                    String exo = JOptionPane.showInputDialog("SEXO DEPENDENTE: ");
                    char sexo = exo.charAt(0);
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("TIPO DEPENDENTE: "));

                    titulares.get(i).associarObjetos(new Dependente(nome, idade, sexo, tipo));
                }}}
        for(int i = 0; i < titulares.size(); i++){ 
            JOptionPane.showMessageDialog(null,titulares.get(i));}}}
            //Percorrer novamente a lista de sócios e mostrar o valor da mensalidade de cada sócio titular (mensalidade do titular + dos seus dependentes) usando o método calculaValorMensalidade.