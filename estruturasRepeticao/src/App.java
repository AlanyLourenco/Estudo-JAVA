import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int cont=0;
        while(cont<5){
        System.out.println("Hello, World!");
        cont++;}
    for(int conta=0;conta<6;conta++) {
        System.out.println(conta+1);
    }  
    Random ale =new Random();
    int num = 1 + ale.nextInt(5);
    while(num!=4){
        System.out.println(num);
        num = 1 + ale.nextInt(5);
    }
    
    System.out.println(num);
 }

}
