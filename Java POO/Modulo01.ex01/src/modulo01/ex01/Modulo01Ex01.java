/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo01.ex01;

/**
 *
 * @author AirtonSantos
 */
public class Modulo01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apolices apo1 = new Apolices();
        
        apo1.setNomeSegurado("Airton Santos");
        apo1.setIdade("20");
        apo1.setValorPremio((float) 150.99);
        
        apo1.imprimir();
    }
    
}
