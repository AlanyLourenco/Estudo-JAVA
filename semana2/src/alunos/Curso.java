package alunos;
public class Curso {
	private String nome;
	private String sigla;
	private Departamento dep = new Departamento();
	public Curso() {
	}
	public String getNome() {
		return nome;}
	public void setNome(String nome) {
		this.nome = nome;}
	public String getSigla() {
		return sigla;}
	public void setSigla(String sigla) {
		this.sigla = sigla;}
	public Departamento getDepartamento() {
		return dep;}
	public void setDepartamento(Departamento departamento) {
		this.dep = departamento;}}