    
package threads;

/**
 *
 * @author Pedro Portes - 120137
 * @author Thalita Yamatsuka - 120126
 */

public class Threads {

    
    public static void main(String[] args) {
       Corretora corretora = new Corretora();
       Cliente c1 = new Cliente("Difunto", corretora);
       Cliente c2 = new Cliente("Sushi", corretora);
       
       c1.start();
       c2.start();
    } 
}
    

