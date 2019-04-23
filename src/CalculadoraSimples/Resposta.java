package CalculadoraSimples;

import javax.swing.*;
        
public class Resposta {
    public static void resultado(double numero1, double numero2, double resp, String calculo){
        JOptionPane.showMessageDialog(null, "A " +calculo+ " de " +numero1+ " e " +numero2+ " é: "+resp);
        
    }
    
}