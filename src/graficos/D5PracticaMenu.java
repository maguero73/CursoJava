package graficos;

import java.awt.*;
import java.awt.event.*;

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
		
		fuente=new JMenu("Fuente");
		
		estilo=new JMenu("Estilo");
		
		tamagno=new JMenu("Tamaño");
		
//Vídeo 103	- Creación de procesador de textos Práctica guiada III.
		
		configura_menu("Arial", "Fuente", "Arial",9,10);		
		configura_menu("Courier", "Fuente", "Courier",9,10);
		configura_menu("Serif", "Fuente", "Serif",9,10);
		//------------------------------------------
		
		configura_menu("Normal", "Estilo", "",Font.PLAIN,1);
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
		}else if (menu=="Estilo"){
			
			estilo.add(elem_menu);
		}else if (menu=="Tamaño"){
			
			tamagno.add(elem_menu);
			
		}
		
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));
	}
// Vídeo 104 - 	Creación de procesador de textos Práctica guiada IV.
	
	private class Gestiona_Eventos implements ActionListener{

		String tipo_texto, menu;
		
		int estilo_letra, tamagno_letra;
		
		Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
			
			tipo_texto=texto2;
			
			estilo_letra=estilo2;
			
			tamagno_letra=tam_letra;
			
			menu=elemento;
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras=miarea.getFont(); 
			
			if (menu=="Arial" || menu=="Courier" || menu=="Serif"){
				
				estilo_letra=letras.getStyle();
				
				tamagno_letra=letras.getSize();
			}else if (menu=="Cursiva" || menu=="Negrita" || menu=="Normal"){
				tipo_texto=letras.getFontName();
				
				tamagno_letra=letras.getSize();
				
			}else if (menu=="16"||menu=="18"||menu=="20"||menu=="22"){
				
				estilo_letra=letras.getStyle();
				
				tipo_texto= letras.getFontName();
				
				
			}
			
			miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));
			//Terminado Video 105
			System.out.println("Tipo: " + tipo_texto + " Estilo: " + estilo_letra + " Tamaño: " + tamagno_letra);
			
//hoy domingo a la noche me quede en porque no me deja estilo normal Font.PLAIN, 
//si yo le estoy poniendo el estilo en la clase que crea el menu
//Video 105 Finalizado.
			
		}
		
		
	}
	
	JTextPane miarea;
	
	JMenu fuente, estilo, tamagno;
	
	Font letras;
}
