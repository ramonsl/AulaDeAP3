import java.util.Scanner;

public class Livro {

    String nome;
    String descricao;
    String isbn;
    double valor;
    int paginas;

    public void lerDados(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome");
        this.nome= tc.next();
        System.out.println("Digite a descrição");
        this.descricao= tc.next();
        System.out.println("Digite o isbn");
        this.isbn= tc.next();
        System.out.println("Digite o valor");
        this.valor =tc.nextDouble();
        System.out.println("Digite paginas");
        this.paginas =tc.nextInt();
    }
    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.isbn);
        System.out.println(this.valor);
        System.out.println(this.paginas);
    }
    public double darDesconto(double porcentagem){

        double desconto= this.valor*porcentagem;
        this.valor -= desconto;
        return  desconto;

    }

}
