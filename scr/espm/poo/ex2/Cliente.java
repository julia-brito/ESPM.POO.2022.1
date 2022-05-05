package scr.espm.poo.ex2;

public class Cliente {
    private String nome;
    private String sobrenome;
    private Conta conta;

    public Cliente(){
        conta = new Conta(this);
    }

    public void setNome(String nome){
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public Conta getConta(){
        return conta;
    }
}
