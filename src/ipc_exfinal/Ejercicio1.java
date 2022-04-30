package ipc_exfinal;
import java.util.Scanner;

public class Ejercicio1 {
     float num1;
     float num2;        
    public void compararNumeros()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa para determinar cual es el número mayor ");
        System.out.println("\nIngrese el primer numero");
        num1=scanner.nextFloat();
        System.out.println("Ingrese el segundo numero");
        num2=scanner.nextFloat();     
        
    if(num1>num2)
    {
        System.out.println("El número mayor es: " +num1);
    }
    else
    {
       System.out.println("El número mayor es: " +num2);
    }

    }
}
