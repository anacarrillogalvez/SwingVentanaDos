/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author HP_All_in_One
 */
public class Marco extends JFrame{

    public Marco() throws HeadlessException {
        
        this.setSize(600, 300);
        this.setLocationRelativeTo(this);
        this.setTitle("Fuente de eventos");
        this.setResizable(false);
        Lamina lamina = new Lamina();
        add(lamina);
        
    }
   
    
    
}
