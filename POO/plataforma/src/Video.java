public class Video implements AcoesVideo {
    private String titulo;
    
    private int avaliacao;
    
    private float views;
    
    private int curtidas;
    
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo=titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public float getViews() {
        return views;
    }
    public void setViews(float views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void like() {
        
    }

    @Override
    public void pause() {
        
        
    }

    @Override
    public void play() {
        
    }

    @Override
    public String toString() {
        System.out.println("_________________________________________________________");
        return "Video{"+" \nTitulo= "+titulo+", \nAvaliações = "+ avaliacao+",\nViews= "+views+", \nCurtidas = "+curtidas+", \nReproduzindo= "+reproduzindo+"}";
    }
    
}
