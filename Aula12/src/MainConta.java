public class MainConta {
    public static void main(String[] args) {



        Conta c1= new Conta();
        c1.senha="1q2w3e";
        Cliente cliente= new Cliente();
        c1.titular=cliente;
        c1.saldo=100;
        c1.numeroConta = Banco.numeroConta;
        Banco.numeroConta++;



        Conta c2= new Conta();
        c2.senha="1q2w3e";
        Cliente cliente2= new Cliente();
        c2.titular=cliente;
        c2.saldo=100;
        c2.numeroConta = Banco.numeroConta;
        Banco.numeroConta++;
    }

}

