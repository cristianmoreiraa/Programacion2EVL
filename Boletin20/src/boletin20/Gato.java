
package boletin20;

/**
 *
 * @author crist
 */
public class Gato extends Mamifero implements IPodeNadar {

    @Override
    public void podeNadar() {
        System.out.println("Además también puede nadar.");
    }

    
    public void podeCamiñar() { 
        System.out.println("El gato puede caminar.");
    }
    
    
}
