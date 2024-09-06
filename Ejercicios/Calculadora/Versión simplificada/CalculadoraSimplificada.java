
import java.util.*;

public class CalculadoraSimplificada {

    static Scanner entrada = new Scanner(System.in);
    static int x, num, num1, num2, result, operacionselecionada;
    static String operaciones, opcion, cambio;
    static boolean control;

    public static void main(String[] args) {
        menu();
        //otraoperacion();
    }

    static void menu() {
        System.out.println("Elija la calculadora a usar: \n1-Calculadora for/if-else\n2-Calculadora if/switch");
        System.out.println("3-Calculadora do-while/switch\n4-Calculadora Switch/if-else/for\n5-Cerrar programa");
        operaciones = entrada.nextLine();
        try {
            operacionselecionada = Integer.parseInt(operaciones);
            switch (operacionselecionada) {
                case 1 -> {
                    CalculadoraI one = new CalculadoraI();
                    one.primera();
                    break;
                }
                case 2 -> {
                    CalculadoraII two = new CalculadoraII();
                    two.segunda();
                    break;
                }
                case 3 -> {
                    CalculadoraIII three = new CalculadoraIII();
                    three.tercera();
                    break;
                }
                case 4 -> {
                    CalculadoraIV four = new CalculadoraIV();
                    four.cuarta();
                    break;
                }
                case 5 -> {
                    System.out.println("Cerrando programa.");
                    System.exit(5);
                    break;
                }
                default -> {
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas 1 al 5.");
                    menu();
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente." +
                    "\nSolo se admiten números (1-5)");
                    textocalculadora();
        }
    }

    static void textocalculadora() {
        System.out.println("Favor elija la operación a realizar:\n1-Suma.\n2-Resta.\n3-Multiplicación.\n4-División.\n5-Regresar al menú.");
        operaciones = entrada.nextLine();   
    }

    static int ingresodato() {
        System.out.println("Favor, ingrese un número");
        num = entrada.nextInt();
        entrada.nextLine();
        return num;
    }

    static void asignarnombre() {
        control = true;
        do {
            try {
                operacionselecionada = Integer.parseInt(operaciones);
                switch (operacionselecionada) {
                    case 1->{
                        operaciones="Suma";
                        control=false;
                        break;
                    }
                    case 2->{
                        operaciones = "Resta";
                        control = false;
                        break;
                    }
                    case 3->{
                        operaciones = "Multiplicación";
                        control = false;
                        break;
                    }
                    case 4->{
                        operaciones = "División";
                        control = false;
                        break;
                    }
                    case 5->{
                        menu();
                        control = false;
                        break;}
                    default->{
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas del 1 al 5");
                        textocalculadora();
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números (1-5)");
                textocalculadora();
            }
        } while (control!=false);
    }

    static void nombre(){
        System.out.println("Usted a elegido: "+operaciones);
    }

    static void confirmacion(Object llamado){
        System.out.println("¿Desea continuar con: "+operaciones+"?\n[S/N]");
        opcion = entrada.nextLine();
        if(opcion.equalsIgnoreCase("S")){
            System.out.println("Seguir Las instrucciones");
        }else if(opcion.equalsIgnoreCase("N")){
            System.out.println("¿Desea cambiar operación?\n[S/N]");
            cambio = entrada.nextLine();
            switch (cambio.toUpperCase()) {
                case "S"->{
                    if(llamado instanceof CalculadoraI one){
                        one.primera();
                        break;
                    }else if (llamado instanceof CalculadoraII two){
                        two.segunda();
                    }else if (llamado instanceof CalculadoraIII three) {
                        three.tercera();
                    }else if (llamado instanceof CalculadoraIV four){
                        four.cuarta();
                    }
                    break;
                }
                case "N"->{
                System.out.println("Cerrando programa.");
                System.exit(0);}
                default->{
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas S o N");
                //confirmacion(llamado);
                    break;}
            }
        }else{
            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas S o N");
            System.exit(0);
            confirmacion(llamado);
        }
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int resta(int a, int b) {
        return a - b;
    }

    static int multiplicacion(int a, int b) {
        return a * b;
    }

    static float division(float a, float b) {
        return a / b;
    }

    static void otraoperacion() {
        System.out.println("¿Desea realiza otra operación?\n[S/N]");
        opcion = entrada.nextLine();
        if (opcion.equalsIgnoreCase("S")) {
            menu();
        } else if (opcion.equalsIgnoreCase("N")) {
            System.out.println("Cerrando programa");
            System.exit(0);
        }
    }

    static class CalculadoraIV {
        void cuarta() {
            textocalculadora();
            try {
                operacionselecionada = Integer.parseInt(operaciones);

                switch (operacionselecionada) {
                    case 1:
                        operaciones = "Suma";
                        break;
                    case 2:
                        operaciones = "Resta";
                        break;
                    case 3:
                        operaciones = "Multiplicación";
                        break;
                    case 4:
                        operaciones = "División";
                        break;
                    case 5:
                        menu();
                        break;
                    default:
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente" +
                                "\nOpciones válidas del 1 al 5");
                        cuarta();
                        break;
                }
                System.out.println("Usted a escogido: " + operaciones);

            } catch (NumberFormatException e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente"
                        + "\nSolo se admiten números");
                cuarta();
            }

            if (operacionselecionada >= 1 && operacionselecionada <= 4) {
              //  confirmacion();
                if (opcion.equalsIgnoreCase("S")) {
                    System.out.println("Seguir instrucciones");
                } else if (opcion.equalsIgnoreCase("N")) {
                    System.out.println("1-Cambiar operación.\n2-Volver al menú");
                    opcion = entrada.nextLine();
                    switch (opcion) {
                        case "1" -> cuarta();
                        case "2" -> menu();
                        default -> {
                            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente"
                                    + "\nOpciones válidas 1 o 2");
                            cuarta();
                        }
                    }
                } else {
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas S o N");
                    cuarta();
                    System.exit(0);
                }
            }
            try {
                for (x = 0; x < 1; x++) {
                    if (operacionselecionada == 1) {
                        num1 = ingresodato();
                        num2 = ingresodato();
                        System.out.println("El resultado de la " + operaciones + " es: " + suma(num1, num2));
                    } else if (operacionselecionada == 2) {
                        num1 = ingresodato();
                        num2 = ingresodato();
                        System.out.println("El resultado de la " + operaciones + " es: " + resta(num1, num2));
                    } else if (operacionselecionada == 3) {
                        num1 = ingresodato();
                        num2 = ingresodato();
                        System.out.println("El resultado de la " + operaciones + " es: " + multiplicacion(num1, num2));
                    } else if (operacionselecionada == 4) {
                        num1 = ingresodato();
                        num2 = ingresodato();
                        if (num2 != 0) {
                            System.out.println("El resultado de la " + operaciones + " es: " + division(num1, num2));
                        } else {
                            System.err.println("¡ERROR! " + operaciones + " entre 0 no permitida.");
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                entrada.nextLine();
                cuarta();
            }
        }
    }
}

class CalculadoraI {
void primera() {
    int n1,n2;
    CalculadoraSimplificada.textocalculadora();
    CalculadoraSimplificada.asignarnombre();
    CalculadoraSimplificada.nombre();
    for(int a=0;a<1;a++){
        CalculadoraSimplificada.confirmacion(this);
        if (CalculadoraSimplificada.operacionselecionada==1) {
            try{
                n1 = CalculadoraSimplificada.ingresodato();
                n2 = CalculadoraSimplificada.ingresodato();
                System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.suma(n1,n2)+".");
            }catch(Exception e){
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                primera();
            }
        }else if (CalculadoraSimplificada.operacionselecionada == 2) {
            try{
                n1 = CalculadoraSimplificada.ingresodato();
                n2 = CalculadoraSimplificada.ingresodato();
                System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.resta(n1,n2)+".");
            }catch(Exception e){
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                primera();
            }
        }else if (CalculadoraSimplificada.operacionselecionada == 3) {
            try{
                n1 = CalculadoraSimplificada.ingresodato();
                n2 = CalculadoraSimplificada.ingresodato();
                System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.multiplicacion(n1,n2)+".");
            }catch(Exception e){
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                primera();
            }
        }else if (CalculadoraSimplificada.operacionselecionada == 4) {
            try{
                n1 = CalculadoraSimplificada.ingresodato();
                n2 = CalculadoraSimplificada.ingresodato();
                if (n2 != 0) {
                    System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.division(n1,n2)+".");
                } else {
                    System.err.println("¡ERROR! " +CalculadoraSimplificada.operaciones+ " entre 0 no permitida.");
                }
            }catch(Exception e){
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                primera();
            }
        }
    }
    }
}

