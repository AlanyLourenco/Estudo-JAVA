public class DepositoIdentificado extends Deposito 
{   String cpf;
    DepositoIdentificado(String descricao, double valor, String cpf)
    {   super(descricao, valor);
        this.cpf = cpf;}    
}
