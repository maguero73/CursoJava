package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//VIDEO 81,82,83,84 - CALCULADORA - USO DE LAYOUTS
public class C2Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora mimarco =new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
		//es estatico y devuelve un objeto de tipo toolkit
		//es para centrar el marco segun la pantalla
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Calculadora");
		
		//setBounds(500,350,500,300);
		
		LaminaCalculadora milamina =new LaminaCalculadora();
		
		add(milamina);
				
	}
	
}


class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla =new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		milamina2=new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar=new InsertaNro();
		
		ActionListener orden=new AccionOrden();
		
	
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		
		ponerBoton("/", orden); //DIVISION
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		
		ponerBoton("*", orden); //MULTIPLICACION
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		
		ponerBoton("-", orden); //RESTA
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		
		ponerBoton("+", orden); // SUMA
		
		ponerBoton("=", orden); //IGUALACION
		
		
		add(milamina2, BorderLayout.CENTER);
		
		
		ultimaOperacion="=";
		
		
	}


private void ponerBoton(String rotulo, ActionListener oyente) {
	
	JButton boton=new JButton(rotulo);
	
	boton.addActionListener(oyente);
	
	milamina2.add(boton);
	
	
	}

private class InsertaNro implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String entrada=e.getActionCommand();
		
		if(principio) {  //si ppio es verdadero entra en el IF
			
			pantalla.setText("");
			
			principio = false;
			
		}
		
		pantalla.setText(pantalla.getText()+ entrada);
		
//*****VOY POR VIDEO 84 MINUTO 17.20hs - 17/08/2020			
		
	}
	
	
}

private class AccionOrden implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String operacion=e.getActionCommand();
		
		//System.out.println(operacion);
		
		Calcular(Double.parseDouble(pantalla.getText()));
		
		ultimaOperacion=operacion;
		
		principio=true;
	}
	
	public void Calcular(double x) {
		
		if(ultimaOperacion.equals("+")) {
			
			resultado+=x;
			
			//System.out.println(resultado);
		}
		else if(ultimaOperacion.equals("=")) {
			
			resultado=x;
		}
		
		else if(ultimaOperacion.equals("-")) {
			resultado-=x;
		}
		else if(ultimaOperacion.equals("*")) {
			resultado*=x;
		}
		else if(ultimaOperacion.equals("/")) {
			resultado/=x;
		}
		
		pantalla.setText("" + resultado);
	}
	
}

//TENER EN CUENTA QUE SI LO DECLARAMOS AQUI EN LA CLASE, EN EL CONSTRUCTOR SOLO DEBE SER

// INICIADA E INSTANCIADA, PERO NO DECLARADA DOS VECES SINO DA ERROR
private JPanel milamina2;

private JButton pantalla;

private boolean principio;

private double resultado;

private String ultimaOperacion;

}






