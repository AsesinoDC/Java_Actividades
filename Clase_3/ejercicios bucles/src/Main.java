import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Ejercicio 1: Números primos
        Crea un programa e imprima los primeros “n” números primos.*/
        Scanner scanner = new Scanner(System.in);
        /*

        System.out.println("Pon el numero");
        int buscarNumero = scanner.nextInt();


        for (int i = 2; i < buscarNumero; i++) {

            if((i / i) == Math.sqrt()){
                System.out.println("Los numeros primos son: " + i);
            }
            else{
                System.out.println("Holi");
            }
        }*/

        /*Ejercicio 2: Tabla de multiplicación
         Crea un programa que pida al usuario un número e imprima la tabla
        de multiplicar del 1 al 10 del número ingresado.*/

        /*System.out.println("Pon un numero para multiplicar");
        int numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero +" * " + i + ": " + (numero * i));
        }*/

        /*Ejercicio 3: Número de Fibonacci:
        Crea un programa e imprima los primeros “n” números de Fibonacci.*/

        System.out.println("Numero fibonacci");
        int fibonacci = scanner.nextInt();

        int[] listaFibonashi = new int[fibonacci];

        listaFibonashi[0] = 0;
        listaFibonashi[1] = 1;

        for (int i = 0; i < fibonacci; i++) {
            System.out.println("list: " + listaFibonashi[listaFibonashi.length - (i + 1)]);
            if (i >= 2) {
                System.out.println("i" + i);
                int result = listaFibonashi[i-1] + listaFibonashi[i];
                listaFibonashi[i] = result;
            }
            System.out.println(listaFibonashi[i]);
        }

    }
}