class CalculadoraII {
    void segunda() {
        int n1,n2;
        CalculadoraSimplificada.textocalculadora();
        CalculadoraSimplificada.asignarnombre();
        CalculadoraSimplificada.nombre();
        CalculadoraSimplificada.confirmacion(this);
        if(CalculadoraSimplificada.operacionselecionada>=1&&CalculadoraSimplificada.operacionselecionada<=4){
            switch (CalculadoraSimplificada.operacionselecionada) {
                case 1->{
                    try{
                        n1 = CalculadoraSimplificada.ingresodato();
                        n2 = CalculadoraSimplificada.ingresodato();
                        System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.suma(n1,n2)+".");
                    }catch(Exception e){
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                        segunda();
                        break;
                    }
                }
                case 2->{
                    try{
                        n1 = CalculadoraSimplificada.ingresodato();
                        n2 = CalculadoraSimplificada.ingresodato();
                        System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.resta(n1,n2)+".");
                    }catch(Exception e){
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                        segunda();
                        break;
                    }
                }
                case 3->{
                    try{
                        n1 = CalculadoraSimplificada.ingresodato();
                        n2 = CalculadoraSimplificada.ingresodato();
                        System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.multiplicacion(n1,n2)+".");
                    }catch(Exception e){
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                        segunda();
                        break;
                    }
                }
                case 4->{
                    try{
                        n1 = CalculadoraSimplificada.ingresodato();
                        n2 = CalculadoraSimplificada.ingresodato();
                        switch(n2){
                            case 0 -> System.err.println("¡ERROR! " + CalculadoraSimplificada.operaciones+ " por cero no permitida.");
                            default ->{
                                System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.division(n1,n2)+".");
                                break;}
                        }
                    }catch(Exception e){
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                        segunda();
                        break;
                    }
                }
            }
        }
    }
}

