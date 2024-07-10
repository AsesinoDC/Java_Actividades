import java.util.Scanner;

public class actividad {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el mensaje a cifrar");
        String mensaje = scanner.nextLine().toLowerCase();

        System.out.println("Escribe el desplazamiento");
        int desplazamiento = scanner.nextInt();
        String cifrado = "";
        char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            for (int j = 0; j < abecedario.length; j++) {
                if(caracter == abecedario[j]){
                    if (caracter + desplazamiento <= 'z') {
                        char letraSeleccion = abecedario[j + desplazamiento];
                        System.out.println("las letras son: " + abecedario[j + desplazamiento]);
                        cifrado += letraSeleccion;
                    }
                    else {
                        char letraAtras = abecedario[0 + desplazamiento];
                        cifrado += letraAtras;
                    }
                }
            }
        }

        System.out.println(cifrado);

        scanner.close();

    }
}
