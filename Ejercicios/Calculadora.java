
import java.util.Scanner;

public class Calculadora{
    //Este programa se dividirá en varias calculadoras usando
    //Bucles: for, while y do while.
    //Condicionales: if-else, switch
        static Scanner entrada = new Scanner(System.in);
        public static void main(String args[]){
            menu();
    }
    static void menu(){
        System.out.println("\nSelecione calculadora a ejecutar:");
            System.out.println("\n1-Calculadora(for/if-else)\n2-Calculadora(switch)");
            System.out.println("3-Calculadora(while)\n4.Calculadora(do-while)");
            System.out.println("5-Salir del programa");
            String eleccion = entrada.nextLine();

            
                if(eleccion.matches("-?\\d+")){
                    int eleccion1 = Integer.parseInt(eleccion);
                    switch (eleccion1) {
                        case 1:
                            calculadora1();
                            break;
                        case 5:
                            System.out.println("Cerrando programa.");
                            break;
                        default:
                        System.out.println("Opción no valida");
                        System.out.println("Opciones válidas del 1 al 5");
                        break;
                    }
                }else{
                    System.out.println("Opciones válidas del 1 al 5");
                    System.out.println("Opción ingresada no válida, intente de nuevo.");
                }
    }
    int num1,num2,result;
    static void calculadora1(){
        System.out.println("Por favor Seleccione la operación a realizar:");
        System.out.println("1-Suma.\n2-Resta\n3-Multiplicación\n4-División"); 
        System.out.println("5-Regresar al menú\n6-Salir del programa.");
        String operaciones = entrada.nextLine();
        if (operaciones.matches("-?\\d+")) {
            int operaciones1 = Integer.parseInt(operaciones);
            if(operaciones1==1){
                operaciones="Suma";
            }else if(operaciones1==2){
                operaciones="Resta";
            }else if(operaciones1==3){
                operaciones="Multiplicaciones";
            }else if(operaciones1==4){
                operaciones="División";
            }
            if(operaciones1==1||operaciones1==2||operaciones1==3||operaciones1==4){
                System.out.println("Usted a selecionado: "+operaciones+"\n¿Desea continuar con "+operaciones+"?");
                System.out.println("1-Si\n2-Cambio operación\n3-Volver al menú\n4-Cerrar porgrama");
                String cambio=entrada.nextLine();
                if (cambio.matches("-?\\d+")) {
                    int cambio1=Integer.parseInt(cambio);
                    if (cambio1==1) {
                        System.out.println("Confirmado, seguir las instrucciones");
                    }else if (cambio1==2) {
                        calculadora1();
                    }else if (cambio1==3) {
                        menu();
                    }
                }else{
                    System.out.println("Solo se admiten números, intente nuevamente.");
                    System.out.println("Opciones válidas del 1 al 4");
                    calculadora1();
                }
            }else if(operaciones1==5) {
                    calculadora1();
            }else if (operaciones1==6) {
                System.out.println("Cerrando programa");
                System.exit(6);
            }
        } else {
            System.out.println("Solo se admiten números, intente nuevamente.");
            System.out.println("Opciones válidas del 1 al 6");
            calculadora1();
        }
    }
}