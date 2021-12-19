import javax.swing.*;

public class Operacion {
    PedirDatos pedirDatos= new PedirDatos();


    private double suma(double numeroUno, double numeroDos){
        double resultado= numeroUno+numeroDos;
        return resultado;
    }
    private double resta(double numeroUno, double numeroDos) {
        double resultado = numeroUno - numeroDos;
        return resultado;
    }

    private double multiplicacion (double numeroUno, double numeroDos) {
        double resultado = numeroUno * numeroDos;
        return resultado;
    }

    private double division (double numeroUno, double numeroDos) {
        double resultado = numeroUno / numeroDos;
        return resultado;

    }
    public void operacion (int operador){
        if (operador==1){
            double operacionSuma = this.suma(pedirDatos.pedirNumero(),pedirDatos.pedirNumero());
            JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+ operacionSuma);
        }if (operador==2){
            double operacionResta = this.resta(pedirDatos.pedirNumero(),pedirDatos.pedirNumero());
            JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+ operacionResta);
        }if (operador==3){
            double operacionMultiplicacion = this.multiplicacion(pedirDatos.pedirNumero(),pedirDatos.pedirNumero());
            JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+ operacionMultiplicacion);
        }if (operador==4){
            double operacionDivision = this.division(pedirDatos.pedirNumero(),pedirDatos.pedirNumero());
            JOptionPane.showMessageDialog(null,"El resultado de la division es: "+ operacionDivision);
        }

    }


}
