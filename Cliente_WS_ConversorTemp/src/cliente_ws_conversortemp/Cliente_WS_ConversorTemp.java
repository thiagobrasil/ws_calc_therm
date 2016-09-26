/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_ws_conversortemp;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author thiagobrasil
 */
public class Cliente_WS_ConversorTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu Conversor\n1 - Celcius para Fahrenheit\n2 - Fahrenheit para Celcius"));
        
        switch (escolha) {
            case 1:
                String a = JOptionPane.showInputDialog("Informe a temperatura em Celcius");
                String c2f = celsiusToFahrenheit(a);
                JOptionPane.showMessageDialog ( null, a + "° celcius equivale a " + c2f + "° fahrenheit" );
                break;
            case 2:
                String b = JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit");
                String f2c = fahrenheitToCelsius(b);
                JOptionPane.showMessageDialog ( null, b + "° fahrenheit equivale a " + f2c + "° celcius");
                break;
            default:
                JOptionPane.showMessageDialog ( null, "Opção inválida, repita a operação");
                break;
        }
    }

    private static String celsiusToFahrenheit(java.lang.String celsius) {
        com.w3schools.xml.TempConvert service = new com.w3schools.xml.TempConvert();
        com.w3schools.xml.TempConvertSoap port = service.getTempConvertSoap();
        return port.celsiusToFahrenheit(celsius);
    }

    private static String fahrenheitToCelsius(java.lang.String fahrenheit) {
        com.w3schools.xml.TempConvert service = new com.w3schools.xml.TempConvert();
        com.w3schools.xml.TempConvertSoap port = service.getTempConvertSoap();
        return port.fahrenheitToCelsius(fahrenheit);
    }
    
}
