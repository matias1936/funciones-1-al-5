
package funciones;

import java.util.Scanner;

public class Funciones {
    public static void mostrar(int a, int b){
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;
        
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
            
        }
    }
    public static void main(String[] args){
        Scanner sc=newScanner(System.in);
        System.out.print("Introduzca el primer numero:");
        int a=sc.nextInt();
        System.out.print("Introduzca el segundo numero:");
        int b=sc.nextInt();
        
        mostrar(a,b);
        
    }
}
        
