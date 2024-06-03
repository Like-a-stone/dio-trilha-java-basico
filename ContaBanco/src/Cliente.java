public class Cliente {
    private String nomeCliente;
    private String cpf;
    private int idade;
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
}
