public class Cd extends Item{
	private String artista;
	private int qtdFaixas;
	public String getArtista() {
		return artista;}
	public void setArtista(String artista) {
		this.artista = artista;}
	public int getQtdFaixas() {
		return qtdFaixas;}
	public void setQtdFaixas(int qtdFaixas) {
		this.qtdFaixas = qtdFaixas;}
	public String especifico() {
		return "\nartista = " + artista
				+ "\nquantidade de Faixas = " + qtdFaixas;}}