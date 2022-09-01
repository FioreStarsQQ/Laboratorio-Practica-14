
/*
EJERCICIO 2: Shopping Card (NUS)In
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String producto;
        int costo, cantidad;
        char respuesta = 's';
        double suma = 0;
        // Entrada
        System.out.println("***********Bienvenido(a)*********");
        for (;;) {
            System.out.print("Ingrese el nombre del producto: ");
            producto = scan.next();
            System.out.print("Ingrese el costo unitario del producto: ");
            costo = scan.nextInt();
            System.out.print("Ingrese la cantidad a comprar: ");
            cantidad = scan.nextInt();
            suma += (costo * cantidad * 1.0);
            do {
                System.out.print("¿Desea agregar más productos?\n(Sí:\tPresione \'s\' ; No;\tPresione \'n\')\n");
                respuesta = scan.next().charAt(0);
                if (respuesta == 'n' || respuesta == 's')
                    break;
            } while (respuesta != 'n' || respuesta != 's');
            if (respuesta == 'n') {
                scan.close();
                break;
            }
        }
        System.out.print("Total a pagar:\t$ " + String.format("%.02f", suma * 0.01));
    }
}