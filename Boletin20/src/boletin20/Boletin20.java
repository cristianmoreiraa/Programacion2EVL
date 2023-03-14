
package boletin20;

/**
 *
 * @author crist
 */
public class Boletin20 {

    
    public static void main(String[] args) {
        
        Mamifero objM = new Mamifero();
            objM.podeCamiñar();
                    
            System.out.println("***************");
            
        Gato objG = new Gato();
            objG.podeCamiñar();
            objG.podeNadar();
            
            System.out.println("***************");
            
        Papagaio objP = new Papagaio();
            objP.podeCamiñar();
            objP.podeVolar();
            objP.podeNadar();
            
            System.out.println("***************");
            
        Avestruz objA = new Avestruz();
            objA.podeCamiñar();
            
            System.out.println("***************");
            
        Morcego objMor = new Morcego();
            objMor.camiñar();
            objMor.podeVolar();
            
            
            System.out.println("***************");
            
        Felino objF = new Felino();
            objF.podeCamiñar();
            objF.podeNadar();
            
        
    }
    
}
