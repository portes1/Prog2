/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoparalela;

/**
 *
 * @author CC44631206837
 */
public class ProgramacaoParalela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robozinho robo = new Robozinho(3, 2);
        robo.processar();
        System.out.println("Movimentos: " + robo.movimentos);

    }

}
