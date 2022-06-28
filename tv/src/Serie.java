public class Serie extends ProgramaTV {
	
	int temp;
	int eps;
	
	public Serie(int codigo, String nome, String categ, int temp, int eps) {
		super(codigo, nome, categ);
		this.temp = temp;
		this.eps = eps;	}
	public int getTemporadas() {
		return temp;	}
	public void setTemporadas(int temp) {
		this.temp = temp;	}
	public int getEpisodios() {
		return eps;}
	public void setEpisodios(int eps) {
		this.eps = eps;}
	@Override
	public String toString() {
		super.toString();
		String programa = "temporadas : " + temp +"\n";
		programa = programa + "episodios : " + eps +"\n";
		return super.toString() + programa;
	}}