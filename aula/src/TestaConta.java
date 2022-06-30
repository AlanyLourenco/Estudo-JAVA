import java.util.ArrayList;

import javax.swing.JOptionPane;
public class TestaConta {
	public static void main(String[] args) {

		ArrayList<Conta> list = new ArrayList<Conta>();
		int num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("1 corrente   2 conta salário   3 poupança"));
			if(num == 0) {
				break;}
			String nome = JOptionPane.showInputDialog("Nome: ");
			String telefone = JOptionPane.showInputDialog("telefone: ");
			Cliente cliente = new Cliente(nome, telefone);
			long numero = Long.parseLong(JOptionPane.showInputDialog("número da conta: "));
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo da conta: "));
			if(num == 1) {
				Conta newConta = new ContaCorrente();	
				newConta.setCliente(cliente);
				newConta.setNumero(numero);
				newConta.setSaldo(saldo);
				list.add(newConta);}
            else if(num == 2) {
				Conta newConta = new ContaCorrente();	
				newConta.setCliente(cliente);
				newConta.setNumero(numero);
				newConta.setSaldo(saldo);
				list.add(newConta);}
            else if(num == 3) {
				Conta newConta = new ContaCorrente();
				newConta.setCliente(cliente);
				newConta.setNumero(numero);
				newConta.setSaldo(saldo);
				list.add(newConta);}
            else {    
				break;}
		}while(num != 0);
		for(int i = 0; i < list.size(); i++) {
			JOptionPane.showMessageDialog(null, list.get(i).toString());
			System.out.println(list.get(i).toString() + "\n");	
		}}}



