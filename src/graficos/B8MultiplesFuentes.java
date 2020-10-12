package graficos;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class B8MultiplesFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFormulario mima =new MarcoFormulario();
		
		mima.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mima.setVisible(true);
		
		
	}

}


class MarcoFormulario extends JFrame{
	
	public MarcoFormulario(){
		
		setSize(900,500);
		
		setLocation(400,200);
		
		setTitle("Prueba Mariano");
		
		setBounds(600,350,600,300);
		
		PanelMultiple milan =new PanelMultiple();
		
		add(milan);
		
	}
}


class PanelMultiple extends JPanel {
	
	public PanelMultiple(){
		
		
		MultipleAccion accionAmarillo=new MultipleAccion("Amarillo", Color.YELLOW);
		MultipleAccion accionAzul=new MultipleAccion("Azul",Color.BLUE);
		MultipleAccion accionRosa=new MultipleAccion("Rosa",Color.PINK);
		

		add(new JButton(accionAzul));
		add(new JButton(accionRosa));
		add(new JButton(accionAmarillo));
		
//Pasos para crear una fuente adicional con combinacion de teclas
// PASO 1) CREACION DE UN MAPA DE ENTRADA
		
InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

// PASO 2) CREAR COMBINACION DE TECLAS

KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl A");
KeyStroke teclaRosa=KeyStroke.getKeyStroke("ctrl R");
KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl M");

// PASO 3) ASIGNAR COMBINACION DE TECLAS

mapaEntrada.put(teclaAzul, "fondo_azul");
mapaEntrada.put(teclaRosa, "fondo_rosa");
mapaEntrada.put(teclaAmarillo, "fondo_amarillo");

// PASO 4) ASIGNAR EL OBJETO A LA ACCION

ActionMap mapaAccion=getActionMap();

mapaAccion.put("fondo_azul", accionAzul);
mapaAccion.put("fondo_rosa", accionRosa);
mapaAccion.put("fondo_amarillo", accionAmarillo);

		
		
		
		
		}
	
	class MultipleAccion extends AbstractAction{

		public MultipleAccion(String nombre, Color color_fondo){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			
			putValue("color_de_fondo", color_fondo);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + "; Descripcion: " + getValue(Action.SHORT_DESCRIPTION) );
			
		}
		
		
		
		
	}
}


