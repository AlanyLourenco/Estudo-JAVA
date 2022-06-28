import java.util.ArrayList;

public class MainItens {

	public static void main(String[] args) {
		ArrayList<Item> list= new ArrayList<Item>();
			Cd cd1 = new Cd();
			cd1.setTitulo("cd1");
			cd1.setAno(1);
			cd1.setTempo("1:00");
			cd1.setComentarios("comentários- cd1");
			cd1.setArtista("artista- cd1");
			cd1.setQtdFaixas(1);
			list.add(cd1);
			
			Cd cd2 = new Cd();
			cd2.setTitulo("cd2");
			cd2.setAno(2);
			cd2.setTempo("2:00");
			cd2.setComentarios("comentários- cd2");
			cd2.setArtista("artista- cd2");
			cd2.setQtdFaixas(2);
			list.add(cd2);
			
			Cd cd3 = new Cd();
			cd3.setTitulo("cd3");
			cd3.setAno(3);
			cd3.setTempo("3:00");
			cd3.setComentarios("comentários- cd3");
			cd3.setArtista("artista- cd3");
			cd3.setQtdFaixas(3);
			list.add(cd3);
			
			Filme filme1 = new Filme();
			filme1.setTitulo("filme 01");
			filme1.setAno(1);
			filme1.setTempo("1:00");
			filme1.setComentarios("comentários- Filme 01");
			filme1.setDiretor("diretor- 01");
			
			list.add(filme1);

			Filme filme2 = new Filme();
			filme2.setTitulo("filme 02");
			filme2.setAno(2);
			filme2.setTempo("2:00");
			filme2.setComentarios("comentários- Filme 02");
			filme2.setDiretor("diretor- Filme 02");
			list.add(filme2);

			Filme filme3 = new Filme();
			filme3.setTitulo("filme 03");
			filme3.setAno(3);
			filme3.setTempo("3:00");
			filme3.setComentarios("comentários- Filme 03");
			filme3.setDiretor("diretor- Filme 03");
			list.add(filme3);
			
			Filme filme4 = new Filme();
			filme4.setTitulo("filme 04");
			filme4.setAno(4);
			filme4.setTempo("4:00");
			filme4.setComentarios("comentários- Filme 04");
			filme4.setDiretor("diretor- Filme 04");
			list.add(filme4);
			
			Jogo jogo1 = new Jogo();
			jogo1.setTitulo("Jogo 01");
			jogo1.setAno(1);
			jogo1.setTempo("1:00");
			jogo1.setComentarios("comentários- Jogo 01");
			jogo1.setNJogadores(1);
			jogo1.setPlataforma("plataforma- Jogo 01");
			list.add(jogo1);
			
			Jogo jogo2 = new Jogo();
			jogo2.setTitulo("Jogo 02");
			jogo2.setAno(2);
			jogo2.setTempo("2:00");
			jogo2.setComentarios("comentários- Jogo 02");
			jogo2.setNJogadores(2);
			jogo2.setPlataforma("plataforma- Jogo 02");
			list.add(jogo2);
			
			Jogo jogo3 = new Jogo();
			jogo3.setTitulo("Jogo 03");
			jogo3.setAno(3);
			jogo3.setTempo("3:00");
			jogo3.setComentarios("comentários- Jogo 03");
			jogo3.setNJogadores(3);
			jogo3.setPlataforma("plataforma- Jogo 03");
			list.add(jogo3);
		
			for(int i = 0; i < 10; i++) {
			System.out.print(list.get(i).comum());
			if(list.get(i) instanceof Cd) {
				System.out.println(((Cd) list.get(i)).especifico());
			} else if(list.get(i) instanceof Filme) {
				System.out.println(((Filme) list.get(i)).especifico());
			}else if(list.get(i) instanceof Jogo) {
				System.out.print(((Jogo) list.get(i)).especifico());
				System.out.println(((Jogo) list.get(i)).showPlataforma());}}}}
