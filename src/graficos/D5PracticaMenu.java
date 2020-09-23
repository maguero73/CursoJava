package graficos;

import java.awt.*;

import javax.swing.*;

public class D5PracticaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//VIDEO 101 - Componentes Swing. Procesador de textos. Práctica guiada I
		MarcoMenu2 radio =new MarcoMenu2();
		
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio.setVisible(true);
	}

}


class MarcoMenu2 extends JFrame{

	public MarcoMenu2(){

		setVisible(true);

		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);

		setTitle("Practica Guiada I");

		LaminaMenu2 milamina =new LaminaMenu2();

		add(milamina);

	}
}


class LaminaMenu2 extends JPanel{

	public LaminaMenu2(){
	
		JMenuBar mibarra=new JMenuBar();
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		JMenu fuente=new JMenu("Fuente");
		
		JMenu estilo=new JMenu("Estilo");
		
		JMenu tamaño=new JMenu("Tamaño");
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamaño);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
			
		
//------------------------------------------------------------------------
//Menu Fuente
		JMenuItem arial = new JMenuItem("Arial");
				
		JMenuItem courier = new JMenuItem("Courier");
				
		JMenuItem verdana = new JMenuItem("Verdana");

//------------------------------------------------------------------------
//Menu Estilo
				JMenuItem negrita = new JMenuItem("Negrita");
						
				JMenuItem cursiva = new JMenuItem("Cursiva");
				
//------------------------------------------------------------------------							
//Menu Tamaño
				JMenuItem tam1 = new JMenuItem("16");
						
				JMenuItem tam2 = new JMenuItem("18");
				
				JMenuItem tam3 = new JMenuItem("20");	
				
				JMenuItem tam4 = new JMenuItem("22");	
//------------------------------------------------------------------------
//add Fuente
				fuente.add(arial);
				
				fuente.add(courier);
				
				fuente.add(verdana);

//------------------------------------------------------------------------	
//add Estilo
				estilo.add(negrita);
				
				estilo.add(cursiva);

//------------------------------------------------------------------------					
//add Tamaño
				tamaño.add(tam1);
				
				tamaño.add(tam2);
				
				tamaño.add(tam3);
				
				tamaño.add(tam4);
//------------------------------------------------------------------------	
				
				
		
	}

}
