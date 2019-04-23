package CalculadoraSimples;

import javax.swing.*;

public class  Entrada {

        static String aux, calculo;
        static double numero1, numero2,resp;
        static int numeroEscolha;
    
    public static void main(String[] args) {
    fim();
    }
        
    public static void fim(){
        
        aux = JOptionPane.showInputDialog(null, "Insira o primeiro Número: ");
        if (aux.equals("")) {
            JOptionPane.showMessageDialog(null, "insira um numero valido ");
        }
        numero1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o segundo Número: ");
        if (aux.equals("")) {
            JOptionPane.showMessageDialog(null, "insira um numero valido ");
        }
        numero2 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Escolha uma operação \n "
                + "1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n ");

        if (aux.equals("")) {
            JOptionPane.showMessageDialog(null, "insira um numero valido ");
        }
        numeroEscolha = Integer.parseInt(aux);

        if ((numeroEscolha <= 0) || (numeroEscolha >= 5)) {
            JOptionPane.showMessageDialog(null, "insira um numero valido ");
        }
        if (numeroEscolha == 1) {
            resp = Operacoes.somaValor(numero1, numero2);
            calculo = "Soma";
        }

        if (numeroEscolha == 2) {
            resp = Operacoes.subtracaoValor(numero1, numero2);
            calculo = "Subtração";
        }

        if (numeroEscolha == 3) {
            resp = Operacoes.multiplicacaoValor(numero1, numero2);
            calculo = "Multiplicação";
        }

        if (numeroEscolha == 4) {
            resp = Operacoes.divisaoValor(numero1, numero2);
            calculo = "Divisão";

            if (numero2 == 0) {
                JOptionPane.showMessageDialog(null, "insira um numero valido ");
                return;
            }
        }
        Resposta.resultado(numero1, numero2, resp, calculo);
    }
}