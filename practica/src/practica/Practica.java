/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author nflorez
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Digite su fecha de nacimiento:");
        System.out.println("Dia: ");
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();
        System.out.println("Dia: " + dia);
        System.out.println("Mes: ");
        int mes = input.nextInt();
        System.out.println("Mes: " + mes);
        System.out.println("Año: ");
        int ano = input.nextInt();
        System.out.println("Año: " + ano);

        //Validar el mes
        switch (mes) {
            case 1:
                // code block
                System.out.println("Usted nació en Enero");
                break;
            case 2:
                // code block
                System.out.println("Usted nació en Febrero");
                break;
            case 3:
                // code block
                System.out.println("Usted nació en Marzo");
                break;
            case 4:
                // code block
                System.out.println("Usted nació en Abril");
                break;
            case 5:
                // code block
                System.out.println("Usted nació en Mayo");
                break;
            case 6:
                // code block
                System.out.println("Usted nació en Junio");
                break;
            case 7:
                // code block
                System.out.println("Usted nació en Julio");
                break;
            case 8:
                // code block
                System.out.println("Usted nació en Agosto");
                break;
            case 9:
                // code block
                System.out.println("Usted nació en Septiembre");
                break;
            case 10:
                // code block
                System.out.println("Usted nació en Octubre");
                break;
            case 11:
                // code block
                System.out.println("Usted nació en Noviembre");
                break;
            case 12:
                // code block
                System.out.println("Usted nació en Diciembre");
                break;

            default:
                // code block
                System.out.println("Digite un mes valido");
        }

        //Calcular edad
        int edad = 2020 - ano;
        System.out.println("edad "+edad);
        
        /*Utilizar el método getInstance(), que nos proporcionará un objeto Calendar cuyos campos 
        han sido inicializados con la fecha y la hora actuales del sistema.*/
        Calendar fecha = Calendar.getInstance();
        //obtener mes actual
        int mesActual = fecha.get(Calendar.MONTH);
        
        System.out.println(""+(mesActual+1));
        //if(mes){
        //}
    }

}
