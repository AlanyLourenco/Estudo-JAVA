import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //soma
        int numero=-5;
        int numeroa=6;
        int resultado=numero+numeroa;
        JOptionPane.showMessageDialog(null,resultado,"Matemática",JOptionPane.INFORMATION_MESSAGE);

        //converter operação com inteiiros para não racional
        //divisão
        double resultado2= (double) 5/2;
        JOptionPane.showMessageDialog(null,resultado2,"Matemática",JOptionPane.INFORMATION_MESSAGE);

        //++ cont = imprime cont+
        //cont++ impre cont e incrementa variavel depois

        //Math

        //retorna positivo
        int resultado3= Math.abs(numero);
        JOptionPane.showMessageDialog(null,resultado3,"Matemática",JOptionPane.INFORMATION_MESSAGE);

        //Potencia
        double resultado4= Math.pow(numeroa,2);
        //ou  int resultado4=(int) Math.pow(numeroa,2);
        JOptionPane.showMessageDialog(null,resultado4,"Matemática",JOptionPane.INFORMATION_MESSAGE);

        /*Raiz
        double resultadox= Math.sqrt(numeroa);
        
        Arendondar para sucessor
        double resultadox= Math.ceil(numeroa);

        Arendondar para antecessor
        double resultadox= Math.floor(numeroa);

        Menor de 2
        double resultadox= Math.min(numeroa,8);

        Maior de 2
        double resultadox= Math.max(numeroa,8);
        */
        

    }
}
