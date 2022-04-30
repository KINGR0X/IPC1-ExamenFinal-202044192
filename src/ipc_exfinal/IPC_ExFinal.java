
package ipc_exfinal;

import java.util.InputMismatchException;
import java.util.Scanner;


public class IPC_ExFinal {

    public static void main(String[] args) {
        //Usar otras clases
        Ejercicio1 prog1= new Ejercicio1();
        Ejercicio2 prog2= new Ejercicio2();
        
        //Scanner
        int option;
        Scanner scanner = new Scanner(System.in);
        
        boolean salir=false; 
        
        while(!salir)
        {
            //Menu de 4 opciones
        System.out.println("\nBienvenido seleccione una opción del menú");
        System.out.println("1.Comparar números");
        System.out.println("2.Dibujar árbol");
        System.out.println("3.Programa 3");
        System.out.println("4.Salir del programa");
        
        try{
        
        option=scanner.nextInt();
        
            switch (option){
                case 1:
                    prog1.compararNumeros();
                    break;
                case 2:
                    prog2.arbol();
                    break;
                case 3:
                    System.out.println("Opción 3");
                    break;
                case 4:
                    salir=true;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción del menú");

            }
            } catch(InputMismatchException e)
            {
                System.out.println("Por favor ingrese una opción del menú");
                scanner.next();
            }
        }

    } 
    
}
