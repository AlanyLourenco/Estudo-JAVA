public abstract class Conta {
	
	private long numero;
	
	Cliente cliente;
	private double saldo;
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public abstract void transferir(Conta conta, double valor);

	public String toString() {
		return "Número da Conta = " + numero
				+ cliente.toString()
				+ "\nSaldo da Conta = " + saldo;
	}
	
}