
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Boletin18 {

    
    public static void main(String[] args) {
        ConversorTemperaturas obx =  new ConversorTemperaturas();       //objeto para el conversor de temperaturas
        
        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Teclea los grados que quiere pasar a Fhareneheit."));         //conversión a Fharenheit 
        
        try{
            obx.centigradosAFharenheit(centigrados);
            float fharenheit = 9.0f/5.0f*centigrados+32.4f;
            JOptionPane.showMessageDialog(null, centigrados+" ºC son "+fharenheit+"º Fharenheit");
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        
        
        //objeto para pasar a reamur
        
        centigrados = Float.parseFloat(JOptionPane.showInputDialog("Teclea los grados que quiere pasar a Reamur"));
        
        try{
            obx.centigradosAReamur(centigrados);
            float reamur = 4f/5f*centigrados;
            JOptionPane.showMessageDialog(null, centigrados+ " ºC son " +reamur+ "º Reamur");
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("**Finalizamos el programa :)**");
        
        
    }
}
