package poo;

import java.util.*; //PARA INSTANCIAR OBJETO CLASE DATE

import javax.swing.*; //PARA UTILIZAR LA CLASE JOPTIONPANE (METODO MESSAGE)

import java.awt.Toolkit;
import java.awt.event.*; //PARA IMPL LA INTERFAZ ACTIONLISTENER

import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DameLaHora oyente=new DameLaHora();
		//PASO 4:
		ActionListener oyente=new DameLaHora();
		
		//PASO NRO 1: utilizamos clase Timer(delay, interfazActionListener)
		Timer miTemporizador=new Timer(5000, oyente);
		
		//paso 5:
		miTemporizador.start();
		
		//utilizamos el metodo message de la clase JOptionPane pertenec al paquete Java Swing
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		
		
		//PASO 6: Luego de presionar el boton imprime que el programa finalizo
		System.out.println("El programa se ha terminado");
		
		//PASO 7:
		System.exit(0);
		
	}

}

//PASO NRO 2: CREAR UNA CLASE QUE IMPLEMENTE LA INTERFAZ
class DameLaHora implements ActionListener{
	
	//ESTE METODO ES EL QUE TIENE LA INTERFAZ (VER API)
	public void actionPerformed(ActionEvent e){
		
		Date ahora=new Date(); //PASO 3 UTILIZAR LA CLASE DATE Y CREAR UNA INSTANCIA Y SYSOUT
		
		System.out.println("Te pongo la hora cada 5 segundos " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}