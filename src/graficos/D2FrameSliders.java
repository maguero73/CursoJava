package graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class D2FrameSliders {
//VIDEO 96 CONTROL DESLIZANTE I
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoSlider deslizante =new MarcoSlider();
		
		deslizante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		deslizante.setVisible(true);
	}

}


class MarcoSlider extends JFrame{
	
	public MarcoSlider(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Control Deslizante");
		
		LaminaSlider milamina =new LaminaSlider();
		
		add(milamina);
	
	}
}
		
class LaminaSlider extends JPanel{
	
		public LaminaSlider(){
		//PASO 1 ESTABLECER BORDERLAYOUT
			setLayout (new BorderLayout());
		//PASO 2 CREAMOS EL LABEL ROTULO	
			rotulo = new JLabel("En algun lugar de la mancha...");
		//PASO 3 AGREGAMOS EL ROTULO A LA LAMINA EN EL CENTRO
			add(rotulo, BorderLayout.CENTER);
			
			JPanel lamina_n =new JPanel();
			
		//PASO 4 CREAMOS EL CONTROL DESLIZANTE
			control = new JSlider(0,40,10);
			//VER DIFERENTES CONSTRUCTORES EN LA API DE JAVA
			
			control.setPaintTicks(true);
			
			control.setPaintLabels(true);
			
			control.setMajorTickSpacing(40);
			
			control.setMinorTickSpacing(5);
			
		//PASO 5 AGREGAMOS A LA LAMINA NORTE EL CONTROL DESLIZANTE
			
			lamina_n.add(control);
		//PASO 6 AGREGAR LA LAMINA NORTE A LA LAMINA PPAL	
			add(lamina_n, BorderLayout.NORTH);
			
			//EventoSlider evento1 =new EventoSlider();
			
			//control.addChangeListener(evento1);
			
//----------------------------------------------------------------------------			
			
		//VIDEO 97 - COMO PONER A LA ESCUCHA EL DESLIZANTE
			
			
			
			control.addChangeListener(new EventoSlider());
			
			
			
			
			
			
	}

		private class EventoSlider implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
				//contador++;
				
				//System.out.println(contador);
	//CONFIGURAR QUE AL DESLIZAR AUMENTE EL TAMAÑO DE LA FUENTE DEL ROTULO			
		rotulo.setFont(new Font ("Serif", Font.PLAIN, control.getValue())); 		
				
			}
			
			
		}
		
	private JSlider control;
	
	private JLabel rotulo;
	
	private int contador;
}


