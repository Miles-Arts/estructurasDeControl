import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.println("Hello world!");
//
//
//
//        //IF
//        int edad = 18;
//        if (edad >= 18) {
//            System.out.println("Eres mayor de edad puedes ingresar");
//            System.out.println("------------------------------");
//        }
//
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Ingresa tu año de nacimiento:");
//        int year = 1996;
//        int years = scanner3.nextInt();
//        if (years == 1996) {
//            System.out.println("Eres del año 1996");
//        } else {
//            System.out.println("Eres del año " + years );
//        }  System.out.println("------------------------------");
//
//        String dia1 = "Lunes";
//        String dia2 = "Martes";
//        if ( dia1 != dia2) {
//            System.out.println("El día " + dia1 + " es distinto al día " + dia2);
//        }  System.out.println("------------------------------");
//
//        //IF ELSE
//
//        int numero =  7;
//        if (numero % 2 == 0) {
//            System.out.println("El númeroes par");
//         } else {
//            System.out.println("El número es impar");
//        }
//
//
//        int hora = 16;
//        if (hora < 12 ) {
//            System.out.println(" Buenas días");
//        } else {
//            System.out.println("buenos tardes");
//        }
//
//        int calificacion = 75;
//        if (calificacion >= 60 ) {
//            System.out.println("Aprobado");
//        } else {
//            System.out.println("Reprobado");
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//        //Switch
//
//        int diaSemana = 8;
//        switch (diaSemana) {
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sábado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Día no válido");
//                break;
//        }
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
////  /*      Días de la semana
////        Escribe un programa en Java que solicite al usuario un número del 1 al 7 que represente un día de la semana, donde 1 es lunes y 7 es domingo. El    programa debe mostrar en pantalla el nombre del día correspondiente utilizando la estructura "switch".  */
//
//        Scanner scanner7 = new Scanner(System.in);
//        System.out.println("Ingresa un número de la semana");
//        int numeroSemana = scanner7.nextInt();
//
//        switch (numeroSemana) {
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sábado");
//                break;
//            case 8:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Ingresa un número del 1 al 7.");
//
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
/////*        Conversor de unidades
////        Escribe un programa en Java que solicite al usuario un número entero que represente una opción de conversión de unidades: 1 para convertir de grados Celsius a Fahrenheit y 2 para convertir de pulgadas a centímetros. Luego, el programa debe solicitar la cantidad a convertir y mostrar el resultado de la conversión utilizando la estructura "switch".*/
//
//Scanner scanner8 = new Scanner(System.in);
//Scanner scanner9 = new Scanner(System.in);
//        System.out.println("Ingresa un numero del 1 al 2:");
//        System.out.println("1 para convertir de Celsius a Fahrenheit.");
//        System.out.println("2 para convertir de Pulgadas a Centímetros.");
//        int convertir = scanner8.nextInt();
//        System.out.println("Ingresa la cantidad a convertir:");
//        double unidades = scanner9.nextInt();
//
//        switch (convertir) {
//
//            case 1:
//              double fahrenheit = (unidades * 9/5) + 32;
//                System.out.println("La temperatura Celsius: " + unidades + "° son en Fahrenheit: " + fahrenheit + " °Grados");
//                break;
//
//            case 2:
//              double medida = (unidades * 2.54);
//                System.out.println("Las Pulgadas: " + unidades + ". Son en Centímetros: " + medida);
//              break;
//
//            default:
//                System.out.println("Ingresa un numero correcto.");
//
//        }
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
////      /*  Calculadora básica
////        Escribe un programa en Java que solicite al usuario dos números y una operación matemática (suma, resta, multiplicación o división). Luego, utiliza la estructura "switch" para realizar la operación seleccionada y mostrar el resultado en pantalla.*/
//
//
//       Scanner scanner10 = new Scanner(System.in);
//       Scanner scanner11 = new Scanner(System.in);
//       Scanner scanner12 = new Scanner(System.in);
//       System.out.println("Ingresa a continuación dos números y una operación matemática:");
//        System.out.println("Primero número: ");
//        double numeroUno = scanner10.nextInt();
//        System.out.println("Segundo número: ");
//        double numeroDos = scanner11.nextInt();
//        System.out.println("Ingresa la operación matemática");
//        String operacion = scanner12.next();
//
//        String suma = "suma";
//        String resta = "resta";
//        String multiplicacion = "multiplicacion";
//        String division = "division";
//        double resultado;
//
//        switch (operacion) {
//
//            case "suma":
//                resultado = numeroUno + numeroDos;
//                System.out.println("El resultado de la suma es: " + resultado);
//                break;
//
//            case  "resta":
//                resultado = numeroUno - numeroDos;
//                System.out.println("El resultado de la resta es: " + resultado);
//                break;
//
//            case "multiplicacion":
//                resultado = numeroUno * numeroDos;
//                System.out.println("El resultado de la multiplicación es: " + resultado);
//                break;
//            case "division":
//                resultado = numeroUno / numeroDos;
//                System.out.println("El resultado de la division es: " + resultado);
//                break;
//            default:
//                System.out.println("Ingresa los datos correctos");
//        }
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
////       /* Determinar el tipo de día
////        Escribe un programa en Java que solicite al usuario un número del 1 al 7 que represente un día de la semana, donde 1 es lunes y 7 es domingo. Luego, utiliza la estructura "switch" para determinar si el día es laboral (lunes a viernes) o fin de semana (sábado y domingo), y muestra el resultado en pantalla.*/
//
//
//        Scanner scanner13 = new Scanner(System.in);
//        System.out.println("Ingresa en número (1-7) un día de la semana:");
//        int tipoDeDia = scanner13.nextInt();
//
//        switch (tipoDeDia) {
//
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Es día " +tipoDeDia + " es día laboral de Lunes a Viernes");
//                break;
//            case 6:
//            case 7:
//                System.out.println("El día " + tipoDeDia + " es fin de semana Sábado y Domingo");
//                break;
//            default:
//                System.out.println("Ingresa un número del 1 al 7");
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
//
////        Categoría de edad
////        Escribe un programa en Java que solicite al usuario su edad y determine en qué categoría se encuentra: niño (0-12 años), adolescente (13-17 años), adulto (18-59 años) o adulto mayor (60 años en adelante). El programa debe mostrar en pantalla la categoría correspondiente.
//
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Ingresa tu edad");
//        int edadPersona = scanner4.nextInt();
//
//       if ( edadPersona <= 12 ) {
//           System.out.println("Eres un niño estas entre la edad de 0 a 12 años y tu edad es: " + edadPersona);
//       } else if ( edadPersona >= 13 && edadPersona <= 17) {
//           System.out.println("Eres un adolecente estas entre la edad de 13 a 17 años y tu edad es: " + edadPersona );
//       } else if ( edadPersona >= 18 && edadPersona <= 59 ) {
//           System.out.println("Eres un adulto estas entre la edad de 18 a 59 años y tu edad es: " + edadPersona );
//       } else if ( edadPersona >= 60 && edadPersona <= 99) {
//           System.out.println("Eres un adulto mayor entre la edad de 60 a 99 años y tu edad es: " + edadPersona);
//       } else if ( edadPersona >= 100){
//           System.out.println("El número: "+ edadPersona + ". No es correcto ");
//       }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
//
////        Ejercicio 2: Calculadora de signo zodiacal
////        Escribe un programa en Java que solicite al usuario su día y mes de nacimiento y determine su signo zodiacal. Debes considerar los siguientes rangos de fechas para cada signo:
////
//
//    Scanner scanner5 = new Scanner(System.in);
//    Scanner scanner6 = new Scanner(System.in);
//        System.out.println("Ingresa tu mes de nacimiento en numero");
//        int mesNacimento = scanner5.nextInt();
//        System.out.println("Ingresa el día de tu nacimiento");
//        int diaNacimiento = scanner6.nextInt();
///*    String abril = "abril";
//    String mayo = "mayo ";
//    String junio = "junio";
//    String julio = "julio";
//    String agosto = "agosto";
//    String septiembre = "septiembre";
//    String octubre = "octubre";
//    String noviembre = "noviembre";
//    String diciembre = "diciembre";
//    String enero = "enero";
//    String febrero = " febrero";
//    String marzo = "marzo";*/
//
//if ((mesNacimento == 3 && diaNacimiento >= 21 && diaNacimiento <= 31 ) || (mesNacimento == 4 && diaNacimiento <= 19)) {
//    System.out.println("Aries");;
//} else if ((mesNacimento == 4 && diaNacimiento >= 20 && diaNacimiento <= 30) || (mesNacimento == 5 && diaNacimiento <= 20))  {
//    System.out.println("Tauro");
//} else if ((mesNacimento == 5 && diaNacimiento >= 21 && diaNacimiento <= 31) || (mesNacimento == 6 && diaNacimiento <= 20)) {
//    System.out.println("Géminis");
//} else if ((mesNacimento == 6 && diaNacimiento >= 21 && diaNacimiento <= 30) || (mesNacimento == 7 && diaNacimiento <= 22)) {
//    System.out.println("Cáncer");
//} else if ((mesNacimento == 7 && diaNacimiento >= 23 && diaNacimiento <= 31) || (mesNacimento == 8 && diaNacimiento <= 22)) {
//    System.out.println("Leo");
//} else if ((mesNacimento == 8 && diaNacimiento >= 20 && diaNacimiento <= 31) || (mesNacimento == 9 && diaNacimiento <= 22))  {
//    System.out.println("Virgo");
//} else if ((mesNacimento == 9 && diaNacimiento >= 21 && diaNacimiento <= 30) || (mesNacimento == 10 && diaNacimiento <= 22)) {
//    System.out.println("Libra");
//} else if ((mesNacimento == 10 && diaNacimiento >= 21 && diaNacimiento <= 31) || (mesNacimento == 11 && diaNacimiento <= 21)) {
//    System.out.println("Escorpion");
//} else if ((mesNacimento == 11 && diaNacimiento >= 23 && diaNacimiento <= 30) || (mesNacimento == 12 && diaNacimiento <= 21)) {
//    System.out.println("Sagitario");
//} else if ((mesNacimento == 12 && diaNacimiento >= 20 && diaNacimiento <= 31) || (mesNacimento == 1 && diaNacimiento <= 19))  {
//    System.out.println("Capricornio");
//} else if ((mesNacimento == 1 && diaNacimiento >= 21 && diaNacimiento <= 31) || (mesNacimento == 2 && diaNacimiento <= 18)) {
//    System.out.println("Acuario");
//} else if ((mesNacimento == 2 && diaNacimiento >= 21 && diaNacimiento <= 28) || (mesNacimento == 3 && diaNacimiento <= 20)) {
//    System.out.println("Piscis");
//} else {
//    System.out.println("Fecha de nacimiento no válida");
//}
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
//
//
////        Determinar el día de la semana
////        Escribe un programa en Java que solicite al usuario un número del 1 al 7 que represente un día de la semana, donde 1 es lunes y 7 es domingo. El programa debe mostrar en pantalla el nombre del día correspondiente. Si el número ingresado no está en el rango válido, se debe mostrar un mensaje de error.
//    /*    Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingresa un día de la semana con número, 1 es Lunes y 7 Domingo");
//        int diaCualquiera = scanner.nextInt();
//        if (diaCualquiera == 1 ){
//            System.out.println("Es lunes");
//        } else if (diaCualquiera == 2 ){
//            System.out.println("Es Martes");
//        } else if (diaCualquiera == 2 ){
//            System.out.println("Es Miércoles");
//        } else if (diaCualquiera == 4 ){
//            System.out.println("Es Jueves");
//        } else if (diaCualquiera == 5 ){
//            System.out.println("Es Viernes");
//        } else if (diaCualquiera == 6 ){
//            System.out.println("Es Sábado");
//        } else if (diaCualquiera == 7){
//            System.out.println("Es Domingo");
//        } else {
//            System.out.println("Ingresa un número entre 1 y 7");
//        } scanner.close();*/
//
//
////        Calculadora de descuento
////        Escribe un programa en Java que solicite al usuario el monto total de una compra y determine si es aplicable algún descuento. Si el monto total es igual o mayor a 100, se aplica un descuento del 10%. En caso contrario, no se aplica ningún descuento. El programa debe calcular el monto final después del descuento y mostrarlo en pantalla.
////
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Ingresa el monto total de tu compra en USD");
//        int montoTotal = scanner1.nextInt();
//        double porcentajeDescuento =  0.1;
//        if ( montoTotal >= 100 ) {
//            double descuento = montoTotal * porcentajeDescuento;
//            double montoDescuento = montoTotal - descuento;
//
//            System.out.println("Tu compra de $" + montoTotal + " USD tienes 10% de descuento y pagarás $" + montoDescuento + " USD.");
//
//        } else {
//            System.out.println("Tu compra de $" + montoTotal +" USD es menor de $100 USD, no tiene descuento");
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");
//
//    }
// }
///*
//        Clasificación de triángulos
//        Escribe un programa en Java que solicite al usuario las longitudes de los tres lados de un triángulo. Luego, utiliza una combinación de if, else if y switch para determinar y mostrar en pantalla qué tipo de triángulo es: equilátero, isósceles o escaleno.*/
//
//        Scanner scanner14 = new Scanner(System.in);
//        Scanner scanner15 = new Scanner(System.in);
//        Scanner scanner16 = new Scanner(System.in);
//
//        System.out.println("Ingrese a continuación la medida de los tres lado del triángulo.");
//
//        System.out.println("Ingrese la longitud del lado 1: ");
//        double ladoUno = scanner14.nextInt();
//        System.out.println("Ingrese la longitud del lado 2: ");
//        double ladoDos = scanner15.nextInt();
//        System.out.println("Ingrese la longitud del lado 3: ");
//        double ladoTres = scanner16.nextInt();
//
//        String isoceles;
//        String escaleno;
//        String equilatero;
//
//        if (ladoUno == ladoDos && ladoDos == ladoTres) {
//            System.out.println("El triángulo es equilátero");
//        } else if (ladoUno == ladoDos || ladoDos == ladoTres || ladoUno == ladoTres) {
//            System.out.println("El triángulo es isóceles");
//        } else {
//            System.out.println("el triángulo es escaleno");
//        }
//
//        System.out.println("------------------------------");
//        System.out.println("------------------------------");

