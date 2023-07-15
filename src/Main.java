import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");



        //IF
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad puedes ingresar");
        }


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento:");
        int year = 1996;
        int years = scanner3.nextInt();
        if (years == 1996) {
            System.out.println("Eres del año 1996");
        } else {
            System.out.println("Eres del año " + years );
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

//        Categoría de edad
//        Escribe un programa en Java que solicite al usuario su edad y determine en qué categoría se encuentra: niño (0-12 años), adolescente (13-17 años), adulto (18-59 años) o adulto mayor (60 años en adelante). El programa debe mostrar en pantalla la categoría correspondiente.

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edadPersona = scanner4.nextInt();

       if ( edadPersona <= 12 ) {
           System.out.println("Eres un niño estas entre la edad de 0 a 12 años y tu edad es: " + edadPersona);
       } else if ( edadPersona >= 13 && edadPersona <= 17) {
           System.out.println("Eres un adolecente estas entre la edad de 13 a 17 años y tu edad es: " + edadPersona );
       } else if ( edadPersona >= 18 && edadPersona <= 59 ) {
           System.out.println("Eres un adulto estas entre la edad de 18 a 59 años y tu edad es: " + edadPersona );
       } else if ( edadPersona >= 60 && edadPersona <= 99) {
           System.out.println("Eres un adulto mayor entre la edad de 60 a 99 años y tu edad es: " + edadPersona);
       } else if ( edadPersona >= 100){
           System.out.println("El número: "+ edadPersona + ". No es correcto ");
       }


//        Ejercicio 2: Calculadora de signo zodiacal
//        Escribe un programa en Java que solicite al usuario su día y mes de nacimiento y determine su signo zodiacal. Debes considerar los siguientes rangos de fechas para cada signo:
//

    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
        System.out.println("Ingresa tu mes de nacimiento");
        String mesNacimento = scanner5.next();
        System.out.println("Ingresa el día de tu nacimiento");
        int diaNacimiento = scanner6.nextInt();

    String abril = "abril";
    String mayo = "mayo ";
    String junio = "junio";
    String julio = "julio";
    String agosto = "agosto";
    String septiembre = "septiembre";
    String octubre = "octubre";
    String noviembre = "noviembre";
    String diciembre = "diciembre";
    String enero = "enero";
    String febrero = " febrero";
    String marzo = "marzo";

if (Objects.equals(mesNacimento, abril) && Objects.equals(mesNacimento, marzo) || diaNacimiento >= 1 && diaNacimiento <=  30 ) {
    System.out.println("Tu signo zodiacal es Aries.");

} else if (Objects.equals(mesNacimento, mayo) && diaNacimiento >= 1 && diaNacimiento <= 20) {
    System.out.println("Tu signo zodiacal es Tauro.");
} else if ( Objects.equals(mesNacimento, junio) && diaNacimiento >= 1 && diaNacimiento <= 21) {
    System.out.println("Tu signo zodiacla es Géminis.");
} else if (Objects.equals(mesNacimento, julio) && diaNacimiento >= 1 && diaNacimiento <=22 ) {
    System.out.println("Tu signo zodiacla es Cáncer.");
} else if (Objects.equals(mesNacimento, agosto) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Leo");
} else if (Objects.equals(mesNacimento, septiembre) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Virgo");
} else if (Objects.equals(mesNacimento, octubre) && diaNacimiento >= 1 && diaNacimiento <=23) {
        System.out.println("Tu signo zodiacla es Libra");
} else if (Objects.equals(mesNacimento, noviembre) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Escorpion");
} else if (Objects.equals(mesNacimento, diciembre) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Sagitario");
} else if (Objects.equals(mesNacimento, enero) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Capricornio");
} else if (Objects.equals(mesNacimento, febrero) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Acuario");
} else if (Objects.equals(mesNacimento, marzo) && diaNacimiento >= 1 && diaNacimiento <=23) {
    System.out.println("Tu signo zodiacla es Piscis");
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


//        Calculadora de descuento
//        Escribe un programa en Java que solicite al usuario el monto total de una compra y determine si es aplicable algún descuento. Si el monto total es igual o mayor a 100, se aplica un descuento del 10%. En caso contrario, no se aplica ningún descuento. El programa debe calcular el monto final después del descuento y mostrarlo en pantalla.
//
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingresa el monto total de tu compra en USD");
        int montoTotal = scanner1.nextInt();
        double porcentajeDescuento =  0.1;
        if ( montoTotal >= 100 ) {
            double descuento = montoTotal * porcentajeDescuento;
            double montoDescuento = montoTotal - descuento;

            System.out.println("Tu compra de $" + montoTotal + " USD tienes 10% de descuento y pagarás $" + montoDescuento + " USD.");

        } else {
            System.out.println("Tu compra de $" + montoTotal +" USD es menor de $100 USD, no tiene descuento");
        }

    }
}