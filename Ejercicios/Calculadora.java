import java.util.*;
/*Este programa usará las condicionales if-else, for*/
public class Calculadora{
    /*Este diseño con for y if-else ayudará a famializar su uso, se que puede no
     ser lo más efectivo pero si deseas reforzar el conocimiento de for e if-else 
     puede ser significativo*/
    public static void main(String []args){
        System.out.println("Selecciona la operación a realizar: \n1. Suma. \n2. Resta. \n3. Multplicación. \n4. División.");
        Scanner leer = new Scanner(System.in);
        String operacion = leer.nextLine();
        String nameop= "";
        String otraOperacion ="";
        
        if (operacion.matches("-?\\d+")) { //Aqui se realiza la validación inicial de ingreso
            int operacion1 = Integer.parseInt(operacion); //para admitir ingresos de enteros
            if (operacion1 == 1) {
                 nameop = "Suma";
                 System.out.println("Usted ha selecionado "+nameop+".");
            } else if (operacion1 == 2) {
                 nameop = "Resta";
                 System.out.println("Usted ha selecionado "+nameop+".");
            } else if (operacion1 == 3) {
                 nameop = "Multiplicación";
                 System.out.println("Usted ha selecionado "+nameop+".");
            } else if (operacion1 == 4) {
                 nameop = "División";
                 System.out.println("Usted ha selecionado "+nameop+".");
            }else{
                System.err.println("Opción ingresada no válida.");
                System.err.println("Opciones válidas 1, 2, 3 y 4.");
            System.exit(0);
        
        } for(int i=0;i<1;i++){
            System.out.println("Desea continuar con la operación "+nameop+"?\nS = Si.\nN = No.");
            operacion=leer.nextLine();
            if (operacion.equalsIgnoreCase("S")) {
                System.out.println("Confirmado, seguir las instrucciones");
                    if(operacion1==1){
                        System.out.println("Favor ingresar primer número:");
                        int num1=leer.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        int num2=leer.nextInt();
                        int result=num1+num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==2){
                        System.out.println("Favor ingresar primer número:");
                        int num1=leer.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        int num2=leer.nextInt();
                        int result=num1-num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==3){
                        System.out.println("Favor ingresar primer número:");
                        int num1=leer.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        int num2=leer.nextInt();
                        int result=num1*num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==4){
                        System.out.println("Favor ingresar primer número:");
                        double num1=leer.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        double num2=leer.nextInt();
                        if (num2!=0||num1!=0) {
                            double result=num1/num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);   
                        }else{
                            System.out.println("No es posible dividir entre 0");
                        }
                    }
            }else if(operacion.equalsIgnoreCase("N")){
                    System.out.println("¿Desea cerrar aplicación o cambiar operación?\n1. Cerrar programa.\n2. Cambiar operación.");
                String cambio=leer.nextLine();
                if(cambio.matches("-?\\d+")){
                    int cambio1=Integer.parseInt(cambio);
                    if(cambio1==1){
                        System.out.println("Cerrando programa");
                        System.exit(cambio1);
                    }else if(cambio1==2){
                        System.out.println("Selecciona la operación a realizar: \n1. Suma. \n2. Resta. \n3. Multplicación. \n4. División.");
                        otraOperacion=leer.nextLine();
                        if(otraOperacion.matches("-?\\d+")){
                            operacion1=Integer.parseInt(otraOperacion);
                            if (operacion1 == 1) {
                                nameop = "Suma";
                                System.out.println("Usted ha selecionado "+nameop+".");
                           } else if (operacion1 == 2) {
                                nameop = "Resta";
                                System.out.println("Usted ha selecionado "+nameop+".");
                           } else if (operacion1 == 3) {
                                nameop = "Multiplicación";
                                System.out.println("Usted ha selecionado "+nameop+".");
                           } else if (operacion1 == 4) {
                                nameop = "División";
                                System.out.println("Usted ha selecionado "+nameop+".");
                           }else{
                            System.err.println("Opción ingresada no válida.");
                            System.err.println("Opciones válidas 1, 2, 3 y 4.");
                        }
                        if(operacion1==1){
                            System.out.println("Favor ingresar primer número:");
                            int num1=leer.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            int num2=leer.nextInt();
                            int result=num1+num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==2){
                            System.out.println("Favor ingresar primer número:");
                            int num1=leer.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            int num2=leer.nextInt();
                            int result=num1-num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==3){
                            System.out.println("Favor ingresar primer número:");
                            int num1=leer.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            int num2=leer.nextInt();
                            int result=num1*num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==4){
                            System.out.println("Favor ingresar primer número:");
                            double num1=leer.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            double num2=leer.nextInt();
                            if (num2!=0||num1!=0) {
                                double result=num1/num2;
                                System.out.println("El resultado de la "+nameop+" es "+result);   
                            }else{
                                System.out.println("No es posible dividir entre 0");
                            }
                        }
                    }else{
                            System.err.println("Solo se aceptan números");
                        }   
                    }
                    else{
                        System.err.println("Opción ingresada no válida");
                        System.err.println("Opciones válidas 1. Cerrar programa, 2. Cambiar operación.");
                    }
                    
                }else{
                    System.err.println("Opción ingresada no válida");    
                }
            }else{
                System.err.println("Opción ingresada no válida");
                System.err.println("Solo S para Si o N para No");
            }
        }
        }else {
            System.err.println("Solo se permiten números.");
        }
   }
}