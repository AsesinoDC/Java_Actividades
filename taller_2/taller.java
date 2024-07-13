import java.util.Scanner;

public class taller {
    public static void main(String[] args){
        //las funciones estan metidas aqui para que me diera espacio para el resto, solo hay que bajarlas.
        Scanner scanner = new Scanner(System.in);

        /**Ejercicio 1: Menú interactivo.
        Este ejercicio propone la creación de un programa que presente al
        usuario un menú interactivo para realizar operaciones matemáticas
        básicas como suma, resta, multiplicación y división. */
        /*opciones();
        String opcion = scanner.nextLine();
        
        do {
            System.out.println("Cuantos numeros quieres ingresar");
            int numeros = scanner.nextInt();
            scanner.nextLine();
            
            
            if (numeros <= 1) {
                System.out.println("""
                    Ingresa mas de dos numeros.

                    Se cerrara el probrama.
                        """);
                break;
            }
            
            double[] arrayNumeros = new double[numeros];

            double result = 0;
            arrayNumeros = numeros(arrayNumeros);
            switch (opcion) {
                case "1":
                    System.out.println("Suma:");
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        System.out.println(arrayNumeros[i]);
                        result += arrayNumeros[i]; 
                    }
                    System.out.println("El resultado es: " + result);
                    break;
                case "2":
                    System.out.println("Resta:");
                    result = arrayNumeros[0];
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        System.out.println(arrayNumeros[i]);
                        if(i+1 < arrayNumeros.length){
                            result -= arrayNumeros[i + 1];
                        }
                    }
                    System.out.println("El resultado es: " + result);
                    break;
                    
                case "3":
                    System.out.println("Multiplicacion:");
                    result = arrayNumeros[0];
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        System.out.println(arrayNumeros[i]);
                        if(i+1 < arrayNumeros.length){
                            result *= arrayNumeros[i + 1];
                        }
                    }
                    System.out.println("El resultado es: " + result);
                    break;
                case "4":
                    System.out.println("Division:");
                    result = arrayNumeros[0];
                    for (int i = 0; i < arrayNumeros.length; i++) {
                        System.out.println(arrayNumeros[i]);
                        if(i+1 < arrayNumeros.length){
                            result /= arrayNumeros[i + 1];
                        }
                    }
                    System.out.println("El resultado es: " + result);
                    break;
                case "5":
                    System.out.println("Saliste de la calculadora basica");
                    break;
                default:
                    System.out.println("Saliste de la calculadora basica");
                    break;
            }
                    

            //No funciona y solo sigue su recorido sin poner nada, del resto, todo good
            System.out.println("Quieres seguir en tu calculadora basica. (si/no)");
            String seguir = scanner.nextLine().toLowerCase();

            if (seguir.equals("si")) {
                opciones();
                opcion = scanner.nextLine();
            }
            else{
                System.out.println("Gracias por usar la calculadora basica");
                opcion = "5";
            }
            
        } while (opcion != "5");
        





    public static void opciones(){
        System.out.println("""
            Bienvenido a tu calculadora basica, que quieres seleccionar:
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);

        System.out.println("Dame la opcion que quieres");
    }

    public static double[] numeros(double[] arrayNumeros){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Dame el numero " + (i + 1));
            arrayNumeros[i] = scanner.nextDouble();
        }
        scanner.close();
        return arrayNumeros;
    }
        */
        
        
        
    

        /**Ejercicio 2: Facturación de una tienda.
        Un cliente realiza una compra en una tienda. El programa proporciona
        un array de productos y un array de precios. Se requiere pedir al
        usuario la cantidad de cada producto que desea comprar, para
        posteriormente imprimir el valor total de la factura. */

        /*String[] productos = {"Producto A", "Producto B", "Producto C", "Producto D"};
        double[] precios = {3, 2.5, 1.8, 2};

        double totalPrecio = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.println(i+"." + productos[i] + " - " + precios[i]);
        }

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Cuanto producto quieres comprar del: " + (i + 1) );
            int cantidad = scanner.nextInt();
            double total = cantidad * precios[i];
            System.out.println("El total de tu compra " + (i+1) +" es: " + total);
            totalPrecio += total;
        }
        System.out.println("El total que tienes que gasta es de: " + totalPrecio);*/


        /**Ejercicio 3: Notas de un curso.
        Crea un programa que calcula la calificación promedio que se necesita
        obtener en las notas faltantes de un curso para aprobarlo,
        considerando la cantidad de calificaciones totales, las calificaciones ya
        obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
        notas faltantes. Importante: el total de notas del curso será de 8 notas,
        la calificación será de 0 a 100 y el promedio mínimo para aprobar el
        curso es de 76 */

        /*System.out.println("Cuantas notas tiene el estudiante");
        int cantidadNotas = scanner.nextInt();
        int[] notas = new int[cantidadNotas];

        double promedioFaltante = 0;
        int puntaje = 0;
        int notasFaltantes = 0;
        

        if(notas.length < 8){
            notasFaltantes = Math.abs(notas.length - 8);
            System.out.println("Para completar las notas que faltan se necesitan: " + notasFaltantes);
        }
        else if(notas.length > 8 || cantidadNotas <= 0){
            System.out.println("No se puede realizar la operacion");

        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i+1));
            notas[i] = scanner.nextInt();
            puntaje += notas[i];
        }

        puntaje /= notas.length;
        
        if (puntaje < 76) {
            System.out.println("El puntaje es de: " + puntaje);
            if(cantidadNotas < 8){
                promedioFaltante = (76 - puntaje) * notasFaltantes;
                System.out.println("Promedio que necesitas sacar en las notas para ganar: " + promedioFaltante);
                System.out.println("Por ahora esta perdiendo el curso");
            }
            else{
                System.out.println("El estudiante no aprobó el curso");

            }
        }
        else {
            System.out.println("El puntaje es de: " + puntaje);
            if(cantidadNotas < 8){
                promedioFaltante = (76 - puntaje) * notasFaltantes;
                System.out.println("Promedio que necesitas sacar en las notas para ganar: " + promedioFaltante);
                System.out.println("El estudiante esta aprobando el curso");
            }
            else{
                System.out.println("El estudiante aprobó el curso");

            }
        }*/

        /**Ejercicio 4: Calculadora de descuentos.
            Crea un programa que calcule los descuentos por compras(Ejercicio 2)
            en una tienda, donde se aplica un porcentaje de descuento en función
            del monto total de la compra, con rangos de precios personalizados.
                ________________________________________________
                | Rango de compra | Porcentaje de descuento |
                |-----------------|-------------------------|
                | Mayor o igual a $1000|                25% |
                | Mayor o igual a $500 |                20% |
                | Mayor o igual a $300 |                15% |
                | Mayor o igual a $200 |                10% |
                | Menor a $200 | No se aplica descuento 
                 ___________________________________________*/
            
        /*String[] productos = {"Producto A", "Producto B", "Producto C", "Producto D"};
        double[] precios = {150, 200, 50, 100};

        double totalPrecio = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.println(i+"." + productos[i] + " - " + precios[i]);
        }

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Cuanto producto quieres comprar del: " + (i + 1) );
            int cantidad = scanner.nextInt();
            double total = cantidad * precios[i];
            System.out.println("El total de tu compra " + (i+1) +" es: " + total);
            totalPrecio += total;
        }

        if(totalPrecio >= 1000){
            double descuento = totalPrecio * 0.25;
            System.out.println("El descuento que te aplicamos es de: " + descuento);
            double totalDescuento = totalPrecio - descuento;
            System.out.println("El total que debes pagar es de: " + totalDescuento);
        }
        else if(totalPrecio >= 500){
            double descuento = totalPrecio * 0.20;
            System.out.println("El descuento que te aplicamos es de: " + descuento);
            double totalDescuento = totalPrecio - descuento;
            System.out.println("El total que debes pagar es de: " + totalDescuento);
        }
        else if(totalPrecio >= 300){
            double descuento = totalPrecio * 0.15;
            System.out.println("El descuento que te aplicamos es de: " + descuento);
            double totalDescuento = totalPrecio - descuento;
            System.out.println("El total que debes pagar es de: " + totalDescuento);
        }
        else if(totalPrecio >= 200){
            double descuento = totalPrecio * 0.10;
            System.out.println("El descuento que te aplicamos es de: " + descuento);
            double totalDescuento = totalPrecio - descuento;
            System.out.println("El total que debes pagar es de: " + totalDescuento);
        }
        else{
            System.out.println("No se aplica descuento");
            System.out.println("El total que debes pagar es de: " + totalPrecio);
        }*/

        /**Ejercicio 5: Busca palabras.
        Un programa que permita al usuario ingresar un texto y luego le da la
        opción de buscar una palabra específica, mostrando como resultado
        el rango de posiciones donde se encontró la palabra exacta. (Sin darle
        importancia a mayúsculas o minúsculas) */

        /*System.out.println("Pon un texto");
        String texto = scanner.nextLine().toLowerCase();

        String[] palabras = texto.split(" ");

        System.out.println("Pon una palabra que quieres buscar en el texto");
        String palabra = scanner.nextLine().toLowerCase();
        
        for (int j = 0; j < palabras.length; j++) {

            if(palabra.equals(palabras[j])){
                System.out.println("La palabra se encuentra en la posicion: " + (j + 1));
                System.out.println("La palabra es: " + palabras[j]);
            }
        }*/


        /**Ejercicio 6: Búsqueda por coincidencia en arrays
        Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
        ingrese un nombre. Busca ese nombre en el array que imprima si se
        encuentra la posición y si no un mensaje que no se encuentra. */


        /*String[] nombre = {"emanuel", "ramon", "suarez", "messi"};
        System.out.println("Pon un nombre");
        String nombreBuscado = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i < nombre.length; i++) {
            if(nombreBuscado.equals(nombre[i])){
                System.out.println("El nombre se encuentra en la posicion: " + (i + 1));
                System.out.println("El nombre es: " + nombre[i]);
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("El nombre " + nombreBuscado + " no se encontro.");
        }*/

        /*Ejercicio 7: Transposición de una Matriz
        Crea un programa en Java que calcule la transpuesta de una matriz
        (intercambiar filas por columnas). */

        /*int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("\n Matriz normal normal");
        mostrarMatriz(matriz);

        int[][] matrizTranspuesta = Transpuesta(matriz);
        System.out.println("\n Matriz transpuesta");

        mostrarMatriz(matrizTranspuesta);



        public static int[][] Transpuesta (int[][] matriz){
    
            int filas = matriz.length;
            int columnas = matriz[0].length;
    
            int[][] matrizTranspuesta = new int[columnas][filas];
            
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    matrizTranspuesta[i][j] = matriz[j][i];
                }
            }
    
            return matrizTranspuesta;
        }
    
        public static int[][] mostrarMatriz(int[][] matriz){
    
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println(matriz[i][j]);
                }
                System.out.println();
            }
            return matriz;
        }
        */

        /*Ejercicio 8: Verificar Matriz Simétrica
        Crea un programa en Java que verifique si una matriz cuadrada es
        simétrica (igual a su transpuesta, Ejercicio 7). */

        /*int[][] matriz = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        //System.out.println("\n Matriz normal normal");
        //mostrarMatriz(matriz);

        int[][] matrizTranspuesta = Transpuesta(matriz);
        //System.out.println("\n Matriz transpuesta");

        int filas = matriz.length;
        int columnas = matriz[0].length;

        boolean esSimetrica = true;
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                if (matriz[i][j] != matrizTranspuesta[i][j]) {
                    esSimetrica = false;
                    System.out.println("La matriz no es simétrica");
                    return;
                }
            }
        }
        System.out.println(esSimetrica);

        if(esSimetrica){
            System.out.println("La matriz es simétrica");
        }



        public static int[][] Transpuesta (int[][] matriz){
        
            int filas = matriz.length;
            int columnas = matriz[0].length;
    
            int[][] matrizTranspuesta = new int[columnas][filas];
            
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    matrizTranspuesta[i][j] = matriz[j][i];
                }
            }
    
            return matrizTranspuesta;
        }
    
        public static int[][] mostrarMatriz(int[][] matriz){
    
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println(matriz[i][j]);
                }
                System.out.println();
            }
            return matriz;
        }
        */

        /**Ejercicio 9: Contar coincidencias en un Array:
        Crea un programa que mire dentro de un array, si hay elementos
        repetidos y los cuente e imprima en pantalla en orden del elemento
        que más se repite al que menos. */

        /*int[] elementos = {1,2,3,5,1,2,3};
        int contador = 0;
        int numero = 0;


        for (int i = 0; i < elementos.length; i++) {
            numero = elementos[i];
            for (int j = 0; j < elementos.length; j++) {
                if (elementos[j] == numero) {
                    contador++;
                }

            }
            if(contador > 1){
                System.out.println("El numero " + numero + " se repite " + contador);
            }
            contador = 0;
        }*/

        /**Ejercicio 10: Invertir un Array
        Escribe un programa en Java que invierta el orden de los elementos
        en un array de números enteros.(Sin métodos) */

        /*int[] arrayNumeros = {1,2,3,4,5,6,7};

        for (int i = arrayNumeros.length - 1; i >= 0; i--) {
            System.out.println(arrayNumeros[i]);
        }*/

        scanner.close();
    }
}
