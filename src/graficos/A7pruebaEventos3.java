package graficos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import java.awt.event.*;

public class A7pruebaEventos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

MarcoBotones mimarco=new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2(){
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Botones y Eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotones miLamina=new LaminaBotones();
		
	//	miLamina.paintComponents(g); //NO LO HACE !!
		
		//sino que hace lo siguiente:
		//El método paintComponent tiene la particularidad de que es invocado automáticamente (al contrario del resto de métodos que vistos hasta ahora) por el contenedor(o Frame), en este caso la lámina.
		//Cada vez que se realiza alguna operación con la lámina tal como cargar, maximizar, minimizar, redimensionar etc, el método paintComponent es invocado. por el contenedor (lámina).
		
		add(miLamina);
		
	}
}


//VIDEO 67 - EVENTOS III - veremos como hacer que la lamina deje de ser
// nuestro objeto listener, sino que ahora sera el propio color de fondo
// el que cambie.


//paso 1) quitarmos el implements de la lamina
class LaminaBotones2 extends JPanel{
//class LaminaBotones2 extends JPanel implements ActionListener{
	
		JButton botonAzul =new JButton("Azul");
		JButton botonRojo =new JButton("Rojo");
		
		public LaminaBotones2(){
		
			add(botonAzul);
			add(botonRojo);
			
			ColorFondo Azul =new ColorFondo(Color.blue);
			ColorFondo Rojo =new ColorFondo(Color.red);
			
			
			//PONEMOS A LA ESCUCHA "OYENTE" A LA LAMINA MISMA
			botonAzul.addActionListener(Azul);
			botonRojo.addActionListener(Rojo);
		}
		
		
		
private class ColorFondo implements ActionListener{
	
	public ColorFondo(Color c){
		
		colorFondo = c;
	}
	
	public void actionPerformed(ActionEvent e){
		
		setBackground(colorFondo);
	}
	
	private Color colorFondo;
}
		
	
	}
