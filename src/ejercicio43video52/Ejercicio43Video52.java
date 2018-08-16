
package ejercicio43video52;

import java.util.*;

public class Ejercicio43Video52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int horasTotales,semanas,dias,horas;
        
        System.out.print("DIGITE EL NUMERO DE HORAS: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168/24;
        horas = horasTotales%24;
        
        System.out.println("\nEL EQUIVALENTE ES: ");
        System.out.println("SEMANAS : "+semanas);
        System.out.println("DIAS : "+dias);
        System.out.println("HORAS : "+horas);
    }
    
}
