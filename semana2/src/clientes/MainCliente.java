package clientes;
import javax.swing.JOptionPane;
public class MainCliente {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Número de clientes"));
		Cliente cliente[] = new Cliente[n];
		int i = 0;				
		for(i=0; i < n; i++) {
			cliente[i] = new Cliente();}				
		for(i = 0; i < n; i++){
			String nome = JOptionPane.showInputDialog("Nome do cliente");
			cliente[i].setNome(nome);
			String cpf = JOptionPane.showInputDialog("CPF do cliente");
			cliente[i].setCpf(cpf);
			String rua = JOptionPane.showInputDialog("Rua");
			cliente[i].getEndereco().setRua(rua);				
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
			cliente[i].getEndereco().setNumero(numero);			
			String complemento = JOptionPane.showInputDialog("Complemento");
			cliente[i].getEndereco().setComplemento(complemento);	
			String cep = JOptionPane.showInputDialog("CEP");
			cliente[i].getEndereco().setCep(cep);	
			String bairro = JOptionPane.showInputDialog("Bairro");
			cliente[i].getEndereco().setBairro(bairro);		
			String cidade = JOptionPane.showInputDialog("Cidade");
			cliente[i].getEndereco().setCidade(cidade);
			String estado = JOptionPane.showInputDialog("Estado");
			cliente[i].getEndereco().setEstado(estado);		
			JOptionPane.showMessageDialog(null, cliente[i].toString(), "Cliente" + cliente[i].getNome(), 1);}
		for (i=0; i<n; i++) {
			System.out.println(cliente[i].toString() + "\n");}}}