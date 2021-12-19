import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class PedirDatos {


    public void pedirNombre(){
        String nombre= JOptionPane.showInputDialog("Ingrese su nombre por favor");
        JOptionPane.showMessageDialog(null,"\n Bienvenido Sr: " .concat(nombre));
    }

    public int pedirOperador (){
        int operador=0;
        while (operador!=1&&operador!=2&&operador!=3&&operador!=4){
            operador = Integer.parseInt(JOptionPane.showInputDialog(
                    " Por favor seleccione la opcion deseada "+
                            "\n 1. Sumar dos numeros"+
                            "\n 2. Restar dos numeros"+
                            "\n 3. Multiplicar dos numeros"+
                            "\n 4. Dividir dos numeros"));
        }
        return operador;
    }

    public double pedirNumero (){
        double numero =Double.valueOf(JOptionPane.showInputDialog("Ingrese un numero"));
        return numero;

    }


}
