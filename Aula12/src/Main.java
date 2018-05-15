import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Livro book1 = new Livro();
        book1.lerDados();
        book1.mostrar();


        if(!book1.darDesconto(0.5)){
            System.out.println("Impossivel aplicar esse desconto");
        }


        book1.mostrar();



    }
}
