package scanner.src;

import java.util.Scanner;

public class FunctionScanner {
    public static void main(String[] args) throws Exception {
        int number;
        String name;
        
        //scanner -> classe
        Scanner reader = new Scanner(System.in);
        //necessario para o uso de espaços pois define que os separadores são \r e \n
        //[] siguinifica ou 
        //+ significa que eles podem se repetir
        reader.useDelimiter("[\r\n]+");
        
        System.out.println("Type a number ");
        number = reader.nextInt();
        System.out.println("Your number is "+ number);
       
        System.out.println("What's your name? ");
        //name = reader.next();
        name= reader.nextLine();
        System.out.format("Your name is: %s ",name);

        


    }
}
