//músicas: precisamos do nome, ano, tipo e compositor; 
//compositores: precisamos do nome e da nacionalidade;
package musicas;
import javax.swing.JOptionPane;
public class MainMusica {
	public static void main(String[] args) {						
		int m = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de músicas"));
		Musica musicas[] = new Musica[m];
		int i = 0;
		for(i=0; i < m; i++) {
			musicas[i] = new Musica();}
		for(i = 0; i < m; i++){
			String newNome = JOptionPane.showInputDialog("Nome");
			musicas[i].setNome(newNome);
			String newAno = JOptionPane.showInputDialog("Ano");
			musicas[i].setAno(newAno);
			String newTipo = JOptionPane.showInputDialog("Tipo");
			musicas[i].setTipo(newTipo);
			String newNomeComp = JOptionPane.showInputDialog("Compositor");
			musicas[i].getCompositor().setNomeComp(newNomeComp);
			String newNacionalidade = JOptionPane.showInputDialog("Nacionalidade do Compositor");
			musicas[i].getCompositor().setNacionalidade(newNacionalidade);		
			JOptionPane.showMessageDialog(null, musicas[i].toString(), "Música", 1);
		}
		for (i=0; i<m; i++) {
				musicas[i].toString();
				//JOptionPane.showMessageDialog(null, musicas[i].toString());
				System.out.println(musicas[i].toString() + "\n");
			}}}
