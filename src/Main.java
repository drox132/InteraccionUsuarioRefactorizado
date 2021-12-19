import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Scanner scanner= new Scanner(System.in);

        //String name;
        double numeroUno,numeroDos,operador,resultado;
       // String orderName=  "\n Ingrese su nombre por favor";
        //String ordenWelcome= " \n Bienvenido Sr: ";
        //String orderOptions=" por favor seleccione la opcion deseada ";
        String orderFirtNumber= "\n Ingrese el primer numero";
        String orderSecundNumber="\n Ingrese el segundo numero";
        String orderInvalid= "\n La opcion seleccionada es incorrecta";
        //String optionsToSelect= "\n 1. Sumar dos numeros"+
       //                         "\n 2. Restar dos numeros"+
       //                         "\n 3. Multiplicar dos numeros"+
       //                         "\n 4. Dividir dos numeros";
        String resultadoSuma= "El resultado de la suma es: ";
        String resultadoResta= "El resultado de la resta es: ";
        String resultadoMultiplicacion= "El resultado de la Multiplicacion es: ";
        String resultadoDivision= "El resultado de la Division es: ";
        String agradecimiento= "\n"+
                                "\nGracias por usar nuestra plataforma";


        for(int indice = 0 ; indice != 1 ; indice +=5){

        //System.out.println(orderName);
        //name=scanner.nextLine();
        //name= scanner.nextLine();
       // System.out.println(ordenWelcome  .concat(name) .concat(orderOptions));
        //System.out.println(optionsToSelect);
       // operador=scanner.nextInt();

        if (operador >=1 && operador<=4){
            System.out.println(orderFirtNumber);
            numeroUno= scanner.nextDouble();
            System.out.println(orderSecundNumber);
            numeroDos= scanner.nextDouble();


            if (operador==1){
                resultado= (double) numeroUno + (double) numeroDos;
                System.out.println(resultadoSuma .concat(String.valueOf(resultado)).concat(agradecimiento));
            }
            if (operador==2) {
                resultado = (double) numeroUno - (double) numeroDos;
                System.out.println(resultadoResta.concat(String.valueOf(resultado)).concat(agradecimiento));
            }
            if (operador==3){
                resultado=(double) numeroUno* (double)numeroDos;
                System.out.println(resultadoMultiplicacion .concat(String.valueOf(resultado)).concat(agradecimiento));
            }
            if (operador==4){
                resultado=(double)numeroUno/(double) numeroDos;
                System.out.println(resultadoDivision .concat(String.valueOf(resultado)).concat(agradecimiento));
            }
        }else{
            System.out.println(orderInvalid);
        }


*/
        //PRACTICA REFACTORIZADA

        PedirDatos pedirDatos=new PedirDatos();
        Operacion operacion= new Operacion();

        int x=1;
        while (x!=0){
            pedirDatos.pedirNombre();
            pedirDatos.pedirOperador();
            operacion.operacion(pedirDatos.pedirOperador());
            x++;
        }










































//        if (operador==1){
//            resultado= numeroUno + numeroDos;
//            System.out.println(resultadoSuma .concat(String.valueOf(resultado)));
//        }else{
//            if (operador==2){
//                resultado=numeroUno-numeroDos;
//                System.out.println(resultadoResta .concat(String.valueOf(resultado)));
//            }else{
//                if (operador==3){
//                    resultado=numeroUno*numeroDos;
//                    System.out.println(resultadoMultiplicacion .concat(String.valueOf(resultado)));
//                }else{
//                    if (operador==4){
//                        resultado=numeroUno/numeroDos;
//                        System.out.println(resultadoDivision .concat(String.valueOf(resultado)));
//                    }
//                }
//            }
//        }



        }
    }

