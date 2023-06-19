
package modelo02exemplovetor;

import java.util.Scanner;

public class ExemploVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] idade;
        idade = new int[5];
        idade[0] = 21;
        idade[1] = 10;
        idade[2] = 16;
        idade[3] = 24;
        idade[4] = 19;
        for (int i=0; i<idade.length;i++) {
            System.out.printf("Elemento %d - idade %d \n", i,idade[i]);
            System.out.println("Elemento "+ i +" - idade "+ idade[i]);
        }
        int[] idadeGrupo2 ={14,21,35};
            for (int i=0; i<idadeGrupo2.length;i++){
                System.out.printf("grupo 2, Elemento %d - idade \n", i,idadeGrupo2[i]);
            }
    }
    
}
