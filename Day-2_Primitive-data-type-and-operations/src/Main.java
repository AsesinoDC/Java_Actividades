import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");

        //primitive data type
        //byte
        byte isByte = 100;
        //short
        short isShort = 1000;
        //int
        int isInt = 20000;
        //long
        long isLong = 35000000;
        //float
        float isFloat = 12.3500f;
        //double
        double isDouble = 14.45;
        //char
        char isChar = 'A';
        //boolean
        boolean isBool = true;


        int sum0 = isByte + isShort + isInt;
        long sum = isByte + isShort + isInt + isLong;

        double sum2 = isFloat * 30 + isDouble;
        float sum3 = isInt + isFloat;

        System.out.println(sum2);

        Scanner scanner = new Scanner(System.in);

        //Tomar todos los nuemros hasta encontrar un \n
        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();

        //sout para poner el System.out.println() de una manera mas facil
        System.out.println("Ingresa un nombre");
        scanner.nextLine();//Recibira el \n que quedo. value = ""
        String textInput = scanner.nextLine();

        System.out.println("Dime tu numero favorito");
        double myNum = scanner.nextDouble();
        isDouble = 50.2;
        scanner.nextLine();

        if (age > 17){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

        switch (age){
            case 12:
                System.out.println("El numero es 12");
                break;
            default:
                System.out.println("hola");
        }

        scanner.close();


    }
}
