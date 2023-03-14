
package boletin20;

/**
 *
 * @author crist
 */
public class Papagaio implements IPodeCaminhar, IPodeVolar, IPodeNadar{

    @Override
    public void podeCamiñar() {
        System.out.println("Un papagaio puede caminar.");
    }

    @Override
    public void podeVolar() {
        System.out.println("Pero no puede volar");
    }

    @Override
    public void podeNadar() {
        System.out.println("Un papagaio no puede nadar.");
    }
    
}
