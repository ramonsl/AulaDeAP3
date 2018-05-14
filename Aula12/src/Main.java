import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Livro book1 = new Livro();
        book1.lerDados();
        book1.mostrar();
        double desc=book1.darDesconto(0.2);
        book1.mostrar();
        System.out.println("Desconto dado "+ desc);


    }
}
