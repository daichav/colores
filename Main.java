// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Lista de colores");
        System.out.println("Cuantos colores quieres introducir");
        int numColores = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i = 1; i <= numColores; i++) {
            System.out.println("Introduce el color nº" + i + ":");
            String color = input.next(); // va a guardar el contenido dentro de color
            colores.add(color);
        }

        System.out.println("Ha introducido los siguientes colores: ");

        for (int i = 0; i < colores.size(); i++) {
            System.out.println("\t" + colores.get(i));
        }
        System.out.println("\n" + colores.toString());


        input.close();
    }
}
