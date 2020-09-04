package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C9Ejemplo_radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VIDEO 94 - RADIO BUTTONS II		
		MarcoRadio2 radio =new MarcoRadio2();
		
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio.setVisible(true);
	}

}


class MarcoRadio2 extends JFrame{
	
	public MarcoRadio2(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Button Radio II");
		
		LaminaRadio2 milamina =new LaminaRadio2();
		
		add(milamina);
	
	}
}


class LaminaRadio2 extends JPanel{
	
	public LaminaRadio2(){
		
		
		
	}
	
	
	
}	