public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtt;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, /*int pagAtt, boolean aberto,*/ Pessoa leitor){
        this.titulo=titulo;
        this.autor=autor;
        this.totPag=totPag;
        /*this.pagAtt=pagAtt;
        this.aberto=aberto;*/
        this.leitor=leitor;
    }

    /*public String detalhes(){
        String a1="alany";
        return a1;
    }*/

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtt() {
        return pagAtt;
    }
    public void setPagAtt(int pagAtt) {
        this.pagAtt = pagAtt;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        this.aberto=true;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fechar() {
        this.aberto=false;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void folhear(int p) {
        this.pagAtt=p;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void avancarPag() {
        this.pagAtt--;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void voltarPag() {
        this.pagAtt--;
        // TODO Auto-generated method stub
        
    }
    @Override
    public String toString() {
        return "Livro{"+" Litulo= "+titulo+", Autor= "+autor+", Total paginas= "+totPag+", Pagina atual= "+pagAtt+", Aberto= "+aberto+", Leitor= "+leitor+"}";
    }
    
}
