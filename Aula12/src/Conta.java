public class Conta {


    public float saldo;
    public int numeroConta;
    public String senha;
    public Cliente titular;



    public boolean sacar(float valor) {

        if(valor > this.saldo) {
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }

    }

    public boolean depositar(float valor) {
        this.saldo += valor;
        return true;
    }

    public String verSaldo() {
        return "Você possui  R$ " + this.saldo;
    }

    public boolean transferir(Conta destino, float valor) {
        if(this.sacar(valor)) {
            return destino.depositar(valor);
        }else{
            return false;
        }

    }

}
