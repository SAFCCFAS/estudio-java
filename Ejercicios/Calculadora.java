import java.util.*;
/*Este programa usará las condicionales if-else, for, switch, do-while/while*/
public class Calculadora{
    /*Este diseño con for y if-else ayudará a famializar su uso, se que puede no
     ser lo más efectivo pero si deseas reforzar el conocimiento de for e if-else 
     puede ser significativo*/
    /* Para entrar en contexto:
   - if (sí en español): analiza si se cumple una condición. Si es verdadera, ejecuta el código que sigue.
   - else if (entonces sí): se usa para verificar otra condición si la primera no se cumplió.
   - else (sino): se ejecuta cuando ninguna de las condiciones anteriores se cumple. */
    /*static se relaciona al término que algo se puede usar dentro de la clase
    sin necesidad de ser usado en cada objeto que se declare.*/
    static Scanner entrada=new Scanner(System.in); 
    static int num1,num2,result;
    /* Teniendo en cuenta lo anterior, se usa 'static' para evitar declarar 
   las variables cada vez que se necesiten. Al declararlas como 'static', 
   se vuelven globales dentro de la clase, lo que simplifica su uso. 
   Por ejemplo, en lugar de declarar 'int num1, num2, result' cada vez, 
   podemos simplemente usar 'num1 = ...' porque ya fueron declaradas antes 
   como 'static'. */
    public static void main(String []args){
        System.out.println("Esccoger la calculadora a usar \n1 Calculadora con for/if-else \n2 Calculadora con switch");
        String opc = entrada.nextLine();
        int opc1 =Integer.parseInt(opc);

        switch(opc1){
            case 1 -> calculadora();
            case 2 ->{  
                calculadoraI otra = new calculadoraI();
                otra.segunda();
            }
            //case 3-> menu(); 
        }System.exit(opc1);
    }
    /*static void menu(){ 
            int ope;
        do{
            System.out.println("Selecciona la operación a realizar: \n1. Suma. \n2. Resta. \n3. Multplicación. \n4. División.");
            ope = entrada.nextInt();
            switch (ope) {
                case 1-> suma();
                case 2-> {
                    int n1=ingreso();
                    int n2=ingreso();
                    resta(n1, n2);
                }
                case 3-> System.out.println("Multiplicación");
                case 4-> System.out.println("División");
                case 5-> {System.out.println("Salir");break;}
                default->System.err.println("Opciones válidas 1, 2, 3 y 4.");
            }
        }while(ope!=5);
    }
    static void suma(){
        System.out.println("Por favor ingrese primer número");
        int num1 =entrada.nextInt();
        System.out.println("Por favor ingrese segundo número");
        int num2 =entrada.nextInt();
        int result=num1+num2;
        System.out.println("El resultado es :"+result+"\n");
    }
    static int resta(int a,int b){
        return a-b;
    }
    static int ingreso(){
        System.out.println("Por favor ingrese un número");
        int num1 =entrada.nextInt();
        return num1;
    }*/
    
   static void calculadora(){
    System.out.println("Selecciona la operación a realizar: \n1. Suma. \n2. Resta. \n3. Multplicación. \n4. División.");
        String operacion = entrada.nextLine();
        String nameop= "";
        String otraOperacion ="";
        
        if(operacion.matches("-?\\d+")) { //Aqui se realiza la validación inicial de ingreso si cumple con lo solicitado
            int operacion1 = Integer.parseInt(operacion); //en este punto se ha realizado la validación y se indica que se requiere
            if (operacion1 == 1) {  //aqui se analiza si se cumple la condición anterior de solicitud en este caso si el ingreso 1
                 nameop = "Suma";   //aqui si se cumple la condición que realizará o mostraré en tal caso
                 System.out.println("Usted ha selecionado "+nameop+".");
            } else if (operacion1 == 2) { // de lo contrario sino se cumple la condición...
                 nameop = "Resta";        // que realizará o mostrará
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
        
        }for(int i=0;i<1;i++){
            System.out.println("Desea continuar con la operación "+nameop+"?\nS = Si.\nN = No.");
            operacion=entrada.nextLine();
            if (operacion.equalsIgnoreCase("S")) {
                System.out.println("Confirmado, seguir las instrucciones");
                    if(operacion1==1){
                        System.out.println("Favor ingresar primer número:");
                        num1=entrada.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        num2=entrada.nextInt();
                        result=num1+num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==2){
                        System.out.println("Favor ingresar primer número:");
                        int num1=entrada.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        int num2=entrada.nextInt();
                        int result=num1-num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==3){
                        System.out.println("Favor ingresar primer número:");
                        int num1=entrada.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        int num2=entrada.nextInt();
                        int result=num1*num2;
                        System.out.println("El resultado de la "+nameop+" es "+result);
                    }else if(operacion1==4){
                        System.out.println("Favor ingresar primer número:");
                        double num1=entrada.nextInt();
                        System.out.println("Favor ingresar segundo número:");
                        double num2=entrada.nextInt();
                        if (num2!=0||num1!=0) {
                            double result=num1/num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);   
                        }else{
                            System.out.println("No es posible dividir entre 0");
                        }
                    }
            }else if(operacion.equalsIgnoreCase("N")){
                    System.out.println("¿Desea cerrar aplicación o cambiar operación?\n1. Cerrar programa.\n2. Cambiar operación.");
                String cambio=entrada.nextLine();
                if(cambio.matches("-?\\d+")){
                    int cambio1=Integer.parseInt(cambio);
                    if(cambio1==1){
                        System.out.println("Cerrando programa");
                        System.exit(cambio1);
                    }else if(cambio1==2){
                        System.out.println("Selecciona la operación a realizar: \n1. Suma. \n2. Resta. \n3. Multplicación. \n4. División.");
                        otraOperacion=entrada.nextLine();
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
                            num1=entrada.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            num2=entrada.nextInt();
                            result=num1+num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==2){
                            System.out.println("Favor ingresar primer número:");
                            num1=entrada.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            num2=entrada.nextInt();
                            result=num1-num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==3){
                            System.out.println("Favor ingresar primer número:");
                            num1=entrada.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            num2=entrada.nextInt();
                            result=num1*num2;
                            System.out.println("El resultado de la "+nameop+" es "+result);
                        }else if(operacion1==4){
                            System.out.println("Favor ingresar primer número:");
                            double num1=entrada.nextInt();
                            System.out.println("Favor ingresar segundo número:");
                            double num2=entrada.nextInt();
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
class calculadoraI{
    void segunda(){
        System.out.println("Selecciona la operación a realizar: \n1. Suma.\n2. Resta.\n3. Multplicación.\n4. División.");
        
    }
}