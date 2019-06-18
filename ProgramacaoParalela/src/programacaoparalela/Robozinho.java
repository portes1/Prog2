/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoparalela;

import java.util.concurrent.RecursiveAction;
//import java.util.concurrent.RecursiveTask;

/**
 *
 * @author CC44631206837
 */
public class Robozinho extends RecursiveAction {

    int movimentos;
    int n;
    int m;

    public Robozinho() {
        this.n = 0;
        this.m = 0;
        movimentos = 0;
    }

    public Robozinho(int n, int m) {
        this.n = n;
        this.m = m;
        movimentos = 0;
    }

    public int processar() {

        n = baixo(n);
        m = esquerda(m);
        //System.out.println("Movimentos: " + movimentos);
        return 0;
    }

    public int baixo(int n) {
        System.out.println("caminho em N: " + n);
        movimentos = movimentos + 1;
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return (baixo(n - 1));
        }

        return 0;
    }

    public int esquerda(int m) {
        movimentos = movimentos + 1;
        System.out.println("caminho em M: " + m);
        if (m == 0) {
            return 0;
        }
        if (m > 0) {
            return (esquerda(m - 1));
        }

        return 0;
    }

    @Override
    protected void compute() {

    }

}

/*  
   n = baixo(n);
        m = esquerda(m);
     System.out.println("Movimentos: " + movimentos);
        return 0;

System.out.println("Movimentos: " + movimentos);
            //if (n==0 || m == 0) return 1;
           // System.out.println("caminhos" + n + "/"+ m);
           movimentos = movimentos + 1;
           
            if( n > 0){
            processar(n-1, m);
            
            }
            if( m > 0){
            processar(n, m-1);
            
            }
            return 1;



if (arquivo2 == null){
            processar(arquivo1);
        }
       Robozinho b1 = new Robozinho(arquivo1, null, termoBusca);
       Robozinho b2 = new Robozinho(arquivo2, null, termoBusca);
       b1.fork();
       b2.fork();
       b1.join();
       b2.join();*/



/* 
        public int baixo(int n){
              System.out.println("caminho em N: " + n );
               movimentos = movimentos + 1;
            if(n == 0) return 0;
            if(n > 0) return (baixo(n-1));
             
            return 0;
        }
         public int esquerda(int m){
              movimentos = movimentos + 1;
             System.out.println("caminho em M: " + m );
             if(m == 0) return 0;
            if(m > 0) return (esquerda(m-1));
        
       return 0;
        }*/
