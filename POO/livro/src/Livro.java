public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtt;
    private boolean aberto;
    private Pessoa leitor;

    //public void detalhes(){}

    public Livro(String titulo,String autor,int totPag,/*int pagAtt,boolean aberto,*/Pessoa leitor){
        this.titulo=titulo;
        this.autor=autor;
        this.totPag=totPag;
        this.pagAtt=0;
        this.aberto=false;
        this.leitor=leitor;

    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public int getPagAtt() {
        return pagAtt;
    }
    public void setPagAtt(int pagAtt) {
        this.pagAtt = pagAtt;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
     @Override
    public String toString() {
        System.out.println("_________________________________________________________");
        return "Livro{"+" \nTitulo= "+titulo+", \nAutor= "+ autor+", \nTotal de paginas= "+totPag+", \nPagina atual= "+pagAtt+", \nAberto= "+aberto+", \nLeitor= "+this.leitor.getNome()+"\nIdade= "+leitor.getIdade()+"\nSex= "+leitor.getSex()+"}";
    }
    
    
    
    @Override
    public void abrir() {
        this.aberto=true;
    }
    @Override
    public void fechar() {
        this.aberto=false; 
    }
    @Override
    public void folhear(int p) {
        if(p>this.totPag){
            this.pagAtt=0;
        }
        else{
        this.pagAtt=p;  }
    }
    @Override
    public void proxPag() {
        this.pagAtt++; 
    }
    @Override
    public void pagAnt() {
        this.pagAtt--;
        
    }
}
