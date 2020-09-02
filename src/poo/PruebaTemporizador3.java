package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

//import poo.Reloj.DameLaHora2;

public class PruebaTemporizador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INVOCAMOS AL CONSTRUCTOR
		//al no tener constructor el programa falla
		//quitar los parametros y agregarlos al metodo enMarcha()
		
		//Reloj2 miReloj=new Reloj2(3000, true);
		Reloj2 miReloj=new Reloj2();
		
		miReloj.enMarcha(3000, true);
		
		//CREAMOS VENTANA EN PRIMER PLANO PARA QUE PROGRAMA NO TERMINE
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.out.println("El programa se ha terminado");
		
		System.exit(0);
	}

}

class Reloj2{
	
	
	//Podemos simplificar mas el codigo y eliminar el metodo constructor direct
	//VIDEO 54 PARTE II
	
	//Elaboramos el Constructor
	
	//public Reloj2(int intervalo, boolean sonido){
		
	//	this.intervalo= intervalo;
		
	//	this.sonido= sonido;
		
	
	//}
	
	public void enMarcha(int intervalo, final boolean sonido){  //SETTER
		
		//VIDEO 54 PARTE I
		//CREAMOS LA CLASE INTERNA LOCAL DENTRO DEL METODO ENMARCHA
		//QUITAMOS EL AMBITO PRIVATE PORQUE CLASES INTERNAS VAN SIN AMBITO
				class DameLaHora3 implements ActionListener{
				
					public void actionPerformed(ActionEvent evento){
					
						Date ahora=new Date();
					
						System.out.println("te pongo la hora cada 3 segundos " + ahora);
					
							if(sonido){
						
								Toolkit.getDefaultToolkit().beep();
						  	}
					}
			}
		
		ActionListener oyente=new DameLaHora3();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	//fijarse que estas variables de clase engloban a la subclase
	//la ventaja es que puede acceder aunque esten encapsulados
	
	//VIDEO 54 PARTE II - QUITAMOS VARIABLES DE CLASE (COMENTAMOS)
	//private int intervalo;
	
	//private boolean sonido;
	
	
		

}


