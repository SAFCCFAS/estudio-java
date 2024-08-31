
import java.util.*;

public class CalculadoraSimplificada {

    static Scanner entrada = new Scanner(System.in);
    static int x, num1, num2, result, operacionselecionada;
    static String operaciones, opcion;
    static boolean control;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {

        System.out.println("Elija la calculadora a usar: \n1-Calculadora for/if-else"+
        "\n2-Calculadora if/switch\n3-Calculadora do-while/switch\n4-Calculadora Switch/if-else/for"
        +"\n5-Cerrar programa");
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
                    System.exit(4);
                }
                default -> {
                    System.err.println("¡ERROR!\nIngreso no válido intente nuevamente."+
                    "\nOpciones válidas 1 al 4.");
                    menu();
                }

            }

        } catch (NumberFormatException e) {
            System.err.println("¡ERROR!\nIngreso no válido intente nuevamente."+
            "\nSolo se admiten números (1-4)");
            menu();
        }
    }

    static class CalculadoraI {
        void primera() {

        }
    }

    static class CalculadoraII {
        void segunda() {
           
        }
    }

    static class CalculadoraIII {
        void tercera() {
            
        }
    }
    
    static class CalculadoraIV{
        void cuarta(){

        }
    }
}