/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiinput;

import javax.swing.JOptionPane;

/**
 *
 * @author owens
 */
public class GuiInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userInputString= JOptionPane.showInputDialog(null,"Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ userInputString+" !");
        
        String ageInput = JOptionPane.showInputDialog(null,"Enter your age");
        int age = Integer.parseInt(ageInput);
        int futureAge = age + 5;
        JOptionPane.showMessageDialog(null," I will be "+ futureAge+" in 5 years");
    }
    
}
