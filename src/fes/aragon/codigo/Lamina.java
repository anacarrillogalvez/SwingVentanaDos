/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HP_All_in_One
 */
public class Lamina extends JPanel implements ActionListener{

    private JPanel panel = new JPanel();
    private JButton boton = new JButton("Agregar");
    private JTextField cajaTexto = new JTextField(30); //Usuario escribe el texto
    private JTextArea areaTexto = new JTextArea(10, 20);
    private JScrollPane scroll;

    public Lamina() {
        
        this.scroll = new JScrollPane(this.areaTexto);
        this.boton.addActionListener(this);
        panel.add(boton);
        panel.add(cajaTexto);
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(new TitledBorder("Componentes Swing"));
        borderPanel.add(panel,BorderLayout.CENTER);
        this.add(borderPanel);
        this.add(scroll);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent arg0) {
        Object origen = arg0.getSource();
        if(origen == this.boton){
            this.areaTexto.append(this.cajaTexto.getText() + "\n");
            this.cajaTexto.setText("");
            this.boton.transferFocus();
            
        }
    }

  
}
