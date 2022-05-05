package scr.espm.poo.ex2;

public class Conta {
    private int id;
    private Cliente  cliente;
    private double saldo;

    public Conta(Cliente cliente){ //é um métoco construtor então a a letra é mais maiuscúla -> Conta
       this.cliente = cliente;
    }

    public double getSaldo(){
        return this.saldo;
        //this.saldo = this.saldo - valor; //não precisa do this mas é bom colocar
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = saldo - valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
        //this.saldo = this.saldo + valor; //não precisa do this mas é bom colocar
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }
    }
    public Cliente getCliente(){
        return cliente;
    }
}
