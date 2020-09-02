package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class A8marcoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
MarcoVentana miMarco=new MarcoVentana();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
MarcoVentana miMarco2 =new MarcoVentana();		
		
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("miMarco");
		miMarco2.setTitle("miMarco2");
		
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
	}

}


class MarcoVentana extends JFrame{
	
	public MarcoVentana(){
		
		//setTitle("Respondiendo");
		
		//setBounds(700,300,500,300);
		
		setVisible(true);
		
		M_Ventana oyenteVentana =new M_Ventana();
		
		addWindowListener(oyenteVentana);
		
		
	}
	
}


class M_Ventana implements WindowListener{
	

public void windowActivated(WindowEvent e) {
	
	System.out.println("ventana activada");
}
	//Se invoca cuando la ventana está configurada para ser una ventana activa.
public void windowClosed(WindowEvent e) {

	System.out.println("la ventana ha sido cerrada");
	
} //UNICO QUE NO VIMOS!!

	//Se invoca cuando una ventana se ha cerrado cuando se pulsa en una forma de cierre que la misma contiene.
public void windowClosing(WindowEvent e) {
	
	System.out.println("cerrando ventana");
}
	//Se invoca cuando el usuario intenta cerrar la ventana desde un método de cierre propio de la ventana.
public void windowDeactivated(WindowEvent e) {
	
	System.out.println("ventana desactivada");
}
	//Se invoca cuando una ventana ya no está activa.
public void windowDeiconified(WindowEvent e) {
	
	System.out.println("ventana restaurada");
};
	//Se invoca cuando una ventana se cambia de un minimizado a un estado normal.
public void windowIconified(WindowEvent e) {
	
	System.out.println("Ventana Minimizada");
	
}
	//Se invoca cuando una ventana se cambia de una normal a un estado minimizado.
public void windowOpened(WindowEvent e) {
	
	System.out.println("ventana visible");
	
}
	//Se invoca la primera vez que una ventana se hace visible.



	
	
}
