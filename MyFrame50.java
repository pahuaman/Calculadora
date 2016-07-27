/**
 * @(#)MyFrame50.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/27
 */
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 

public class MyFrame50 extends JFrame implements ActionListener{
	//atributos
	PanelOperandos   paneloperandos;
	PanelOperaciones paneloperaciones;
	PanelResultados  panelresultados;
   
    public MyFrame50() {
    	super("Calculadora");
    	setBounds(200,200,300,300);
    	setVisible(true);
    	setResizable(false);
    	
    	Container contentpane = getContentPane();
    	contentpane.setLayout(new GridLayout(3,1));
    	
    	paneloperandos   = new PanelOperandos();
    	paneloperaciones = new PanelOperaciones(this);
    	panelresultados  = new PanelResultados();
    	
    	contentpane.add(paneloperandos);
    	contentpane.add(paneloperaciones);
    	contentpane.add(panelresultados);
    	
    	paint(getGraphics());
    }//constructor
    
    public void actionPerformed (ActionEvent e)
    {
    	float operando1 = paneloperandos.getOperando1();
    	float operando2 = paneloperandos.getOperando2();
    	float Resultados;
    	
    	if(e.getSource() == paneloperaciones.Suma)
    	{
    		Resultados = operando1+operando2;
    		panelresultados.setResultado(Resultados);	
    	}//if suma
    	
    	if(e.getSource() == paneloperaciones.Resta)
    	{
    		Resultados = operando1-operando2;
    		panelresultados.setResultado(Resultados);	
    	}//if resta
    	
    	if(e.getSource() == paneloperaciones.Multi)
    	{
    		Resultados = operando1*operando2;
    		panelresultados.setResultado(Resultados);	
    	}//if multi
    	
    	if(e.getSource() == paneloperaciones.Dividir)
    	{
    		Resultados = operando1/operando2;
    		panelresultados.setResultado(Resultados);	
    	}//if dividir
    	
    }//accion en boton
    
    public static void main(String[] args) {
       MyFrame50 Vantana = new MyFrame50();
       
    }//main
}//class
