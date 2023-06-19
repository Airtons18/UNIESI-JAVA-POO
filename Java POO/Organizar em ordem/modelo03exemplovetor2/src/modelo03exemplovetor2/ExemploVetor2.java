
package modelo03exemplovetor2;

import java.util.Scanner;

public class ExemploVetor2 {


    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] var1 = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os 10 valores \n");
        //Percorrendo o vetor
        for (int i=0; i<var1.length; i++) {
            System.out.println("var1["+i+"] ? ");
            var1[i] = sc.nextInt();
        }
        int soma=0;
        int cont=0;
        for (cont=0; cont<var1.length; cont++) {
            soma += var1[cont];
        }
        float media = (float)soma/(float)(cont);
        System.out.printf("Média = %2.2f \n", media);
    }
    
}
