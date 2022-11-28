
package funciones;

import java.util.Scanner;

public class Funciones {
    static void areaVolumenCilindro( double radio, double altura, int opcion){
        double volumen, area;
        
        switch(opcion){
            case 1:
                    volumen=math.PI*math pow(radio,2)*altura;
                    System.out.println("El volumen es de: "+ volumen);
                    break;
                            case 2:
                                    area=2*math.PI*radio*(altura+radio);
                                    System.out.println("El area es de:"+area);
                                    break;
                            default:
                                    System.out.println("Indicador del calculo erroneo");
        }
    }
     public static void main(String[] args){
         Scanner sc= newScanner(System.in);
         System.out.print("Introduzca radio:");
         double radio=sc.nextDouble();
         System.out.print("Introduzca altura");
         double alt=sc.nextDouble();
         System.out.print("Qué desea calcular (1(área)/2(volumen):");
         int tipoCalculo=sc.nextInt();
         
         System.out.println();
         areaVolumenCilindro(radio, alt, tipoCalculo);
     }
     }