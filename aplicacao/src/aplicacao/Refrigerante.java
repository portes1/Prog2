/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

public class Refrigerante {
    double preco;
    String nome;
    
    Refrigerante(){
        preco = 0;
        nome = "";
    }
    Refrigerante(double preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }
    
}
