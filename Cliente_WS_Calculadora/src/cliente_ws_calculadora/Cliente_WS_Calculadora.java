/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_ws_calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author thiagobrasil
 */
public class Cliente_WS_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Calculadora Passo 1\n\nInforme o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Calculadora Passo 2\n\nInforme o valor de B"));
        
        int soma = somar(a, b);
        int sub = subtrair(a, b);
        int mult = multiplicar(a, b);
        float div = dividir(a, b);
          
        JOptionPane.showMessageDialog ( null, " Soma: " + soma + "\n Subtração: " + sub + "\n Multiplicação: " + mult + "\n Divisão: " + div); 
    }
    
    
//  Web services que serão consumidos 
    private static float dividir(float a, float b) {
        org.me.calculadora.WSCalcular_Service service = new org.me.calculadora.WSCalcular_Service();
        org.me.calculadora.WSCalcular port = service.getWSCalcularPort();
        return port.dividir(a, b);
    }

    private static int multiplicar(int a, int b) {
        org.me.calculadora.WSCalcular_Service service = new org.me.calculadora.WSCalcular_Service();
        org.me.calculadora.WSCalcular port = service.getWSCalcularPort();
        return port.multiplicar(a, b);
    }

    private static int somar(int a, int b) {
        org.me.calculadora.WSCalcular_Service service = new org.me.calculadora.WSCalcular_Service();
        org.me.calculadora.WSCalcular port = service.getWSCalcularPort();
        return port.somar(a, b);
    }

    private static int subtrair(int a, int b) {
        org.me.calculadora.WSCalcular_Service service = new org.me.calculadora.WSCalcular_Service();
        org.me.calculadora.WSCalcular port = service.getWSCalcularPort();
        return port.subtrair(a, b);
    }
    
}
