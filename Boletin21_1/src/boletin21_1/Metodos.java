/**
 
 * Crea un array llamado "numeros" de tamaño 6, números aleatorios de rango 1-50
 * Visualizamos el array al ravés (1er elemento aparece de último)
 
 */    
package boletin21_1;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class Metodos {
    
    public int [] numeros(){
        int[] numeros = new int[6];
            for(int i=0;i<numeros.length;i++){
                numeros[i] = (int) (Math.random()*50+1);
                System.out.println(numeros[i]);
            }
        return numeros;
    } 
    
    public void ordenarNumeros(int[] numeros){
        Arrays.sort(numeros);
        System.out.println("****** Array Ordenado ******"); //no es ordenado de mayor a menor sino al revés
        System.out.println(Arrays.toString(numeros));
    }
}
