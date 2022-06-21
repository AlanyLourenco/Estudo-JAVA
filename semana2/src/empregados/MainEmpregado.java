package empregados;
import javax.swing.JOptionPane;
public class MainEmpregado {
	private static int i = 0;
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de empregados"));
		Empregado empregado[] = new Empregado[n];
		for(i = 0; i < n; i++) {
			empregado[i] = new Empregado();}
		for(i = 0; i < n; i++){
			String nome = JOptionPane.showInputDialog("Nome do empregado");
			empregado[i].setNome(nome);
			String matricula = JOptionPane.showInputDialog("Matricula do empregado");
			empregado[i].setMatricula(matricula);
			String cnpj = JOptionPane.showInputDialog("CNPJ da empresa");
			empregado[i].getEmpresa().setCnpj(cnpj);	
			String razaoSocial = JOptionPane.showInputDialog("Razao social da empresa");
			empregado[i].getEmpresa().setRazaoSocial(razaoSocial);
			JOptionPane.showMessageDialog(null, "Endereço da empresa", "Endereço da Empresa", 1);
			String rua = JOptionPane.showInputDialog("Rua");
			empregado[i].getEmpresa().getEndereco().setRua(rua);			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			empregado[i].getEmpresa().getEndereco().setNumero(numero);					
			String complemento = JOptionPane.showInputDialog("Complemento");
			empregado[i].getEmpresa().getEndereco().setComplemento(complemento);		
			String cep = JOptionPane.showInputDialog("CEP");
			empregado[i].getEmpresa().getEndereco().setCep(cep);	
			String bairro = JOptionPane.showInputDialog("Bairro");
			empregado[i].getEmpresa().getEndereco().setBairro(bairro);		
			String cidade = JOptionPane.showInputDialog("Cdade");
			empregado[i].getEmpresa().getEndereco().setCidade(cidade);
			String estado = JOptionPane.showInputDialog("Estado");
			empregado[i].getEmpresa().getEndereco().setEstado(estado);		
			JOptionPane.showMessageDialog(null, empregado[i].toString(), "Empregado" + empregado[i].getNome(), 1);}
		for (i=0; i<n; i++) {
			System.out.println(empregado[i].toString() + "\n");}}}
