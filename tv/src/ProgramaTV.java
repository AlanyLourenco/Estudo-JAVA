import java.util.ArrayList;

public class ProgramaTV {
	
	private static int ID = 0;
	String nome;
	int cod;
	ArrayList <Pessoa> artistas = new ArrayList <Pessoa>();
	ArrayList <Serie> series = new ArrayList <Serie>();
	String categoria;
	Pessoa diretor;
	ProgramaTV(int cod, String nome, String cat) {
		this.cod = getNextMatricula();
		this.nome = nome;
		this.categoria = cat;}
	
	public static int getNextMatricula() {
		return ID++;}
	void setDiretor(Pessoa diretor){
		this.diretor = diretor;}
	void setArtistas(Pessoa artista) {
		artistas.add(artista);}
	void setSerie(Serie serie) {
		series.add(serie);}
	
	public String toString() {
		String programa = cod + "-" + nome + " (" + categoria + ")\n";
		programa = programa + "diretor : " + diretor +"\n";
		programa = programa + "artistas : \n";
		for (int i=0;i<artistas.size();i++) {
			programa = programa + artistas.get(i) + "\n";}
		return programa;}}