public class Jogo extends Item{
	
	private int nJogadores;
	private String plataforma;
	
	public int getNJogadores() {
		return nJogadores;}
	public void setNJogadores(int nJogadores) {
		this.nJogadores = nJogadores;}
	public String getPlataforma() {
		return plataforma;}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;}
	public String especifico() {
		return "\nnumero de Jogadores: " + nJogadores;}
	public String showPlataforma() {
		return "\nPlataforma = " + plataforma;
	}}