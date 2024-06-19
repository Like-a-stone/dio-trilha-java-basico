public class Conta {
    private int agencia;
    private int conta;
    private String nomeCliente;
    private double saldo;
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        this.saldo =+ valor;
    }



}