class CalculadoraIII {
    void tercera() {
        //int n1,n2;
        CalculadoraSimplificada.textocalculadora();
        CalculadoraSimplificada.asignarnombre();
        CalculadoraSimplificada.nombre();
        CalculadoraSimplificada.confirmacion(this);
        boolean control = true;
        do {
            /*switch (CalculadoraSimplificada.operacionselecionada) {
                case 1:
                try{
                    n1 = CalculadoraSimplificada.ingresodato();
                    n2 = CalculadoraSimplificada.ingresodato();
                    System.out.println("El resultado de la "+CalculadoraSimplificada.operaciones+" es: "+CalculadoraSimplificada.suma(n1,n2)+".");
                }catch(InputMismatchException e){
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nSolo se admiten números");
                    tercera();
                    break;
                }
            }*/
        /* switch (operacionselecionada) {
                case 1, 2, 3, 4:
                    switch (opcion) {
                        case "S", "s":
                            System.out.println("Seguir las instrucciones");
                            try {
                                switch (operacionselecionada) {
                                    case 1:
                                        num1 = ingresodato();
                                        num2 = ingresodato();
                                        System.out.println("El resultado de la " + operaciones + " es: " + suma(num1, num2));
                                        control = false;
                                        break;
                                    case 2:
                                        num1 = ingresodato();
                                        num2 = ingresodato();
                                        System.out.println("El resultado de la " + operaciones + " es: " + resta(num1, num2));
                                        control = false;
                                        break;
                                    case 3:
                                        num1 = ingresodato();
                                        num2 = ingresodato();
                                        System.out.println("El resultado de la " + operaciones + " es: "+ multiplicacion(num1, num2));
                                        control = false;
                                        break;
                                    case 4:
                                        num1 = ingresodato();
                                        num2 = ingresodato();
                                        switch(num2){
                                            case 0 -> System.err.println("¡ERROR! " + operaciones + " por cero no permitida.");
                                            default ->{
                                                System.out.println("El resultado de la " + operaciones + " es: " + result);
                                                break;}
                                        }
                                        control = false;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                                System.err.println("Solo se admiten números");
                                entrada.nextLine();
                                control = true;
                            }
                            break;
                        case "N", "n":
                            System.out.println("1-Cambio de operación\n2-Regresar al menú");
                            opcion = entrada.nextLine();
                            switch (opcion) {
                                case "1" -> {
                                    tercera();
                                    break;
                                }
                                case "2" -> {
                                    menu();
                                    control = false;
                                }
                                default -> {
                                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente"
                                            + "\nOpciones válidas 1 o 2");
                                    control = true;
                                    break;
                                }
                            }
                        default: {
                            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente"
                                    + "\nOpciones válidas S o N");
                            control = true;
                            break;
                        }
                    }
                    break;
            }*/
        } while (control != false);
    }
}