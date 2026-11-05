import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random alea = new Random();
        Scanner leer = new Scanner(System.in);
        String arrayPrimitiva[] = new String[6];

        for (int i = 0; i < arrayPrimitiva.length; i++) {
            int numAle = alea.nextInt(100);
            arrayPrimitiva[i] = String.valueOf(numAle);
        }

        for (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }

        System.out.println("Dame un num 1");
        String cadUsuario1 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario1.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }

        System.out.println("Dame un num 2");
        String cadUsuario2 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario2.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }

        System.out.println("Dame un num 3");
        String cadUsuario3 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if (cadUsuario3.equals(arrayPrimitiva[i])) {
                arrayPrimitiva[i] = "XX";
            }
        }

        for (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }

    }
}