package graficos;


import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;


// VIDEO 88, 89  - Componentes Swing. Eventos en cuadros de texto I, II 
public class C4EventoTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoE mimarco=new MarcoE();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class MarcoE extends JFrame{
	
	public MarcoE(){
		
		//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
		//es estatico y devuelve un objeto de tipo toolkit
		//es para centrar el marco segun la pantalla
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		//Se debe comentar el setBounds para que funcione
		//setBounds(600,300,600,350);
		
		setTitle("Eventos en Cuadros de Texto");
		
		LaminaTe milam =new LaminaTe();
		
		add(milam);
		
		setVisible(true);
	
		
	}

class LaminaTe extends JPanel{
	
	public LaminaTe(){
		
		JTextField micampo =new JTextField(20);
		
		EscuchaTexto esc =new EscuchaTexto();
		
		
		//ACA ES DONDE TENEMOS QUE CREAR LA INTERFACE DOCUMENT
		//AQUI MIDOC ES DE TIPO DOCUMENT Y SE IGUALA A EL CUADRO DE TEXTO
		//TRAYENDOSE EL TEXTO CON EL METODO GETDOCUMENT
		
		//Document midoc = micampo.getDocument();
		
		//midoc.addDocumentListener(esc);
		//con esta linea te ahorras las 2 primeras
		micampo.getDocument().addDocumentListener(esc);
		
		add(micampo);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}
		
		
	}
}


}