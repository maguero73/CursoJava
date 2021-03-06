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
		
		configura_menu("Arial", "Fuente", "Arial",9,10,"");		
		configura_menu("Courier", "Fuente", "Courier",9,10,"");
		configura_menu("Serif", "Fuente", "Serif",9,10,"");
		//------------------------------------------
		
		//configura_menu("Normal", "Estilo", "",Font.PLAIN,1);
		
//VIDEO 108 - Menús con CheckBox y RadioButton.
//COMENTAMOS ESTAS 2 LINEAS Y USAMOS NUEVA CLASE JCHECKBOXMENUITEM		
		configura_menu("Negrita", "Estilo", "",Font.BOLD,1,"/home/mariano/mvn_workspace/cursojava/src/graficos/cortar.gif");		
		configura_menu("Cursiva", "Estilo", "",Font.ITALIC,1,"/home/mariano/mvn_workspace/cursojava/src/graficos/cortar.gif");

//VIDEO 109 SEGUNDA PARTE COMENTAMOS ESTAS LINEAS PARA QUE NO MUESTRE MAS LOS		
//JCHECKBOX EN LOS MENU DE NEGRITA CURSIVA

/*
JCheckBoxMenuItem negrita =new 	JCheckBoxMenuItem("Negrita", new ImageIcon ("/home/mariano/mvn_workspace/CursoJava/src/graficos/cortar.gif"));
JCheckBoxMenuItem cursiva =new 	JCheckBoxMenuItem("Cursiva", new ImageIcon ("/home/mariano/mvn_workspace/CursoJava/src/graficos/cortar.gif"));

negrita.addActionListener(new StyledEditorKit.BoldAction());
cursiva.addActionListener(new StyledEditorKit.ItalicAction());

estilo.add(negrita);
estilo.add(cursiva); */
		//--------------------------------------------


//VIDEO 108 - Menús con CheckBox y RadioButton.
//Prescindimos de estas llamadas y las construimos para agregar los radioButtons		
		
	/*	configura_menu("16", "Tamaño", "",9,16,"");
		configura_menu("18", "Tamaño", "",9,18,"");
		configura_menu("20", "Tamaño", "",9,20,"");
		configura_menu("22", "Tamaño", "",9,22,""); */
		
ButtonGroup tamagno_letra = new ButtonGroup();

JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");

JRadioButtonMenuItem dieciocho = new JRadioButtonMenuItem("18");

JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");

JRadioButtonMenuItem veintidos = new JRadioButtonMenuItem("22");

//VIDEO 110 - Curso Java Componentes Swing. Atajos del teclado.

veintidos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));

//AGREGAR LAS INSTANCIAS AL GRUPO:

tamagno_letra.add(dieciseis);

tamagno_letra.add(dieciocho);

tamagno_letra.add(veinte);

tamagno_letra.add(veintidos);

// PONER LOS ELEMENTOS A LA ESCUCHA:

dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));

dieciocho.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 18));

veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));

veintidos.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 22));

// AGREGAR TODOS ESTOS ELEMENTOS AL MENU TAMAÑO:

tamagno.add(dieciseis);
tamagno.add(dieciocho);
tamagno.add(veinte);
tamagno.add(veintidos);

//-------------------------------------------------------------
		
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
//Vídeo 102		
//Creación de procesador de textos. Práctica guiada II.
		
		miarea =new JTextPane();
		
		add(miarea, BorderLayout.CENTER);

//VIDEO 109 - SEGUNDA PARTE - PEGAMOS CODIGO DEL PROCESADOR DE TEXTO:

		JPopupMenu emergente =new JPopupMenu();
		// PRESTAR ATENCION A QUE NECESITA LOS MENU ITEM		
				JMenuItem negritaE =new 	JMenuItem("Negrita");
				
				JMenuItem cursivaE =new 	JMenuItem("Cursiva");

				negritaE.addActionListener(new StyledEditorKit.BoldAction());

				cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
				
				emergente.add(negritaE);
				
				emergente.add(cursivaE);
				
				miarea.setComponentPopupMenu(emergente);



	}	

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
				
	
//Vídeo 103	- Creación de procesador de textos Práctica guiada III.
	public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono){
		
		JMenuItem elem_menu=new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
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
//VIDEO 108. 	Menús con CheckBox y RadioButton
//comentamos las lineas siguientes de estilo que no hacen falta:
			
		}else if (menu=="Estilo"){
			
			estilo.add(elem_menu);
			
			if(estilos==Font.BOLD){

				// VIDEO 110 DONDE APRENDEMOS LA CLASE SETACCELERATOR

				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			
			}else if (estilos==Font.ITALIC){

				// VIDEO 110 DONDE APRENDEMOS LA CLASE SETACCELERATOR

				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
			
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
			

	//cambios desde branch java**
		

	
	JTextPane miarea;
	
	JMenu fuente, estilo, tamagno;
	
	Font letras;
}

