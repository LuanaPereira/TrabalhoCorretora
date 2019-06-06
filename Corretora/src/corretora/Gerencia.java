/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretora;

/**
 *
 * @author CC08767674984
 */
public class Gerencia {
     public static void main(String[] args) throws InterruptedException {
       
        Investidor investidor1 = new Investidor();
        investidor1.nome = "Batata";
        Investidor investidor2 = new Investidor();
        investidor2.nome = "Repolho";
        
        investidor1.start();
        investidor2.start();
         
       
        
        //investidor1.comprarReal(1, Corretora.precoBitcoin);
        //investidor2.comprarReal(1, Corretora.precoBitcoin);
        
        //Produtor produtor1 = new Produtor(buffer);
       // Consumidor consumidor1 = new Consumidor(buffer);
        //produtor1.start();
       // consumidor1.start();
      
    }
}
