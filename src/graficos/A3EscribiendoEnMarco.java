package graficos;

import javax.swing.*;

import java.awt.*;

public class A3EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto miMarco=new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Primer texto");
		
		setVisible(true);
		
		Lamina miLamina=new Lamina();
		
	//	miLamina.paintComponents(g); //NO LO HACE !!
		
		//sino que hace lo siguiente:
		//El método paintComponent tiene la particularidad de que es invocado automáticamente (al contrario del resto de métodos que vistos hasta ahora) por el contenedor(o Frame), en este caso la lámina.
		//Cada vez que se realiza alguna operación con la lámina tal como cargar, maximizar, minimizar, redimensionar etc, el método paintComponent es invocado. por el contenedor (lámina).
		
		add(miLamina);
		
	}
}



class Lamina extends JPanel{
	
	protected void paintComponent(Graphics g){  //SETTER DE API
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 5, 15);
		
		
	}
	
}
