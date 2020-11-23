/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josef
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //int contador = 1;
        String nombre;
        String cadenaFinal = "";
        int numeroDias;
        double costoDia;
        double valorCancelar;
        String opcion = "Si";
        
        while (opcion.equals("Si")) {
            System.out.println("Ingresar el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingresar el número de días trabajados");
            numeroDias = entrada.nextInt();
            System.out.println("ingrese el costo del Día trabajado");
            costoDia = entrada.nextDouble();
            valorCancelar = numeroDias * costoDia;
            cadenaFinal = String.format("%s%s\t%d\t$%.2f\t\t$%.2f\n",
                    cadenaFinal,
                    nombre,
                    numeroDias,
                    costoDia,
                    valorCancelar);
            //contador = contador +1;
            System.out.print("Ingresar Si para seguir ingresando datos\n"
                    + "Ingresar No para presentar el reporte final\n");
            entrada.nextLine();
            opcion = entrada.nextLine();
        }
        
        System.out.printf("%s\n", cadenaFinal);
                        
    }
    
}
