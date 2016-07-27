/**
 * @(#)PanelResultados.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/27
 */

 import javax.swing.*;
 import java.awt.*;
 import javax.swing.JPanel;
 import java.awt.Color;

public class PanelResultados extends JPanel{
	//atributos
	JLabel Resultado;

    public PanelResultados() {
    	this.setBackground(Color.pink);
    	FlowLayout N = new FlowLayout();
    	N.setAlignment(FlowLayout.CENTER);
    	N.setVgap(20);
    	
    	setLayout(N);
    	Resultado = new JLabel("00");
    	
    	add(new JLabel("Resultado: "));
    	add(Resultado);
    }//constructor
    
    public void setResultado(float numero)
    {
    	String texto = Float.toString(numero);
    	Resultado.setText(texto);
    	
    }//metodo
    
}//class