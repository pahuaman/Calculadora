/**
 * @(#)PanelOperandos.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/27
 */
 import javax.swing.*;
 import java.awt.*;
 import javax.swing.JPanel;
 import java.awt.Color;

public class PanelOperandos extends JPanel {
	//atributos
	JTextField operando1, operando2;
	

    public PanelOperandos() {
    	this.setBackground(Color.pink);
    	
    	FlowLayout L = new FlowLayout();
    	setLayout(L);
    	
    	L.setVgap(20);
    	
    	operando1 = new JTextField(12);
    	operando2 = new JTextField(12);
    	
    	add(new JLabel("Operando 1: "));
    	add(operando1);
    	add(new JLabel("Operando 2: "));
    	add(operando2);
    	
    }//constructor
    
    public float  getOperando1()
    {
    	/*me dueuelve el numero que hay en el JTexfiled */
    	return Float.parseFloat(operando1.getText());
    }//metodo
    
    public float  getOperando2()
    {
    	/*me dueuelve el numero que hay en el JTexfiled */
    	return Float.parseFloat(operando2.getText());
    }//metodo
    
    
}//class