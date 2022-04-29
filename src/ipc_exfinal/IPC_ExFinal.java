
package ipc_exfinal;

import java.util.InputMismatchException;
import java.util.Scanner;


public class IPC_ExFinal {

    public static void main(String[] args) {
        //Usar otras clases
        Programa1 prog1= new Programa1();
        
        //Scanner
        int option;
        Scanner scanner = new Scanner(System.in);
        
        boolean salir=false; 
        
        while(!salir)
        {
            //Menu de 4 opciones
        System.out.println("\nBienvenido seleccione una opción del menú");
        System.out.println("1.Programa 1");
        System.out.println("2.Programa 2");
        System.out.println("3.Programa 3");
        System.out.println("4.Salir del programa");
        
        try{
        
        option=scanner.nextInt();
        
            switch (option){
                case 1:
                    prog1.sumaNumeros();
                    break;
                case 2:
                    System.out.println("Opción 2");
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
