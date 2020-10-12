package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class C1MarcoLayouts {
//VIDEO 81, 82 - LAYOUTS I, II
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLayout marco=new MarcoLayout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
		
		
	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout(){
		
		//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
		//es estatico y devuelve un objeto de tipo toolkit
		//es para centrar el marco segun la pantalla
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Acciones");
		
		//setBounds(600,350,600,300);
		
		Lamina_Layout lamina =new Lamina_Layout();
		
		//CLASE LAYOUT ALINEACION A LA IZQUIERDA POR DEFECTO CENTER
		
		//Ejemplo 1:
		//FlowLayout disposicion =new FlowLayout(FlowLayout.LEFT);
	
		Lamina_Layout2 lamina2 =new Lamina_Layout2();
		Lamina_Layout3 lamina3 =new Lamina_Layout3();
		
		add(lamina, BorderLayout.NORTH);
		 //tenemos que decirle al marco que disposcion va a tener para que una
		//lamina no machaque o no pise a la otra.
		
		add(lamina2, BorderLayout.SOUTH);
		add(lamina3, BorderLayout.CENTER);
		
		
		
	}
}
//LAMINA 1

class Lamina_Layout extends JPanel{  //COLOCARLA EN LA ZONA NORTE
	
	public Lamina_Layout(){
		
		//Ver en la API el Contructor para dejar separacion horizontal/vertical
		//en pxls
		//FLOW:
		//FlowLayout disposicion =new FlowLayout(FlowLayout.CENTER,75,50);
		//BORDER
		
		FlowLayout disposicion =new FlowLayout(FlowLayout.LEFT);
		
		//BorderLayout disposicion =new BorderLayout(10,10);
		//EL SETLAYOUT SIEMPRE ES NECESARIO
		setLayout(disposicion);	
		
		botonAmarillo =new JButton("Amarillo");
		add(botonAmarillo, BorderLayout.NORTH);
		
		add(new JButton("Rojo"), BorderLayout.CENTER);
		add(new JButton("Verde"), BorderLayout.WEST);
		add(new JButton("Azul"), BorderLayout.EAST);
		add(new JButton("Naranja"), BorderLayout.SOUTH);
		
		Oyente miOyente =new Oyente();
		
		botonAmarillo.addActionListener(miOyente);
		
		//CON MAS DE UNA LAMINA, PASO 1 CREAR OTRA CLASE EJEMPLO LAMINA2
		
	}
	private JButton botonAmarillo;
}

//LAMINA 2

class Lamina_Layout2 extends JPanel{ //COLOCARLA EN LA ZONA SUR
	
	public Lamina_Layout2(){
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.NORTH);
		add(new JButton("Verde"), BorderLayout.SOUTH);
		add(new JButton("Negro"), BorderLayout.CENTER);
		
	}
}


//LAMINA 3

class Lamina_Layout3 extends JPanel{ //COLOCARLA EN LA ZONA CENTER
	
	public Lamina_Layout3(){
		
		setLayout(new BorderLayout());
		
		add(new JButton("Paco"), BorderLayout.EAST);
		add(new JButton("Jorge"), BorderLayout.CENTER);
		add(new JButton("Pedro"), BorderLayout.WEST);
		
	}
}

class Oyente implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("correcto");
	}
	
	
}