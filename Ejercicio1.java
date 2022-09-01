/*
EJERCICIO 1: Perfect Number (NUS)
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sumaFactor = 0;
        // Entrada
        System.out.print(
                "Bienvenido(a), a continuación se corroborará si un número es perfecto o no.\nIngrese un número: ");
        num = scan.nextInt();
        // Condicional y bucle for
        for (int factor = 1; factor < num; factor++) {
            if (num % factor == 0)
                sumaFactor += factor;
        }
        // Salidas
        if (num == sumaFactor)
            System.out.println("Efectivamente, el número ingresado es un número perfecto.");
        else
            System.out.println("El número ingresado no es un número perfecto. La suma de sus propios divisores es "+sumaFactor+".");
        scan.close();
    }
}