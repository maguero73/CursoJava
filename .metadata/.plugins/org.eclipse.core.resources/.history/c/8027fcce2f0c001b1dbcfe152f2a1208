package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class D6PracticaMenuVideo106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//VIDEO 101 - Componentes Swing. Procesador de textos. Práctica guiada I
		MarcoMenu3 radio =new MarcoMenu3();
		
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio.setVisible(true);
	}

}


class MarcoMenu3 extends JFrame{

	public MarcoMenu3(){

		setVisible(true);

		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);

		setTitle("Practica Guiada I");

		LaminaMenu3 milamina =new LaminaMenu3();

		add(milamina);

	}
}


class LaminaMenu3 extends JPanel{

	public LaminaMenu3(){
	
		JMenuBar mibarra=new JMenuBar();
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		
		fuente=new JMenu("Fuente");
		
		estilo=new JMenu("Estilo");
		
		tamagno=new JMenu("Tamaño");
		
//Vídeo 103	- Creación de procesador de textos Práctica guiada III.
		
		configura_menu("Arial", "Fuente", "Arial",9,10);		
		configura_menu("Courier", "Fuente", "Courier",9,10);
		configura_menu("Serif", "Fuente", "Serif",9,10);
		//------------------------------------------
		
		//configura_menu("Normal", "Estilo", "",Font.PLAIN,1);
		configura_menu("Negrita", "Estilo", "",Font.BOLD,1);		
		configura_menu("Cursiva", "Estilo", "",Font.ITALIC,1);
		
		//--------------------------------------------
		
		configura_menu("16", "Tamaño", "",9,16);
		configura_menu("18", "Tamaño", "",9,18);
		configura_menu("20", "Tamaño", "",9,20);
		configura_menu("22", "Tamaño", "",9,22);
		

		
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
//Vídeo 102		
//Creación de procesador de textos. Práctica guiada II.
		
		miarea =new JTextPane();
		
		add(miarea, BorderLayout.CENTER);

//Vídeo 103 - Creación de procesador de textos Práctica guiada III.
//comentamos las siguientes lineas:	borramos o comentamos todos los JMenuItem
	
		
	
		
//------------------------------------------------------------------------
//Menu Fuente
/*		JMenuItem arial = new JMenuItem("Arial");
		
		arial.addActionListener(new ActionListener(){ //ABRO CLASE INTERNA ANONIMA
			//Pegamos todos los metodos internos de la clase:
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					miarea.setFont(new Font("Arial", Font.PLAIN, 12));								
				}			
						}); //CIERRO CLASE INTERNA ANONIMA	

		
//--------------------------------------------------------------------------------

				
		JMenuItem courier = new JMenuItem("Courier");
		
		//Gestiona_menus tipo_letra =new Gestiona_menus();
		//1) o lo que es lo mismo comentar linea anterior e instanciamos dentro:
		
		//courier.addActionListener(new Gestiona_menus());	
		//2) o lo que es lo mismo comentar linea anterior y aplicar clase
		//interna anonima
		//3) y borramos la clase ActionListener mas abajo:
		
		
	/* courier.addActionListener(new ActionListener(){ //ABRO CLASE INTERNA ANONIMA
		//Pegamos todos los metodos internos de la clase:
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont(new Font("Courier", Font.PLAIN, 12));								
			}			
					}); //CIERRO CLASE INTERNA ANONIMA	*/
		
		//O ASI EN UNA LINEA DE CODIGO 
		/*
courier.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent evento){miarea.setFont(new Font("Courier",Font.PLAIN,12));}}); 

	*/
//--------------------------------------------------------------------------------
	
	
/*	
	
		JMenuItem serif = new JMenuItem("Serif");
		
		serif.addActionListener(new ActionListener(){ //ABRO CLASE INTERNA ANONIMA
			//Pegamos todos los metodos internos de la clase:
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					miarea.setFont(new Font("Serif", Font.PLAIN, 12));								
				}			
						}); //CIERRO CLASE INTERNA ANONIMA	

		
		
//------------------------------------------------------------------------
//Menu Estilo

				JMenuItem normal = new JMenuItem("Normal");
				
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
				
				fuente.add(serif);

//------------------------------------------------------------------------	
//add Estilo
				estilo.add(normal);
				
				estilo.add(negrita);
				
				estilo.add(cursiva);
				
				

//------------------------------------------------------------------------					
//add Tamaño
				tamaño.add(tam1);
				
				tamaño.add(tam2);
				
				tamaño.add(tam3);
				
				tamaño.add(tam4);
//------------------------------------------------------------------------
				
	*/			
				
	}
//Vídeo 103	- Creación de procesador de textos Práctica guiada III.
	public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam){
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if (menu=="Fuente"){
			fuente.add(elem_menu);
// Vídeo 106 - 	Creación de procesador de textos Práctica guiada VI.
			
// VEMOS UNA NUEVA CLASE LLAMADA StyledEditorKit vemos en la API			
			if (tipo_letra=="Arial"){
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			}else if (tipo_letra=="Courier"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
				
			}else if (tipo_letra=="Serif"){
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Serif"));
			}
			
			
		}else if (menu=="Estilo"){
			
			estilo.add(elem_menu);
			
			if(estilos==Font.BOLD){
			
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			
			}else if (estilos==Font.ITALIC){
			
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());	
			}
			
		}else if (menu=="Tamaño"){
			
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
			
			
		}
		

	}
// Vídeo 106 - 	Creación de procesador de textos Práctica guiada VI.
	
// VEMOS UNA NUEVA CLASE LLAMADA StyledEditorKit vemos en la API
	
	//Se borro toda la clase interna
			

		
		

	
	JTextPane miarea;
	
	JMenu fuente, estilo, tamagno;
	
	Font letras;
}
