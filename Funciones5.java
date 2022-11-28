
package funciones;

import java.util.Scanner;

public class Funciones {
    static int maximo(int a, int b, int c){
        int aux=maximo(a,b);
        return (maximo(aux, c));
    }
    static int maximo(int a, int b) {
    }
    public static void main (string[]args) {
        int max = maximo(2,9,7);
        System.out.println("El mayor numero es:" + max);
    }
}
    

