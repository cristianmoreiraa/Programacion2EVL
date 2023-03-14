
package boletin20;

/**
 *
 * @author crist
 */
public class Felino extends Mamifero implements IPodeNadar {

    @Override
    public void podeNadar() {
        System.out.println("Los felinos saben nadar.");
    }

    
    @Override
    public void podeCamiñar() {
        System.out.println("Además también caminan.");
    }
    
    
}
