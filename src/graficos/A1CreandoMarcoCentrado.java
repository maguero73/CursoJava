package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

import java.awt.Frame;

public class A1CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado miMarco=new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
		//es estatico y devuelve un objeto de tipo toolkit
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamañoPantalla=miPantalla.getScreenSize();
		
		
		int alturaPantalla=tamañoPantalla.height;
		int anchoPantalla=tamañoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Marco Centrado");
		
		//METODO GETIMAGE PARA CAMBIARLE EL ICONO A LA VENTANA
		
		
		Image miFoto =miPantalla.getImage("icono.png");
		setIconImage(miFoto);
		

		
	}
	
}