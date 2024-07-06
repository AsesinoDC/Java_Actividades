

import java.util.Scanner;

public class taller{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            /* Ejercicio 1: 
            Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
            multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
            los resultados.
            */
        
        /* System.out.println("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("suma: " + (num1 + num2));
        System.out.println("resta: " + (num1 - num2));
        System.out.println("multiplicar: " + (num1 * num2));
        System.out.println("Dividir: " + (num1 / num2));
        */


        /*Ejercicio 2: Verificador de Edad
        Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
        El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.*/

        /* System.out.println("Dime tu edad");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        } */


        /**Ejercicio 3: Conversor de Unidades
        Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
        introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
        Utiliza el hecho de que una milla es igual a 1.60934 kilómetros. */

       /*  System.out.println("Cuantos kilometros quieres que se conviertan en millas");
        double kilometros = scanner.nextDouble();

        System.out.println("Las millas son: " + (kilometros / 1.60934)); */



        /**Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
        Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
        debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
        mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura). */


        /* System.out.println("Dame tu peso en kilogramos");
        double pesoKg = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Dame tu altura");
        double alturaM = scanner.nextDouble();

        System.out.println("El calculo completo del IMC: " + (pesoKg / (alturaM * alturaM))); */


        /*Ejercicio 5: Clasificador de Números
        Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
        es positivo, negativo o cero. Además, indica si el número es par o impar. */

        /* System.out.println("Dame un numero");
        int numero = scanner.nextInt();

        if(numero > 0){
            String resultado = numero % 2 == 0 ? "Par" : "Impar";
            System.out.println(numero + " Es un numero positivo y tambien es un " + resultado);
        }
        else if(numero == 0){
            System.out.println(numero + " Es un numero cero");
        }
        else{
            String resultado = numero % 2 == 0 ? "Par" : "Impar";
            System.out.println(numero + " Es un numero positivo y tambien es un " + resultado);
        } */

        /**Ejercicio 6: Calculadora de Días del Mes
        Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
        de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo. */

        /* System.out.println("Dame el numero del mes");
        int mes = scanner.nextInt();

        int tiene31 = 1;

        if(mes == 2){
            tiene31 = 2;
        }
        else if(mes == 8){
            tiene31 = 1;
        }
        else if(mes % 2 == 0){
            tiene31 = 0;
        }
        else if(mes == 11){
            tiene31 = 0;
        }
        else{
            tiene31 = 1;
        }
        
        switch (tiene31) {
            case 2:
                System.out.println("tiene 28 dias");
                break;

            case 1:
                System.out.println("Tiene 31 dias");
                break;

            case 0:
                System.out.println("Tiene 30 dias");
                break;
            
            default:
                break;
        } */

        /**Ejercicio 7: Menú Interactivo
        Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
        matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
        opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
        la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
        del menú. */

        
        /* System.out.println("""
            Elije una opcion:

            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            """);
        int opciones = scanner.nextInt();

        int[] result = {};

        int num1 = 0;
        int num2 = 1;


        switch (opciones) {
            case 1:
                result = pedirNumero();
                num1 = result[0];
                num2 = result[1];
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                result = pedirNumero();
                num1 = result[0];
                num2 = result[1];
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                result = pedirNumero();
                num1 = result[0];
                num2 = result[1];
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break; 
            case 4:
                result = pedirNumero();
                num1 = result[0];
                num2 = result[1];
                System.out.println("El resultado de la división es: " + (num1 / num2));
                break;
            default:
                break;
        } */

        /* public static int[] pedirNumero(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int[] numeros = {num1, num2};
        
        scanner.close();
        
        return numeros;
        } */


        /**Ejercicio 8: Cálculo de Promedio
        Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
        muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
        promedio de 6 o más). */

        /* System.out.println("Pon tu primera calificacion 1");
        double calificacion1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pon tu primera calificacion 2");
        double calificacion2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pon tu primera calificacion 3");
        double calificacion3 = scanner.nextDouble();
        scanner.nextLine();

        double result = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (result >= 6) {
            System.out.println("Ganaste: " + result);
        }
        else{
            System.out.println("Perdiste: " + result);
        } */


        /**Ejercicio 9: Calculadora de Año Bisiesto
        Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
        no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
        100, a menos que también sean divisibles entre 400. */
        /* System.out.println("Pon un año");
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Es un año bisiesto");
        }
        else{
            System.out.println("No es un año bisiesto");
        }
        */


        /**Ejercicio 10: Calculadora de Propina
        Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
        ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
        cuánto dinero en propina debe dejar. */

        /* System.out.println("Pon el total de la cuenta");
        int totalCuenta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pon el porsentaje de propina que desea dejar");
        double propina = scanner.nextInt();

        double propinaTotal = (totalCuenta * propina) / 100;

        System.out.println("La propina total fue de: " + propinaTotal); */



        /**Ejercicio 11: Ordenando Tres Números
        Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
        ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
        solución usando el operador ternario para práctica adicional. */



