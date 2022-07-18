public class ContaBanco{
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumconta() {
        return numconta;}
    public void setNumconta(int n) {
        this.numconta = n;}

    public String getTipo() {
        return tipo;}
    public void setTipo(String t) {
        this.tipo = t;}   

    public String getDono() {
        return dono;}
    public void setDono(String d) {
        this.dono = d;} 

    public float getSaldo() {
        return saldo;}
    public void setSaldo(Float s) {
        this.saldo = s;}

    public boolean getStatus() {
        return status;}
    public void setStatus(Boolean st) {
        this.status = st;}

    public void abrirConta(String t){
        setTipo(t);
        this.status=true;
        if (t=="CC"||t=="Cc"||t=="cc"||t=="cC"){
            this.saldo=50f;
        }
        else if (t=="CP"||t=="cp"||t=="Cp"||t=="cP"){
            this.saldo=150f;
        }
    }
    public void fecharConta(){
        if(this.saldo>0){
            System.out.println("\nConta com dinheiro\n");
        }
        else if(this.saldo<0){
            System.out.println("\nConta com em débito\n");
        }
        else{
            this.status=false;
        }        
    }
    public void depositar(float v){
        if(this.status==true){
            //this.saldo=this.saldo+v; ou setSaldo(getSaldo()+v)
            setSaldo(getSaldo()+v);
        }
        else{
            System.out.println("\nIMPOSSIVEL depositar\n");
        }
    }
    public void sacar(float v){
        if (this.status==true){
            if(getSaldo()>v){
                setSaldo(getSaldo()-v);
            }
            else{
                System.out.println("\nSaldo insufissiente\n");
            }
        }
        else{
            System.out.println("\nIMPOSSIVEL sacar\n");
        }
    }
    /*public void pagarMensalidade(){
        private float val;

    }*/


}