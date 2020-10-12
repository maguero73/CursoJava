package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.*;

import javax.swing.JFrame;

public class A9eventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

MarcoVentana3 miMarco=new MarcoVentana3();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
MarcoVentana3 miMarco2 =new MarcoVentana3();		
		
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("miMarco");
		miMarco2.setTitle("miMarco2");
		
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
	}

}


class MarcoVentana3 extends JFrame{
	
	public MarcoVentana3(){
		
		//setTitle("Respondiendo");
		
		//setBounds(700,300,500,300);
		
		setVisible(true);
		
		//VIDE 69 - SE PUEDE SIMPLIFICAR AUN MAS EL CODIGO
		//M_Ventana1 oyenteVentana =new M_Ventana1();
		
		//addWindowListener(oyenteVentana);
		
		addWindowListener(new M_Ventana1());
		
		
	}
	
}

//VIDEO 69 - UTILIZAR CLASE ADAPTADORA

class M_Ventana1 extends WindowAdapter{
	
//class M_Ventana1 implements WindowListener{

	//Se invoca cuando una ventana se cambia de un minimizado a un estado normal.
public void windowIconified(WindowEvent e) {
	
	System.out.println("Ventana Minimizada");
	
}




	
	
}
