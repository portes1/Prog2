package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Portes - 120137
 * @author Thalita Yamatsuka - 120126
 */

public class Cliente extends Thread {
    private String nome;
    private double dinheiro;
    private int bitcoin;
    private Corretora corretora;
    
    public Cliente(String nome, Corretora corretora)
    {
        this.nome = nome;
        this.dinheiro = 1000000;
        this.bitcoin = 0;
        this.corretora = corretora;
    }
    
    public void comprar() throws InterruptedException
    {
        System.out.println( this.nome + " comprando ");
        this.corretora.comprar();
        this.dinheiro -= corretora.getPreco();
        this.bitcoin++;
        corretora.setPreco(corretora.getPreco() + 30000f);
        System.out.println(this.nome + " possui " + this.bitcoin + " em bitcoins");
        System.out.println(this.nome + " possui " + this.dinheiro + " em reais");
    }
    
    public void vender() throws InterruptedException
    {
        System.out.println(this.nome + " vendendo ");
        this.corretora.vender();
        this.dinheiro += corretora.getPreco();
        this.bitcoin--;
        corretora.setPreco(corretora.getPreco() - 30000f);
        System.out.println( this.nome + " possui " + this.bitcoin + " em bitcoins");
        System.out.println( this.nome + " possui " + this.dinheiro + " em reais");
    }
    
    public void regraNegocio() throws InterruptedException
    {
        if(this.bitcoin == 0)
        {
            this.comprar();
        }else if(this.dinheiro >= this.corretora.getPreco())
        {
            this.comprar();
        }else if(this.corretora.getBitcoin() == 0)
        {
            this.vender();
        }else if(this.dinheiro < this.corretora.getPreco() && this.bitcoin > 0)
        {
            this.vender();
        }
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try {
                this.regraNegocio();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(int bitcoin) {
        this.bitcoin = bitcoin;
    }
}
