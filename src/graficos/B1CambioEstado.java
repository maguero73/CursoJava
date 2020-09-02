package graficos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class B1CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEstado miMarco=new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

//VIDEO 70 - NECESITAMOS QUE AL MAXIMIZAR NOS DIGA EL NUEVO ESTADO

class MarcoEstado extends JFrame{
	
	public MarcoEstado(){
		
		Lamina4 miLamina=new Lamina4();
		
		setBounds(300,300,500,150);
		
		setTitle("Cambio Estado");
		
		add(miLamina);
		
		setVisible(true);
		
		CambiaEstado nuevo_estado =new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
	}
}

//CREAMOS LA CLASE CAMBIAESTADO CON LA INTERFAZ

class CambiaEstado implements WindowStateListener{
		
	//OBLIGATORIAMENTE SE DEBE SOBRESCRIBIR EL METODO UTILIZANDO LA CLASE WINDOWS EVENT
		public void windowStateChanged(WindowEvent e){
			
			System.out.println("la ventana ha cambiado de estado");
			
			//CON EL METODO GETNEWSTATE NOS ESCRIBIRA EN PANTALLA EL ESTADO
			
			//System.out.println(e.getNewState());
			
			//Ahora si queres escribir algo en pantalla cuando se ejecuta la accion de maximizar
			
			//if(e.getNewState()==6){ //o tambien con la constante
			if(e.getNewState()==Frame.MAXIMIZED_BOTH){
				
				System.out.println("la ventana esta a pantalla completa");
					}else if (e.getNewState()==Frame.NORMAL){
						System.out.println("la pantalla esta normal");
					}else if (e.getNewState()==Frame.ICONIFIED);{
						System.out.println("la ventana esta minimizada");
					}
			
		
			
			
		}
	
	}


class Lamina4 extends JPanel{
	
	protected void paintComponent(Graphics g){  //SETTER DE API
		
		super.paintComponent(g);
		
		
	}
}	
