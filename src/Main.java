import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");



        //IF
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad puedes ingresar");
        }


        String dia1 = "Lunes";
        String dia2 = "Martes";
        if ( dia1 != dia2) {
            System.out.println("El día " + dia1 + " es distinto al día " + dia2);
        }

        //IF ELSE

        int numero =  7;
        if (numero % 2 == 0) {
            System.out.println("El númeroes par");
         } else {
            System.out.println("El número es impar");
        }


        int hora = 16;
        if (hora < 12 ) {
            System.out.println(" Buenas días");
        } else {
            System.out.println("buenos tardes");
        }

        int calificacion = 75;
        if (calificacion >= 60 ) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }


        //Switch

        int diaSemana = 8;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }


//        Determinar el día de la semana
//        Escribe un programa en Java que solicite al usuario un número del 1 al 7 que represente un día de la semana, donde 1 es lunes y 7 es domingo. El programa debe mostrar en pantalla el nombre del día correspondiente. Si el número ingresado no está en el rango válido, se debe mostrar un mensaje de error.
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana con número, 1 es Lunes y 7 Domingo");
        int diaCualquiera = scanner.nextInt();
        if (diaCualquiera == 1 ){
            System.out.println("Es lunes");
        } else if (diaCualquiera == 2 ){
            System.out.println("Es Martes");
        } else if (diaCualquiera == 2 ){
            System.out.println("Es Miércoles");
        } else if (diaCualquiera == 4 ){
            System.out.println("Es Jueves");
        } else if (diaCualquiera == 5 ){
            System.out.println("Es Viernes");
        } else if (diaCualquiera == 6 ){
            System.out.println("Es Sábado");
        } else if (diaCualquiera == 7){
            System.out.println("Es Domingo");
        } else {
            System.out.println("Ingresa un número entre 1 y 7");
        } scanner.close();*/

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingresa el monto total de tu compra en USD");
        int montoTotal = scanner1.nextInt();

        if ( montoTotal >= 100 ) {
            double descuento = montoTotal * 0.1 / montoTotal;
            //double montoDescuento = descuento;

            System.out.println("Tu compra de " + montoTotal + " tienes 10% de descuento y pagarás " + descuento);

        } else {
            System.out.println("Tu compre de " + montoTotal +" es menor de $100 USD no tienes descuento");
        }

    }
}