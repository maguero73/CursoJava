package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class D1PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//VIDEO 95 - Curso Java. Componentes Swing. ComboBox.
		
		MarcoCombo combo =new MarcoCombo();
		
		combo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		combo.setVisible(true);
	}

}


class MarcoCombo extends JFrame{
	
	public MarcoCombo(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Combo");
		
		LaminaCombo milamina =new LaminaCombo();
		
		add(milamina);
	
	}
}
		
class LaminaCombo extends JPanel{
	
		public LaminaCombo(){
			
			setLayout(new BorderLayout());
			
			texto=new JLabel("en algun luhat de la machabklll");
			
			texto.setFont(new Font("Serif", Font.PLAIN, 18));
			
			add(texto, BorderLayout.CENTER);
			
			JPanel lamina_norte =new JPanel();
			
			//miramos la clase JComboBox constructores
			
			micombo= new JComboBox();
			
			micombo.setEditable(true);
			
			micombo.addItem("Serif");
			
			micombo.addItem("SanSerif");
			
			micombo.addItem("Monospaced");
			
			micombo.addItem("Dialog");
			
			eventoCombo mievento =new eventoCombo();
			
			micombo.addActionListener(mievento);

//se ve el metodo getSelectedItem de la clase			
			lamina_norte.add(micombo);
			
			add(lamina_norte, BorderLayout.NORTH);
			
			 
			
		}

		private class eventoCombo implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
				
				
				
			}
			
			
		}
		
private JLabel texto;

private JComboBox micombo;
		
	}


