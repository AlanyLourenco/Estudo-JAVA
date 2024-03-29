import javax.swing.JOptionPane;

public class Cadastro {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Cadastre os Saques/Depositos de uma Conta");
		String nome = JOptionPane.showInputDialog(null,"Entre com o nome da Conta : ");
		int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o Mês : "));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o saldo de " + nome + " para o mês " + mes + " : "));
		
		Conta conta = new Conta(nome, mes, saldo);
		
        conta.adicionaDeposito("DOAÇÃO", 5000.00 , "123456789");

		String resp = JOptionPane.showInputDialog(null,"Entrar com: SAQUES/DEPOSITOS " + nome + " ? (S/N)");
		while (resp.toUpperCase().equals("S")) {
			String tipo = JOptionPane.showInputDialog(null,"Saque ou Deposito ? (S/D)");
			String descricao = JOptionPane.showInputDialog(null,"descricao :");
			double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor : "));
			
			if (tipo.toUpperCase().equals("D"))
				conta.adicionaDeposito(descricao, valor);
            
            if(tipo.toUpperCase().equals("S"))
            {
                int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dia : "));
                conta.adcionaSaque(dia, descricao, valor);
            }

			resp = JOptionPane.showInputDialog(null,"Adicionar novo Saque / Deposito da conta " + nome + " ? (S/N)");
			
		}		
		JOptionPane.showMessageDialog(null,conta);
				
	}
}

