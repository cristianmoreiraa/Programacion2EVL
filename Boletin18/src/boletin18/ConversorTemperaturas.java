
package boletin18;

/**
 *
 * @author crist
 */
public class ConversorTemperaturas{
        public final static float TEMP = 80;
        
        public float centigradosAFharenheit(float grados) throws TemperaturaErradaExcepcion{
            float fharenheit = 0;
            if(grados<TEMP){
                throw new TemperaturaErradaExcepcion("La conversión no puede ser menor a 80ºC");
            }
                return fharenheit;
        }
        
        public void centigradosAReamur(float grados) throws TemperaturaErradaExcepcion{
        if(grados<TEMP){
            throw new TemperaturaErradaExcepcion("La conversión no puede ser menor a 80ºC");
        }        
    }
}
