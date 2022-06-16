import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //entre 0 e 1
        double dado =  Math.random();
        System.out.println(dado);

        //entre 1 e <8
        double dado2 =  Math.random() *8;
        System.out.println(dado2);

        //inteiro entre 1 e 8
        int dado3 =  1 + (int)(Math.random() *8);
        System.out.println(dado3);

        //classe random
        //objeto=gerador
        Random gerador= new Random();
        //gerar numero entre 1 e 6
        //6 maior numero e 1 o menor
        int numero =gerador.nextInt(6);
        System.out.println(numero);
        
        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado? ");
        int facesDado= Integer.parseInt(facesString);
        
        int resultado=1+gerador.nextInt(facesDado);
        JOptionPane.showMessageDialog(null, "Voce tirou "+ resultado + " no dado");

    }
}
