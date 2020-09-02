package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class B2EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTeclas miMarco=new MarcoConTeclas();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas(){
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		setTitle("Eventos Teclado");
		
		EventosDeTeclado tecla =new EventosDeTeclado();
		
		addKeyListener(tecla);
		
	}
	

}

//VIDEO 71 - EVENTOS DE TECLADO

class EventosDeTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//PRESIONAMOS TECLAS Y EL PROGRAMA NOS TRAE DE LA API LOS CODIGOS
	//	int codigo = e.getKeyCode();
	//	System.out.println(codigo);
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		   //PRESIONAMOS TECLAS Y EL PROGRAMA NOS DEVUELVE LAS LETRAS
		char letra= e.getKeyChar();
		System.out.println(letra);
	
	}
}