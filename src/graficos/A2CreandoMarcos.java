package graficos;

import java.awt.Frame;

import javax.swing.*;

public class A2CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciamos o creamos un objeto de la clase miMarco
		miMarco marco1=new miMarco();
		
		//utilizamos el metodo setDefaultCloseOperation para decirle que quiere que haga la app cuando presione exit
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//hacemos visible la ventana(Frame)
		//SIEMPRE VA A LO ULTIMO ESTE METODO!!!
		marco1.setVisible(true);
		
	}

}

//creamos una clase que herede de la clase JFrame
class miMarco extends JFrame{
	
	//creamos el metodo constructor
	public miMarco(){
		
		//setSize(500,300); //con Toolkit podemos adaptar el tamaño a la resolucion que tiene el monitor
		
		//setLocation(500,300);
		
		//posicion y longitud todo junto
		setBounds(500,300,250,250);
		
		//para que no se pueda maximizar la ventana
		//setResizable(false);
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi Ventana");
		
		
	}
}