package poo;

import javax.swing.*;

import java.awt.event.*;
import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INVOCAMOS AL CONSTRUCTOR
		Reloj miReloj=new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		//CREAMOS VENTANA EN PRIMER PLANO PARA QUE PROGRAMA NO TERMINE
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.out.println("El programa se ha terminado");
		
		System.exit(0);
	}

}

class Reloj{
	
	//Elaboramos el Constructor
	public Reloj(int intervalo, boolean sonido){
		
		this.intervalo= intervalo;
		
		this.sonido= sonido;
		
	
	}
	
	public void enMarcha(){  //SETTER
		
		ActionListener oyente=new DameLaHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	//fijarse que estas variables de clase engloban a la subclase
	//la ventaja es que puede acceder aunque esten encapsulados
	private int intervalo;
	
	private boolean sonido;
	
	
		//CREAMOS LA CLASE INTERNA DENTRO DE LA CLASE RELOJ
		private class DameLaHora2 implements ActionListener{
		
			public void actionPerformed(ActionEvent evento){
			
				Date ahora=new Date();
			
				System.out.println("te pongo la hora cada 3 segundos " + ahora);
			
					if(sonido){
				
						Toolkit.getDefaultToolkit().beep();
				  	}
			}
	}
}
