import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class tallerSegundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**Ejercicio 16: Contraseña segura
        Crea un programa que valide si una contraseña es segura o no, que
        responda con un booleano. (Una contraseña segura debe contener
        mínimo 8 caracteres con al menos 1 mayúscula, 1 minúscula y 1
        carácter espacial) */    

        /* System.out.println("Ingrese una contraseña");
        String password = scanner.nextLine();

        passwordVerify(password); */
        
        /* public static boolean passwordVerify(String password){
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean space = false;
    
            if(password.length() >= 8){
                for (int i = 0; i < password.length(); i++) {
                    char verify = password.charAt(i);
                    if(Character.isUpperCase(verify)){
                        mayuscula = true;
                    }
                    if(Character.isLowerCase(verify)){
                        minuscula = true;
                    }
                    if(Character.isSpaceChar(verify)){
                        space = true;
                    }
                }
    
                boolean esBuena = mayuscula && minuscula && space ?  true : false;
                if(esBuena){
                    System.out.println("La contraseña es segura");
                    return true;
                }
                else{
                    System.out.println("La contraseña no es valida");
                    return false;
                }
                
            }
            else{
                System.out.println("La contraseña no es valida");
                return false;
            }
        } */




        /**Ejercicio 17: Identificador de carácter
        Crea un programa que pida al usuario un carácter e imprima en
        consola si es una consonante, vocal o carácter especial. */

        /* System.out.println("Escribe solo un caracter para verificar que clase es: ");
        String caracter = scanner.nextLine().toLowerCase();

        char caracter1 = caracter.charAt(0);

        // String consonante = "B C D F G H J K L M N Ñ P Q R S T V X Z W Y".toLowerCase();
        String vocal = "A E I O U".toLowerCase();
        String especial = "¡ ! ? ¿ . , ; : - _ + = ( ) [ ] { } | / \\ ~ ` @ # $ % ^ & * < >".toLowerCase();


        // Pattern letras = Pattern.compile("[a-u]");
        Pattern numeros = Pattern.compile("[0-9]");
        Pattern especiales = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher letra = letras.matcher(caracter1);
        Matcher numero = numeros.matcher(caracter1);
        Matcher especial = especiales.matcher(caracter1);

        if(Character.isLetter(caracter1)){
            if(vocal.contains(String.valueOf(caracter1))){
                System.out.println("Es una vocal");
            }
            else{
                System.out.println("Es una consonante");
            }
        }
        else{
            if(especial.contains(String.valueOf(caracter1))){
                System.out.println("Es un caracter especial");
            }
        } */


        /**Ejercicio 18: Juego de piedra, papel o tijera:
        Crear un programa que simule el juego de piedra, papel o tijera
        contra el usuario. Permitir al usuario elegir entre piedra, papel o
        tijera. Determinar el ganador del juego y mostrar el resultado. */

        
        /* System.out.println(opcionContrincante());
        System.out.println("""
                Escribe una de las siguientes opciones:
                1. Piedra
                2. Papel
                3. Tijera
                """);
        
        int opciones = scanner.nextInt();
        String opcion = "";
        String opcionContrincante = opcionContrincante();

        switch (opciones) {
            case 1:
                opcion = "piedra";
                
                if (opcion == opcionContrincante) {
                    System.out.println(opcionContrincante);
                    System.out.println("Empate");
                }
                else if(opcionContrincante == "tijera"){
                    System.out.println(opcionContrincante);
                    System.out.println("Ganaste");
                }
                else{
                    System.out.println(opcionContrincante);
                    System.out.println(opcion);
                    System.out.println("Perdiste");
                }

                break;
                
            case 2:
                opcion = "papel";
                if (opcion == opcionContrincante) {
                    System.out.println(opcionContrincante);
                    System.out.println("Empate");
                }
                else if(opcionContrincante == "piedra"){
                    System.out.println(opcionContrincante);
                    System.out.println("Ganaste");
                }
                else{
                    System.out.println(opcionContrincante);
                    System.out.println("Perdiste");
                }
                break;

            case 3:
                opcion = "tijera";
                if (opcion == opcionContrincante) {
                    System.out.println(opcionContrincante);
                    System.out.println("Empate");
                }
                else if(opcionContrincante == "papel"){
                    System.out.println(opcionContrincante);
                    System.out.println("Ganaste");
                }
                else{
                    System.out.println(opcionContrincante);
                    System.out.println("Perdiste");
                }
                break;
        
            default:
                break;
        } */

        /* public static String opcionContrincante(){
            double opcionRandom = Math.random();
    
            int max = 3;
            int min = 1;
    
            int opcion = (int) (opcionRandom * (max - min + 1) + min);
            String opcionEnemigo = "";
    
            switch (opcion) {
                case 1:
                    opcionEnemigo = "piedra";
                    break;
        
                case 2:
                    opcionEnemigo = "papel";
                    break;
    
                case 3:
                    opcionEnemigo = "tijera";
                    break;
            
                default:
                    break;
            }
    
            return opcionEnemigo;
        } */


        /**Ejercicio 19: Calculadora de edad:
        Crea un programa que solicite la fecha de nacimiento al usuario (año,
        mes y día). Calcule la edad e imprima su edad y si es mayor de edad o
        no. */

        /* LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual.getMonthValue());

        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Año: ");
        int añoNacimiento = scanner.nextInt();

        System.out.println("Mes: ");
        int mesNacimiento = scanner.nextInt();

        System.out.println("Día: ");
        int diaNacimiento = scanner.nextInt();

        int edad = Math.abs(añoNacimiento - fechaActual.getYear());
        
        if (fechaActual.getMonthValue() < mesNacimiento ||
            (fechaActual.getMonthValue() == mesNacimiento && 
            fechaActual.getDayOfMonth() < diaNacimiento)) {
            edad--;
        }
        System.out.println("Edad: " + edad);

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        } */


        /**Ejercicio 20: Cifrado César:
        Escribe un método que cifre y descifre un mensaje utilizando el
        cifrado César con un desplazamiento dado. */

        System.out.println("Escribe el mensaje a cifrar");
        String mensaje = scanner.nextLine().toLowerCase();

        System.out.println("Escribe el desplazamiento");
        int desplazamiento = scanner.nextInt();
        String cifrado = "";
        String abecedario = "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            // System.out.println(caracter == 'a');
            // System.out.println(abecedario.charAt(desplazamiento +1));

            if (caracter >= 'a' && caracter <= 'z') {
                int indice = abecedario.indexOf(caracter);
                System.out.println("indice: " + indice);
                // caracter = abecedario.charAt(desplazamiento + (i + 1));
                cifrado += caracter;
                System.out.println("caracter: " + caracter);
                System.out.println("cifrado: " + cifrado);
            }
        }
        
        System.out.println(cifrado);
        

        scanner.close();
    }


}
