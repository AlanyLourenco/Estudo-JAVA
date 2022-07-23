public class Combate{
    public static void main (String [] args){
        Lutador l[]= new Lutador [4];
        l[0] =new Lutador("a","FR",28,1.7f,59,2,1,4);
        l[1]= new Lutador("Josefa","RN",79,1.67f,84,7,5,0);
        l[2]= new Lutador("Josealdo","BR",59,1.75f,88,15,7,3);
        l[3]= new Lutador("Charles","BR",32,1.78f,71,31,8,0);

        for(int i=0;i<4;i++){
            l[i].apresentar();
            l[i].status();
        }

        l[1].perderLuta();
        l[2].ganharLuta();
        System.out.println("\n\n\n");
        
        for(int i=0;i<4;i++){
            l[i].apresentar();
            l[i].status();
        }
    }    
}
//Agregação