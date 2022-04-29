
package ipc_exfinal;

import java.util.Scanner;

public class Programa1 {
     int num1;
     int num2;
     int suma;
        
    public void sumaNumeros()
    {
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("Ingrese el primer numero");
        num1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=scanner.nextInt();
        
        suma=num1+num2;
        System.out.println("Suma: " +suma);
    }
}
