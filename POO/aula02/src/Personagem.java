public class Personagem{
    String nome;
    int nivel;
    int forca;

    void statusPer(){
        System.out.format("personagem: %s com %d de força.\n",nome,forca);
    }

    void atacar(String alvo){
        System.out.format("personagem: %s atacou %s com %d de dano.\n",nome,alvo,forca);
    }
}