
package boletin20;

/**
 *
 * @author crist
 */
public class Morcego extends Mamifero implements IPodeCamiñar, IPodeVolar{

    @Override
    public void camiñar() {
        System.out.println("O morcego sabe camiñar.");
    }

    @Override
    public void podeVolar() {
        System.out.println("Tamén sabe voar.");
    }
    
}
