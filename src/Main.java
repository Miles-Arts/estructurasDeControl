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

        int díaSemana = 2;
        switch (díaSemana) {
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

        }

    }
}