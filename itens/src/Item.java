public class Item {
	
	private String titulo;
	private int ano;
	private String tempo;
	private String comentarios;
	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo = titulo;}
	public int getAno() {
		return ano;}
	public void setAno(int ano) {
		this.ano = ano;}
	public String getTempo() {
		return tempo;}
	public void setTempo(String tempo) {
		this.tempo = tempo;}
	public String getComentarios() {
		return comentarios;}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;}
	public String comum() {
		return "\ntitulo = " + titulo
				+ "\nano = " + ano
				+ "\ntempo = " + tempo
				+ "\ncmentários = " + comentarios;}}