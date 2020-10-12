package graficos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import java.awt.event.*;


public class B6PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MarcoBotones mimarco=new MarcoBotones();
			
			mimarco.setVisible(true);
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	
	}
	
	
	class MarcoBotones extends JFrame{
		
		public MarcoBotones(){
			
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
	
	
	//VIDEO 66 - EVENTOS II
	
	class LaminaBotones extends JPanel implements ActionListener{
		
			JButton botonAzul =new JButton("Azul");
			JButton botonRojo =new JButton("Rojo");
			
			public LaminaBotones(){
			
				add(botonAzul);
				add(botonRojo);
				
				//PONEMOS A LA ESCUCHA "OYENTE" A LA LAMINA MISMA
				botonAzul.addActionListener(this);
				botonRojo.addActionListener(this);
			}
			
//TENEMOS QUE CONTRUIR EL METODO ACTION PERFORMED OBLIGATORIAMENTE POR LA INTERFAZ		
	public void actionPerformed(ActionEvent e){
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == botonAzul){
			
			setBackground(Color.blue);
		}
		else {
			
			setBackground(Color.red);
		}
			 
		
	}
			
			
		}
		


