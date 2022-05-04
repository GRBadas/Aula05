package src.com.Aula05;

import javax.swing.JOptionPane;

public class GUIUsuario {
    public static double getUserDouble(String message){
        String opane = JOptionPane.showInputDialog(message);
        double deposito = Double.parseDouble(opane);
        return deposito;
    }


}
