/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contascorentes;

/**
 *
 * @author Uniesi
 */
public class main {


    public static void main(String[] args) {
        // TODO code application logic here
        ContasCorrentes conta1 = new ContasCorrentes();
        //acesso ao atributo estatico por meio do nome da classe
        ContasCorrentes.cpmf = 0.0038;
        conta1.saldo=1000;
        ContasCorrentes conta2 = new ContasCorrentes();
        conta2.saldo=2000;
        System.out.println("Manipulando Objetos em JAVA\u2122");
        System.out.println("Oracle & Sun Microsystem, Inc. \u00A9");
        //atributo estático sendo acessado por um objeto
        System.out.println("Objeto conta1 - atributo estático: "+conta1.cpmf);
        System.out.println("Objeto conta1 - atributo não estático: "+conta1.saldo);
        //atributo estático sendo acessado por um objeto
        System.out.println("Objeto conta2 - atributo estático: "+conta2.cpmf);
        System.out.println("Objeto conta2 - atributo não estático: "+conta2.saldo);
        conta2.cpmf = 0.0010;
        //Atributo estático sendo acessado por um objeto
        System.out.println("Após a alteração....");
        //Acessando o atributo estático por meio da classe
        System.out.println("Objeto conta1 - atributo estático: "+conta2.cpmf);
        System.out.println("Objeto conta1 - atrbiuto não estático: "+conta1.saldo);
        
        System.out.println("Objeto conta acessado pela classe: "+ContasCorrentes.cpmf);
        System.out.println("Objeto conta2 - atributo não estático: "+conta2.saldo);
    }
    
}
