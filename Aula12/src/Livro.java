import java.util.Scanner;

public class Livro {

    String nome;
    String descricao;
    String isbn;
    Autor autor;
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
      //  this.autor.lerDados();
        this.autor=new Autor();
        this.autor.lerDados();
    }
    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.isbn);
        System.out.println(this.valor);
        System.out.println(this.paginas);
        this.autor.mostrar();
    }
    public double darDesconto(double porcentagem){
        double desconto= this.valor*porcentagem;
        this.valor -= desconto;
        return  desconto;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (nome != null ? !nome.equals(livro.nome) : livro.nome != null) return false;
        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;
    }




}
