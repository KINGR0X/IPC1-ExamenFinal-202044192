
package ipc_exfinal;

import java.util.Scanner;

public class Ejercicio2 {
    
    int num=0;
    int residuo;
    Scanner scanner = new Scanner(System.in);

    public void arbol()
    {
        System.out.println("Bienvenido al programa para dibujar arboles con números impares");
        System.out.println("\nIngrese el número de asteriscos que tendra la base del árbol");        
    
        num=scanner.nextInt();
        residuo=num%2;

        if(residuo!=0)
        {

            int i,esp,asterisco; 
            for (int j = 0; j < 10; j++) {
                
            }

            for (i =1; i<=num; i++) {
                
                for (esp = 1; esp <= num-i; esp++) {
                    System.out.print(" ");
                }
            
                for (asterisco= 1; asterisco<=i; asterisco++) {
                    System.out.print("* ");
                    
                }
            
                System.out.println(" ");
            }
   
        }
        else
        {
                    System.out.println("Incorrecto");       
        }
    
    }
    
}
