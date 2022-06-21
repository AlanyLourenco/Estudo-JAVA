package alunos;
import javax.swing.JOptionPane;
public class MainAluno {
	public static void main(String[] args) {
				
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
		Aluno aluno[] = new Aluno[n];
		int i = 0;
				
		for(i=0; i < n; i++) {
			aluno[i] = new Aluno();}
				
		for(i = 0; i < n; i++){
			String newNome = JOptionPane.showInputDialog("Nome do aluno: ");
			aluno[i].setNome(newNome);	
			String newMatricula = JOptionPane.showInputDialog("Matricula do aluno: ");
			aluno[i].setMatricula(newMatricula);	
			int newAno = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			aluno[i].setAno(newAno);
			String newNomeCurso = JOptionPane.showInputDialog("Nome do curso");
			aluno[i].getCurso().setNome(newNomeCurso);		
			String newSiglaCurso = JOptionPane.showInputDialog("Sigla do curso");
			aluno[i].getCurso().setSigla(newSiglaCurso);
			String newNomeDep = JOptionPane.showInputDialog("Nome do departamento");
			aluno[i].getCurso().getDepartamento().setNome(newNomeDep);		
			String newSiglaDep = JOptionPane.showInputDialog("Sigla do departamento");
			aluno[i].getCurso().getDepartamento().setSigla(newSiglaDep);
			JOptionPane.showMessageDialog(null, aluno[i].toString(), "Aluno" + aluno[i].getMatricula(), 1);}
		for (i=0; i<n; i++) {
			System.out.println(aluno[i].toString() + "\n");}}}
