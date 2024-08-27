import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);
    static int x, num1, num2, result, operacionselecionada;
    static String operaciones, opcion, num;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("Elija la calculadora a usar: \n1-Calculadora for/if-else");
        System.out.println("2-Calculadora if/switch\n3-Cerrar programa");
        operaciones = entrada.nextLine();
        try { s
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
                case 3 ->
                    System.out.println("Cerrando programa.");
                default ->
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.\nOpciones válidas 1 al 3.");
            }
        } catch (NumberFormatException e) {
            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.");
            System.err.println("Ingresos válidos números 1 al 3.");
            menu();
        }
    }
    static class CalculadoraI {
        void primera() {
            System.out.println("Favor elija la operación a realizar:\n1-Suma.\n2-Resta.\n3-Multiplicación.");
            System.out.println("4-División.\n5-Regresar al menú.");
            operaciones = entrada.nextLine();
            try {
                operacionselecionada = Integer.parseInt(operaciones);
                if (operacionselecionada == 1) {
                    operaciones = "Suma";
                    System.out.println("Usted a elegido: " + operaciones + ".");
                } else if (operacionselecionada == 2) {
                    operaciones = "Resta";
                    System.out.println("Usted a elegido: " + operaciones + ".");
                } else if (operacionselecionada == 3) {
                    operaciones = "Multiplicación";
                    System.out.println("Usted a elegido: " + operaciones + ".");
                } else if (operacionselecionada == 4) {
                    operaciones = "División";
                    System.out.println("Usted a elegido: " + operaciones + ".");
                } else if (operacionselecionada == 5) {
                    System.out.println("Regresando al menú principal");
                    menu();
                    System.exit(5);
                } else {
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                    primera();
                }
            } catch (NumberFormatException e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente.");
                System.err.println("Ingresos válidos números 1 al 5.");
                primera();
            }
            try {
                for (x = 0; x < 1; x++) {

                    System.out.println("¿Desea continuar con la operación " + operaciones + "?\n[S/N]");
                    opcion = entrada.nextLine();
                    
                    if (opcion.trim().isEmpty() || opcion.equalsIgnoreCase("S")) {
                        System.out.println("Recibido, favor seguir las indicaciones.");
                      
                        if (operacionselecionada == 1) {
                            System.out.println("Ingrese primer número");
                            num1 = entrada.nextInt();
                            System.out.println("Ingrese segundo número");
                            num2 = entrada.nextInt();
                            result = num1 + num2;
                            System.out.println("El resultado de la " + operaciones + " es: " + result);
                        } else if (operacionselecionada == 2) {
                            System.out.println("Ingrese primer número");
                            num1 = entrada.nextInt();
                            System.out.println("Ingrese segundo número");
                            num2 = entrada.nextInt();
                            result = num1 - num2;
                            System.out.println("El resultado de la " + operaciones + " es: " + result);
                        } else if (operacionselecionada == 3) {
                            System.out.println("Ingrese primer número");
                            num1 = entrada.nextInt();
                            System.out.println("Ingrese segundo número");
                            num2 = entrada.nextInt();
                            result = num1 * num2;
                            System.out.println("El resultado de la " + operaciones + " es: " + result);
                        } else if (operacionselecionada == 4) {
                            System.out.println("Ingrese primer número");
                            double num1 = entrada.nextDouble();
                            System.out.println("Ingrese primer número");
                            double num2 = entrada.nextDouble();
                            double result = num1 / num2;
                            if (num2 != 0) {
                                System.out.println("El resultado de la " + operaciones + " es: " + result);
                            }else{
                                System.err.println("¡ERROR! " + operaciones + " entre 0 no permitida.");
                            }
                        }
                    } else if (opcion.equalsIgnoreCase("N")) {
                        System.out.println("¿Desea cambiar operación?\n[S/N]");
                        opcion = entrada.nextLine();
                        if (opcion.trim().isEmpty() || opcion.equalsIgnoreCase("S")) {
                            primera();
                        } else if (opcion.equalsIgnoreCase("N")) {
                            System.out.println("Cerrando programa.");
                            System.exit(0);
                        } else {
                            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                            System.err.println("Opciones válidas S o N");
                            primera();
                        }
                    } else {
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                        System.err.println("Opciones válidas S o N");
                        primera();
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                System.err.println("Solo se admiten números");
                primera();
            }
            
        }
    }
    static class CalculadoraII {
        void segunda() {
            System.out.println("Favor elija la operación a realizar:\n1-Suma.\n2-Resta.\n3-Multiplicación.");
            System.out.println("4-División.\n5-Regresar al menú.");
            operaciones = entrada.nextLine();
            try {
                operacionselecionada = Integer.parseInt(operaciones);
                switch (operacionselecionada) {
                    case 1:
                        operaciones = "Suma";
                        System.out.println("Usted a elegido " + operaciones + ".");
                        break;
                    case 2:
                        operaciones = "Resta";
                        System.out.println("Usted a elegido " + operaciones + ".");
                        break;
                    case 3:
                        operaciones = "Multiplicación";
                        System.out.println("Usted a elegido " + operaciones + ".");
                        break;
                    case 4:
                        operaciones = "División";
                        System.out.println("Usted a elegido " + operaciones + ".");
                        break;
                    case 5:
                        System.out.println("Regresando al menú principal.");
                        menu();
                        break;
                    default:
                        System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                        segunda();
                }
            } catch (NumberFormatException e) {
                System.err.println("¡ERROR!\nIngreso no válido intente nuevamente");
                segunda();
            }
        }
    }
}