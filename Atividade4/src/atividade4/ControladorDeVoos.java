/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import java.util.ArrayList;

/**
 *
 * @author a120137
 */
public class ControladorDeVoos {
    
     ArrayList<Aeroporto> saida;
     ArrayList<Aeroporto> chegada;

public ControladorDeVoos(){

    saida = new ArrayList(   );
    chegada = new ArrayList(   );
}
 public void chegadaDeAviao(Aeroporto b){
     chegada.add(b);
}
 public void saidaDeAviao(Aeroporto b){
     saida.add(b);
}
}
