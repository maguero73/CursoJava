package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class D4FrameMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//VIDEO 100 - Componentes Swing. Creación de menús I. Vídeo 100
		MarcoMenu radio =new MarcoMenu();
		
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio.setVisible(true);
	}

}


class MarcoMenu extends JFrame{

	public MarcoMenu(){

		setVisible(true);

		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);

		setTitle("Creación de menús I");

		LaminaMenu milamina =new LaminaMenu();

		add(milamina);

	}
}


class LaminaMenu extends JPanel{

	public LaminaMenu(){
	
		JMenuBar mibarra=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		
		JMenu edicion=new JMenu("Edición");
		
		JMenu herramientas=new JMenu("Herramientas");
		
		JMenu ayuda=new JMenu("Ayuda");
		
		JMenu opciones=new JMenu("Opciones");
//------------------------------------------------------------------------
//Menu Archivo
		JMenuItem guardar = new JMenuItem("Guardar");
		
		JMenuItem guardar_como = new JMenuItem("Guardar como");
		
		JMenuItem salir = new JMenuItem("Salir");
		
//-----------------------------------------------------------------------		
//Menu Edicion		
		JMenuItem cortar = new JMenuItem("Cortar");
		
		JMenuItem copiar = new JMenuItem("Copiar");
		
		JMenuItem pegar = new JMenuItem("Pegar");
		
//-----------------------------------------------------------------------		
//Menu Herramientas		
		JMenuItem generales = new JMenuItem("Generales");
		
//------------------------------------------------------------------------
//Menu Ayuda		
		JMenuItem acerca = new JMenuItem("Acerca de");
		
//------------------------------------------------------------------------
		JMenuItem opcionuno = new JMenuItem("Opcion 1");
		JMenuItem opciondos = new JMenuItem("Opcion 2");
		JMenuItem opciontres = new JMenuItem("Opcion 3");
		
//add archivo
		archivo.add(guardar);
		
		archivo.add(guardar_como);
		
		archivo.add(salir);
		
//------------------------------------------------------------------------		
//add edicion		
		edicion.add(cortar);
		
		edicion.add(copiar);
		
		edicion.add(pegar);
		//SEPARADORES USAR METODO ADDSEPARATOR() VOID
		edicion.addSeparator();
//------------------------------------------------------------------------		
//add herramientas			
		herramientas.add(generales);
		
//------------------------------------------------------------------------		
//add ayuda		
		ayuda.add(acerca);

		
//------------------------------------------------------------------------		
//add sub menu opciones
		
		opciones.add(opcionuno);
		
		opciones.add(opciondos);
		
		opciones.add(opciontres);
		
		mibarra.add(archivo);
		
		edicion.add(opciones);
		
		mibarra.add(edicion);
		
		mibarra.add(herramientas);
		
		mibarra.add(ayuda);
		
		add(mibarra);
	
	}

}
