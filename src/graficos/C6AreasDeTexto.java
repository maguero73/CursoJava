package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C6AreasDeTexto {

	//VIDEO 90 - AREAS DE TEXTO
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoArea mimarco =new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea(){
		
		//setBounds(600,300,600,350);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Area de Texto");
		
		LaminaArea milamina =new LaminaArea();
		
		add(milamina);
	
		
	}

class LaminaArea extends JPanel{
	
	public LaminaArea(){
		
		miarea =new JTextArea(8,20);
		
		
	// EN ESTE PASO NECESITAMOS CREAR UNA NUEVA LAMINA, EN ESTE CASO
	// ESTE TIPO DE LAMINAS CON SCROLL SE LLAMAN JSCROLLPANE
		
		JScrollPane LaminaScroll =new JScrollPane(miarea);
		
	//AL ESTAR ESTA LINEA DESHABILITA EL SCROLL EN HORIZONTAL
	//SI LA COMENTAMOS VAMOS A TENER SCROLL TANTO VERT. COMO HORIZ.
		
		
	//	miarea.setLineWrap(true);
		
		add(LaminaScroll);
		
		JButton miboton =new JButton("Dale");
		
		miboton.addActionListener(new GestionArea());
		
		add(miboton);
		
	}
	
	private class GestionArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(miarea.getText());
			
		}
		
		
	}
	
	private JTextArea miarea;
		
	}
}