

package atividade4;
import java.util.ArrayList; 
/**
 *
 * @author a120137
 */
public class Aeroporto {
    String prefixoAeroporto;
    String nomeAeroporto;
    ArrayList<Aviao> fila;


public Aeroporto(){

    fila = new ArrayList(   );
}
 public boolean decolar(Aviao a){
      for(Aviao aux : fila){
            if (aux.prefixo == a.prefixo){
                fila.remove(aux);
                return true;
            }
        }
        return false; 
    }

 public void aterrisar(Aviao a){
     fila.add(a);
     
}
    public void listar(){
        for (Aviao a : fila){
            System.out.println("Prefixo: " + a.prefixo);
            System.out.println("Companhia: " + a.companhia);
            System.out.println("");
        }          
    }
}

