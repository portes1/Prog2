package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Portes - 120137
 * @author Thalita Yamatsuka - 120126
 */

public class Corretora {
    
    private int bitcoin;
    private double preco;
    
    public Corretora(){
        this.bitcoin = 100;
        this.preco = 10000;
    }
    
    public synchronized void comprar() throws InterruptedException
    {
        while(this.bitcoin == 0) wait();
        System.out.println("Vendendo");
        this.bitcoin--;
        this.preco += 30000;
        Thread.sleep(5000);
        notifyAll();
    }
    
    public synchronized void vender() throws InterruptedException
    {
        while(this.bitcoin == 100) wait();
        System.out.println("Comprando");
        this.bitcoin++;
        this.preco -= 30000;
        Thread.sleep(5000);
        notifyAll();
    }

    public int getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(int bitcoin) {
        this.bitcoin = bitcoin;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
