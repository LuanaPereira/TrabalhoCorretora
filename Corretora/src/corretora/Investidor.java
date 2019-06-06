/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretora;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC08767674984
 */
public class Investidor extends Thread {
    public double real;
    public double bitcoinInvestidor;
    String nome;
    
    public Investidor(){
        real=1000000;
        bitcoinInvestidor=1;
    }
    @Override
    public void run(){
        int sorteio = 0;
        int bit = 1;
        while(true){
            sorteio = new Random().nextInt(2);
//            bit = new Random().nextInt(6);
//            if (bit == 0){
//                System.out.println("Morreu");
//                return ;
//            }
            //else {
                if (sorteio == 0){
                try {
                    comprar(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Investidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                    
                }else {
                try {
                    vender(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Investidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                }
            }
        }
    
    public void comprar(double dinheiro) throws InterruptedException{
        double quantidadeBitcoin = Corretora.venderBitcoin(dinheiro);
        if (quantidadeBitcoin <= 0){
            while(quantidadeBitcoin <= 0){
                Thread.sleep(1000);
                System.out.println("Não foi possivel efetuar a compra");

            }
        }
        bitcoinInvestidor += quantidadeBitcoin;
       
        System.out.println("Quantidade de " + bitcoinInvestidor + " comprados por " + nome + "  " + quantidadeBitcoin);
            
       
        
    }
    public void vender(double quantidadeBitcoin)throws InterruptedException{
        if (bitcoinInvestidor <= 0){
            System.out.println("Não foi possivel efetuar a venda" + nome);
        }
        double valorRecebido = Corretora.comprarBitcoin(quantidadeBitcoin);
        real += valorRecebido;
        bitcoinInvestidor -= quantidadeBitcoin;
        //Corretora.precoBitcoin += 1;
        System.out.println("Quantidade de " + quantidadeBitcoin + " vendidos por " + nome );
      
        
    }
    
}