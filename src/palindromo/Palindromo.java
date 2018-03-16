
package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
        System.out.print("ingrese un numero: ");
        n=entrada.nextInt();
        int cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
    }
    
}