        /* System.out.println("Pon el primer número");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pon el segundo número");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pon el tercer número");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 +" "+ num2 +" "+ num3);
            }
            else{
                System.out.println(num1 +" "+ num3 +" "+ num2);
            }
        }
        else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 +" "+ num1 +" "+ num3);
            }
            else{
                System.out.println(num2 +" "+ num3 +" "+ num1);
            }
        }
        else if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                System.out.println(num3 +" "+ num2 +" "+ num1);
            }
            else{
                System.out.println(num3 +" "+ num1 +" "+ num2);
            }
        } */

        /* int[] numeros = {num1,num2,num3};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > numeros[i+1]) {
                if(i+1 < numeros.length){
                    System.out.println("entra");
                    int aux = numeros[i];
                    System.out.println(aux);
                }
            }
        } */

        /**Ejercicio 12: Generador de Horóscopo
        Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
        información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
        para los días. */


        /* System.out.println("Introduce tu mes de nacimiento");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce tu día de nacimiento");
        int dia = scanner.nextInt();

        switch (mes) {
            case 1:
                if(dia < 19){
                    System.out.println("Capricornio");
                }
                else{
                    System.out.println("Acuario");
                }
                break;
            case 2:
                if(dia < 18){
                    System.out.println("Acuario");
                }
                else{
                    System.out.println("Piscis");
                }
                break;
            case 3:
                if(dia < 20){
                    System.out.println("Piscis");
                }
                else{
                    System.out.println("Aries");
                }
                break;
            case 4:
                if(dia < 19){
                    System.out.println("Aries");
                }
                else{
                    System.out.println("Tauro");
                }
                break;
            case 5:
                if(dia < 20){
                    System.out.println("Tauro");
                }
                else{
                    System.out.println("Géminis");
                }
                break;
            case 6:
                if(dia < 20){
                    System.out.println("Géminis");
                }
                else{
                    System.out.println("Cáncer");
                }
                break;
            case 7:
                if(dia < 22){
                    System.out.println("Cáncer");
                }
                else{
                    System.out.println("Leo");
                }
                break;
            case 8:
                if(dia < 22){
                    System.out.println("Leo");
                }
                else{
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if(dia < 22){
                    System.out.println("Virgo");
                }
                else{
                    System.out.println("Libra");
                }
                break;
            
            case 10:
                if(dia < 22){
                    System.out.println("Libra");
                }
                else{
                    System.out.println("Escorpio");
                }
                break;
                
            case 11:
                if(dia < 21){
                    System.out.println("Escorpio");
                }
                else{
                    System.out.println("Sagitario");
                }
                break;

            case 12:
                if(dia < 21){
                    System.out.println("Sagitario");
                }
                else{
                    System.out.println("Capricornio");
                    }
                break;

            default:
                break;
        } */


        /**Ejercicio 13: Calculadora de Tarifa de Taxi
        Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
        (en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
        usuario debe ingresar la distancia del viaje. */
        
        /* System.out.println("Cual es la tarifa base");
        int tarifaBase = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kilometros recorridos");
        int distanciaKm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quieres agregar una tarifa adicional? (0 = s/ 1 = n)");
        int respuesta = scanner.nextInt();
        if(respuesta == 0){
            System.out.println("Cual es la tarifa adicional");
            int tarifaAdicional = scanner.nextInt();

            int costo = (tarifaBase * distanciaKm) + (tarifaAdicional * distanciaKm);

            System.out.println("El costo del viaje es: " + costo);
        }
        else{
            int costoTotal = (tarifaBase * distanciaKm);
            System.out.println("El costo del viaje es: " + costoTotal);
        } */
        

        /**Ejercicio 14: Convertidor de Temperatura
        Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
        poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
        Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
        Fahrenheit. */

        /* System.out.println("""
                1. Convertir de Celsius a Fahrenheit
                2. Convertir de Fahrenheit a Celsius
                """);
        int opciones = scanner.nextInt();

        switch (opciones) {
            case 1:
                System.out.println("Ingrese la temperatura en grados Celsius");
                double celsius = scanner.nextDouble();

                double convertFahrenheit = (celsius * 9/5) + 32;

                System.out.println("Los fahrenheit son: " + convertFahrenheit);
                break;

            case 2:
                System.out.println("Ingrese la temperatura en grados Fahrenheit");
                double fahrenheit = scanner.nextDouble();

                double convertCelsius = (fahrenheit - 32) * 5/9;

                System.out.println("Los celsius son: " + convertCelsius);
                break;
        
            default:
                break;
        }
        */

        /**Ejercicio 15: Sistema de Calificaciones
        Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
        calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
        etc. Considera utilizar if o switch. */

        /* System.out.println("Ingresa la calificacion de 0 a 100");
        int calificacion = scanner.nextInt();

        if (calificacion <= 100 && calificacion >= 0) {
            System.out.println("Tu calificacion es: ");
            if (calificacion >= 90) {
                System.out.println("A");
            }
            else if (calificacion >= 80) {
                System.out.println("B");
            }
            else if (calificacion >= 70) {
                System.out.println("C");
            }
            else if (calificacion >= 60) {
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        }
        else{
            System.out.println("La calificacion debe estar entre 0 y 100");
        } */
        scanner.close();
    }
}