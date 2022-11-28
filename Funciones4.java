
package funciones;

import java.util.Scanner;

public class Funciones {
    static int maximo(int a, int b){
        int max;
        
        if (a>b){
            max= a;
                    }else{
            max = b;
                    }
        return (max);
    }
    public static void main(String[] args) {
       
    Scanner sc = newScanner(System.in);
        
        System.out.println("introduzca un numero:");
        int a=sc.nextInt();
        System.out.println("Por favor introduzca otro numero:");
        int b=sc.nextInt();

System.out.println("El numero mayor es: " + maximo(a , b));        
}
        }
    
