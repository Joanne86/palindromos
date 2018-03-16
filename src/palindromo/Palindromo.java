package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir numero entero:");
        n = entrada.nextInt();
        verificarN(n);
    }

    public static void verificarN(int n) {

        int r, s = 0, k, cifras = 0;
        k = n;

        while (n != 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
            cifras++;
        }
        if (cifras == 5 && s == k) {
            System.out.print("\nel numero invertido es :" + s);
            System.out.println("\nes palindromo");
        } else {
            System.out.println("\nno es palindromo");
        }
    }
}
