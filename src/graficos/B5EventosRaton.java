package graficos;

import java.awt.event.*;

import javax.swing.*;

public class B5EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton miMarco=new MarcoRaton();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Eventos Raton");
		
		setVisible(true);
		
		EventosDeRaton EventoRaton =new EventosDeRaton();
		
		addMouseListener(EventoRaton);
		//addMouseMotionListener(EventoRaton);
		

	}

}

//CLASE 72 SIN CLASE ADAPTADORA

/*

class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de pasar x encima");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de dejar de pasar x encima");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de levantar");
	}
	
	
}
*/

//CLASE 72 - CON CLASE ADAPTADORA

class EventosDeRaton extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e){
		
		System.out.println("has hecho click");
//VIDEO 73 - EVENTOS DE RATON II
		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount());
	}
}
/*	
	public void mousePressed(MouseEvent e){
		
	//	if(e.getModifiersEx()==1024){
	// SI LO HACEMOS CON VALOR	(VER API DE JAVA)
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
	//SI LO HACEMOS CON LA CONSTANTE (VER API DE JAVA)		
			System.out.println("he pulsado el boton izquierdo");
		} else if (e.getModifiersEx()==4096){
			System.out.println("he pulsado el derecho");
		} else if (e.getModifiersEx()==2048){
			System.out.println("has pulsado la rueda");
		}
	*/

//ATENCION: OTRA INTERFACE PARA CONTROLAR EL MOVIMIENTO DEL RATON
// CLASE 74
/*
class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("estas arrastrando el mouse");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("estas moviendo el mouse");
	}	

	
}
*/