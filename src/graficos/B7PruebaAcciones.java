package graficos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class B7PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAccion marco=new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
	}

}


class MarcoAccion extends JFrame{
	
	public MarcoAccion(){
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Prueba Acciones");
		
		setBounds(600,350,600,300);
		
		PanelAccion lamina=new PanelAccion();
		
		add(lamina);
				
		
	}
}

//FINAL DE LA CLASE 77 - SE CREAN 3 INSTANCIAS DE LA CLASE ACCIONCOLOR

class PanelAccion extends JPanel{
	
	public PanelAccion(){
		
		//ImageIcon imgIcon1 = new ImageIcon("src/graficos/rojo.png");
       // Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH);
      //  Icon iconoEscalado1 = new ImageIcon(imgEscalada1);
        
        //ImageIcon imgIcon2 = new ImageIcon("src/graficos/otro.ico");
       // Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH);
       // Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        
       // ImageIcon imgIcon3 = new ImageIcon("src/graficos/rosa.png");
      //  Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
       // Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        
		//AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("srt/graficos/linux.png"), Color.blue);
		//AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("srt/graficos/rojo.ico"), Color.red);
		//AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("srt/graficos/rosa.png"), Color.yellow);
        
        AccionColor accionAmarillo=new AccionColor("Amarillo",Color.YELLOW);
        AccionColor accionAzul=new AccionColor("Azul",Color.BLUE);
        AccionColor accionRosa=new AccionColor("Rosa",Color.PINK);
       
		
		add(new JButton(accionAzul));
		add(new JButton(accionRosa));
		add(new JButton(accionAmarillo));
		
		
		/*
		JButton botonAzul =new JButton("Azul");
		
		JButton botonRojo =new JButton("Rojo");
		
		JButton botonAmarillo =new JButton("Amarillo");
		
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		*/
		
		
//---------------------VIDEO 79 - MULTIPLES FUENTES----------------------------------------------------------------		
//------------------------------------------------------------------------
		
		
		//PRIMER PASO: 1) CREAR MAPA DE ENTRADA
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//SEGUNDO PASO: 2) CREAR COMBINACION DE TECLAS
		
		//KeyStroke teclaAzul= KeyStroke.getKeyStroke("ctrl A");
		//KeyStroke teclaRosa= KeyStroke.getKeyStroke("ctrl R");
		//KeyStroke teclaAmarilla= KeyStroke.getKeyStroke("ctrl M");
		
		//otra manera:
		
		
		//TERCER PASO: 3) ASIGNAR COMBINACION DE TECLAS A OBJETO (LO INVENTO)
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAzul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRosa");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl M"), "fondoAmarillo");
		//mapaEntrada.put(teclaAzul,"fondoAzul");
		//mapaEntrada.put(teclaRosa,"fondoRosa");
		//mapaEntrada.put(teclaAmarilla,"fondoAmarillo");
		
		//CUARTO PASO: 4) ASIGNAR OBJETO A LA ACCION
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondoAzul", accionAzul);
		mapaAccion.put("fondoRosa", accionRosa);
		mapaAccion.put("fondoAmarillo", accionAmarillo);
			
	}
	
//VIDEO 77 - MULTIPLES FUENTES II - PUTVALUE Y GETVALUE
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Color color_boton){
			
			putValue(Action.NAME, nombre);
			
			//putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			
			putValue("color_de_fondo", color_boton);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color)getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + "; Descripcion: " + getValue(Action.SHORT_DESCRIPTION) );
			
		}
		
		
	}
}


