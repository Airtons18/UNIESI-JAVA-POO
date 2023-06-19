
package modulo03exemploarraycopy;


public class ExemploArrayCopy {


    public static void main(String[] args) {
        // TODO code application logic here
        int [] vet = {1,2,3,4};
        int[] vet2 = new int[10];
        System.arraycopy(vet, 0, vet2, 6, 4);
        for (int i=0; i<vet2.length; i++) {
            System.out.println("POsição vet2 ["+i+"] = "+vet2[i]);
        }
    }
    
}
