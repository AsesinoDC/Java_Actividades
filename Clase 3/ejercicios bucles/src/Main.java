import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Ejercicio 1: Números primos
        Crea un programa e imprima los primeros “n” números primos.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon el numero");
        int buscarNumero = scanner.nextInt();



        for (int i = 2; i < buscarNumero; i++) {
            if((i % 2) == i + .5){
                System.out.println("Holi");
                System.out.println("Los numero primos son: " + i);
            }
        }
    }
}