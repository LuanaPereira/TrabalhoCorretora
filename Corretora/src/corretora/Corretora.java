/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretora;
//A fila é a corretora
/**
 *
 * @author CC08767674984
 */
public class Corretora {
    public static double bitcoinTotal=100; //total de bitvoin na corretora
    public static double precoBitcoin = 10; //preco ue o bitcoin vale
    public static boolean contador = false;
   
    public synchronized static double venderBitcoin(double real)throws InterruptedException{ // metodo vender (tirar bitcoin)
        if (bitcoinTotal <= 0){ // verifica se tem bitcoin para vender
           return -1;// retorna falha
        }
        System.out.println("Quantidade de Bitcoin existente (vender corretora)" + bitcoinTotal);
        double quantidadeBitcoin = real/precoBitcoin; //transforma o real para bitcoin
        bitcoinTotal -= quantidadeBitcoin; //subtrai o total que tem
      
        return quantidadeBitcoin; //retorna a quantidade de bitcoin que o investidor comprou
    }
     
    public synchronized static double comprarBitcoin(double quantidadeBitcoin)throws InterruptedException{
       double pagamento = quantidadeBitcoin*precoBitcoin; //transforma a quantidade que compramos para real, para pagar.
       bitcoinTotal += quantidadeBitcoin; //acrewscenta o que a gente comprou na quantidade que temos 
        System.out.println("Quantidade de Bitcoin existente (compra corretora) " + bitcoinTotal) ;
       return pagamento; //retorna valor do pagamento em real
        
    }
}