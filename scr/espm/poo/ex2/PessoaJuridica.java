package scr.espm.poo.ex2;

public class PessoaJuridica extends Cliente{ //especializando ou generalizando a classe
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    @Override
    public String toString(){
        return "{nome: " + getNome() + ", cnpj:" + getCnpj() + "conta: " + getConta() + "}";
    }

    
}
