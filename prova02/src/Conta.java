import java.util.ArrayList;
public class Conta {
	
	private String nome;
	private double saldo;
	int mes;
	private ArrayList <Deposito> depositos = new ArrayList<Deposito>();
    private ArrayList <Saque> saques = new ArrayList<Saque>();
    Conta (String nome, int mes, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.mes = mes;}
	void adicionaDeposito(String descricao,  double valor) {
		depositos.add(new Deposito(descricao, valor));}
    void adicionaDeposito(String descricao,  double valor,String cpf) {
		depositos.add(new DepositoIdentificado(descricao, valor,cpf));}
	double totalSaldo() {
		double total = saldo;
		for (int i=0;i<depositos.size();i++) {
			total = total + depositos.get(i).getValor();}
		return total;}
    double saldoRestante()
    {	double total = saldo;
		for (int i=0;i<depositos.size();i++) {
			total = total + depositos.get(i).getValor();}
	for (int i=0;i<saques.size();i++) {
			total = total - saques.get(i).getValor();}
		return total;}
	 public boolean adcionaSaque(int dia, String descricao, double valor)
    {	saques.add(new Saque(descricao, valor, dia));
        if(this.saldoRestante() > valor)
        {return true;}
        else
        {return false;}}

	public String toString() {
		String dadosConta = nome + " - MÊS : " + mes + "\n" + "SALDO : " + saldo + "\n";
		dadosConta = dadosConta + "DEPOSITOS : \n";
		for (int i=0;i<depositos.size();i++) {
			dadosConta = dadosConta + depositos.get(i) + "\n";}
		dadosConta = dadosConta + "SAQUES : \n";
		for (int i=0;i<saques.size();i++) {
			dadosConta = dadosConta + saques.get(i) + "\n";}	
        dadosConta = dadosConta + "SALDO RESTANTE : \n" + this.saldoRestante();
		return  dadosConta;}	
}