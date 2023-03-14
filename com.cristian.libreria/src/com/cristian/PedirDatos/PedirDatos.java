package com.cristian.PedirDatos;


import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */

public class PedirDatos {
    public static float pedirFloat (String mensaje) {
        return (Float.parseFloat(JOptionPane.showInputDialog(mensaje)));
    }
    public static int pedirInt (String mensaje){
        return (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
    }
    public static String pedirString(String message){
        return (JOptionPane.showInputDialog(message));
    }
    public static long  pedirLong(String message){
        return (Long.parseLong(JOptionPane.showInputDialog(message)));
    }
}
