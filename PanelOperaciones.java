/**
 * @(#)PanelOperaciones.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/27
 */
 
 import javax.swing.*;
 import java.awt.*;
 import javax.swing.JPanel;
 import java.awt.Color;
 import java.awt.event.*;


public class PanelOperaciones extends JPanel{
    //atributos
    JButton Suma, Resta, Multi, Dividir;
    
    public PanelOperaciones(MyFrame50 oyente) {
    	this.setBackground(Color.pink);
    	
    	FlowLayout X = new FlowLayout();
    	X.setHgap(20);
    	X.setVgap(30);
    	X.setAlignment(FlowLayout.CENTER);
    	setLayout(X);
    	
    	Suma    = new JButton(" + ");
    	Resta   = new JButton(" - ");
    	Multi   = new JButton(" * ");
    	Dividir = new JButton(" / ");
    	Suma.addActionListener(oyente);
    	Resta.addActionListener(oyente);
    	Multi.addActionListener(oyente);
    	Dividir.addActionListener(oyente);
    	
    	add(Suma);
    	add(Resta);
    	add(Multi);
    	add(Dividir);
    	
    }//constructor
    
    
}//class