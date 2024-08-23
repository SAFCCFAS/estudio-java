
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
                        case 1:{
                            CalculadoraI one = new CalculadoraI();
                            one.primera();
                        }
                            break;
                        case 2:
                            calculadora2();
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
    static int num1, num2, result;
    static class CalculadoraI{
        void primera(){
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
                    if (cambio1==1){
                        System.out.println("Confirmado, seguir las instrucciones");
                    }else if (cambio1==2){
                        primera();
                        System.exit(2);
                    }else if (cambio1==3){
                        menu();
                    }else if (cambio1==4){
                        System.out.println("Cerrando programa.");
                        System.exit(4);
                    }
                }else{
                    System.out.println("Solo se admiten números, intente nuevamente.");
                    System.out.println("Opciones válidas del 1 al 4");
                    primera();
                }
            }else if(operaciones1==5) {
                    primera();
            }else if (operaciones1==6) {
                System.out.println("Cerrando programa");
                System.exit(6);
            }
            for(int x=0;x<1;x++){
                if(operaciones1==1){
                    System.out.println("ingrese primer número:");
                    num1=entrada.nextInt();
                    System.out.println("Ingrese segundo número:");
                    num2=entrada.nextInt();
                    result=num1+num2;
                    System.out.println("El resultado de la "+operaciones+" es: "+result);
                }else if(operaciones1==2){
                    System.out.println("ingrese primer número:");
                    num1=entrada.nextInt();
                    System.out.println("Ingrese segundo número:");
                    num2=entrada.nextInt();
                    result=num1-num2;
                    System.out.println("El resultado de la "+operaciones+" es: "+result);
                }else if(operaciones1==3){
                    System.out.println("ingrese primer número:");
                    num1=entrada.nextInt();
                    System.out.println("Ingrese segundo número:");
                    num2=entrada.nextInt();
                    result=num1*num2;
                    System.out.println("El resultado de la "+operaciones+" es: "+result);
                }else if (operaciones1==4) {
                    System.out.println("Ingrese primer número");
                    double num1=entrada.nextDouble();
                    System.out.println("Ingrese segundo número:");
                    double num2=entrada.nextDouble();
                    if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.println("El resultado de la " + operaciones + " es: " + result);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }   
            }
        }
        } else {
            System.out.println("Solo se admiten números, intente nuevamente.");
            System.out.println("Opciones válidas del 1 al 6");
            primera();
        }
        }
        
    }
    static void calculadora2(){
        System.out.println("Test");
    }
}