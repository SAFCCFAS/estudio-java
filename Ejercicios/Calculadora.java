import java.util.*;
/*Este programa usará las condicionales if-else, for, switch y while*/
public class Calculadora{
    /*Este diseño con for y if-else ayudará a famializar su uso, se que puede no
     ser lo más efectivo pero si deseas reforzar el conocimiento de for e if-else 
     puede ser significativo*/
    public static void main(String []args){
        System.out.println("Selecciona la operación a realizar: \n1. Suma \n2. Resta \n3. Multplicación \n4. División");
        Scanner leer = new Scanner(System.in);
        int operacion = leer.nextInt();
        leer.nextLine();
        String nombreOperacion = "";
        

            if(operacion == 1){
                nombreOperacion = "Suma";
            }else if(operacion == 2 ){
                nombreOperacion ="Resta";
            }else if(operacion == 3){
                nombreOperacion ="Multiplicación";
            }else if(operacion == 4){
                nombreOperacion ="División";
            }
            if(operacion!=1 && operacion!=4){
                System.out.println("Solo numeros");      
            }

            if (operacion>=1 && operacion<=4){
                System.out.println("Usted a seleccionado "+nombreOperacion);      
            }else{
                System.out.println("Opción no válida. \nFavor ingresar las opciones indicadas (1-4)");
            }
            if(operacion>=1 && operacion<=4){
                    System.out.println("¿Desea continuar con la operación "+nombreOperacion+"? \nS = Si \nN = No");
                    String resp = leer.nextLine();
                    if(resp.equalsIgnoreCase("S")){
                        System.out.println("Confimado, seguir las instrucciones");
                    }else if(resp.equalsIgnoreCase("N")){
                        System.out.println("¿Desea cambiar operación? \nS = Si \nN = No");
                        String cambio = leer.nextLine();
                        if (cambio.equalsIgnoreCase("S")) {
                            System.out.println("Selecciona la operación a realizar: \n1. Suma \n2. Resta \n3. Multplicación \n4. División");
                            operacion = leer.nextInt();
                        }else if(cambio.equalsIgnoreCase("N")){
                            System.out.println("Cerrando programa");
                        }else{
                        System.out.println("Dato ingresado no válido,por favor ingrese 'S' para Sí o 'N' para No.");
                    }
                }
                if(operacion==1){
                    System.out.println("Por favor, ingrese primer número:");
                    int num1=leer.nextInt();
                    System.out.println("Por favor, ingrese segundo número:");
                    int num2=leer.nextInt();
                    int result=num1+num2;
                    System.out.println("El resultado de la "+nombreOperacion+" es "+result);
                }else if(operacion==2){
                    System.out.println("Por favor, ingrese primer número:");
                    int num1=leer.nextInt();
                    System.out.println("Por favor, ingrese segundo número:");
                    int num2=leer.nextInt();
                    int result=num1-num2;
                    System.out.println("El resultado de la "+nombreOperacion+" es "+result);
                }else if(operacion==3){
                    System.out.println("Por favor, ingrese primer número:");
                    int num1=leer.nextInt();
                    System.out.println("Por favor, ingrese segundo número:");
                    int num2=leer.nextInt();
                    int result=num1*num2;
                    System.out.println("El resultado de la "+nombreOperacion+" es "+result);
                }else if(operacion==4){
                    System.out.println("Por favor, ingrese primer número:");
                    int num1=leer.nextInt();
                    System.out.println("Por favor, ingrese segundo número:");
                    int num2=leer.nextInt();
                    if(num2!=0){
                        int result=num1/num2;
                        System.out.println("El resultado de la "+nombreOperacion+" es "+result);                 
                    }else{
                        System.out.println("Error: " +nombreOperacion+ " por cero no permitida.");
                    }
                }
            }
        
    }  
}