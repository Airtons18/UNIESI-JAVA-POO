
package modelo03.exemploarraysfill;

import java.util.Arrays;

public class ExemploArraysFill {


    public static void main(String[] args) {
        // TODO code application logic here
        int[] vet = new int[5];
        Arrays.fill(vet, 15);
        for (int i=0; i<vet.length; i++) {
            System.out.println("vet ["+i+"] = "+vet[i]);
        }
    }
    
}