//       /* Escribe un programa en Java que solicite al usuario una cantidad de dinero en una moneda específica (dólares, euros o pesos) y la moneda a la que se desea convertir (dólares, euros o pesos). Utiliza una combinación de if, else if y switch para realizar la conversión y mostrar el resultado en pantalla.*/

//     /*   Scanner scanner17 = new Scanner(System.in);
//        Scanner scanner18 = new Scanner(System.in);
//        Scanner scanner19 = new Scanner(System.in);
//
//        System.out.println("Ingresa la cantidad de dinero");
//        int dinero = scanner17.nextInt();
//
//        System.out.println("Ingresa la modena de origen (dolar, euro, pesos) :");
//        String origen = scanner18.next();
//
//        System.out.println("Ingresa la moneda de destino (dolar, euro, pesos) :");
//        String destino = scanner19.next();
//
//        String dolar = "dolar";
//        String euro = "euro";
//        String pesos = "pesos";
//
//        double resultado;
//
//                    if(Objects.equals(origen, "dolar") && Objects.equals(destino, "euro")) {
//                        double euros = 0.89;
//                        resultado = dinero * euros;
//                        System.out.println("$" + dinero + " dólares aquivalen a $" + resultado + " euros.");
//
//                    } else if (Objects.equals(origen, "dolar") && Objects.equals(destino, "pesos")){
//                        double dolar1 = 4087.83;
//                        resultado = dinero * dolar1;
//                        System.out.println("$" + dinero + " dólares aquivalen a $" + resultado + " pesos.");
//
//                    } else if (Objects.equals(origen, "euro") && Objects.equals(destino, "dolar")){
//                       double dolares1 = 1.12;
//                       resultado = Math.round(dinero * dolares1);
//                       System.out.println("$" + dinero + " euros aquivalen a $" + resultado + " dolaresS.");
//
//                   } else  if (Objects.equals(origen, "euro") && Objects.equals(destino, "pesos")) {
//                       double euro1 = 4598.20;
//                       resultado = Math.round(dinero * euro1);
//                       System.out.println("$" + dinero + " euros aquivalen a $" + resultado + " pesos.");
//                   }
//
//                  else if (Objects.equals(origen, "pesos") && Objects.equals(destino, "dolar")) {
//                      double dolares2 = 0.00024;
//                      //resultado = Math.round(dinero * dolares2);
//                      resultado = dinero * dolares2;
//                      System.out.println("$" + dinero + " pesos aquivalen a $" + resultado + " dolares.");
//
//                  } else if (Objects.equals(origen, "pesos") && Objects.equals(destino, "euro")) {
//                      double euro2 = 0.00022;
//                      //resultado = Math.round(dinero * dolares2);
//                      resultado = dinero * euro2;
//                      System.out.println("$" + dinero + " pesos aquivalen a $" + resultado + " euros.");
//                  }
//
//        System.out.println("Ingresa números");*/
//        if (dolar == dolar || euro == euro) {
//            double euros = 0.89;
//            resultado = dinero * euros;
//            System.out.println("$" + dinero + " dólares aquivalen a $" + resultado + " euros.");
//
//        } else if ( euro == euro || dolar == dolar ) {
//            double dolares1 = 1.12;
//            resultado = dinero * dolares1;
//            System.out.println("$" + dinero + " euros aquivalen a $" + resultado + " dolares.");
//        }

 /*       Ejercicio 1: Evaluación de una calificación (más complejo)
        Escribe un programa en Java que solicite al usuario una calificación numérica (del 0 al 100) y determine la evaluación correspondiente utilizando if, else if.

        Si la calificación está entre 90 y 100, mostrar "Excelente".
                Si la calificación está entre 80 y 89, mostrar "Sobresaliente".
                Si la calificación está entre 70 y 79, mostrar "Aceptable".
                Si la calificación está entre 60 y 69, mostrar "Necesita mejorar".
                Si la calificación está entre 50 y 59, mostrar "Insuficiente".
                Si la calificación está entre 0 y 49, mostrar "Reprobado".
                Si la calificación es menor que 0 o mayor que 100, mostrar "Calificación inválida".*/

        Scanner scanner20 = new Scanner(System.in);
        System.out.println("Ingresa una califiación del (0 al 100)");

        double notas = scanner20.nextDouble();

       if ( notas >= 90 && notas <= 100 )  {
            System.out.println("Excelente");
        } else if ( notas >= 80 && notas <= 89) {
            System.out.println("Sobresaliente");
        } else if ( notas >= 70 && notas <= 79 ) {
            System.out.println("Aceptable");
        } else if ( notas >= 60 && notas <= 69 ) {
            System.out.println("Necesista Mejorar");
        } else if ( notas >= 50 && notas <= 59) {
            System.out.println("Insificiente");
        } else if ( notas >= 0 && notas <= 49) {
            System.out.println("Reprobado");
        } else if ( notas <= -1 || notas >= 101) {
            System.out.println("Calificación inválida");
        }

    }
}