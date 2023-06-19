/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo02.exercicio01;

/**
 *
 * @author Uniesi
 */
public class PrincipalAcampamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Acampamentos ac = new Acampamentos("Maria", ' ',8); // Construtor é isso, na mesma linha e na ordem
        ac.separarGrupo();
        ac.imprimir();
        
       // Acampamentos ac1 = new Acampamentos("Joao", '', 20);
    }
    
}
