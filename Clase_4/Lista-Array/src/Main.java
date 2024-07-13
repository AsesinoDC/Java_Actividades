import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personas = {"ana", "andres", "narciris"};

        int[] numeros = new int[3];

        System.out.println("Ingrese 3 numeros: ");

        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();

        System.out.println(numeros); //metodo que se llama .toString

        //for normal
        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
            System.out.println("Numero" + (i + 1) + numeros[i]);
        }

        //foreach
        for (int num: numeros){
            System.out.println("Numero" + num);
        }


        // Matrices
        // fila/columna
        int[][] matrix = new int[2][3];

        //fila1
        matrix[0][0] = 3; //columna 1
        matrix[0][1] = 3; //columna 1
        matrix[0][2] = 3; //columna 1

        //fila2
        matrix[1][0] = 3; //columna 1
        matrix[1][1] = 3; //columna 1
        matrix[1][2] = 3; //columna 1

        for (int i = 0; i < 2.; i++) {
            for (int j = 0; j < 2; j++) {

            }
        }


        for (int[] fila: matrix) {
            for (int col : fila){

            }
        }
    }
}