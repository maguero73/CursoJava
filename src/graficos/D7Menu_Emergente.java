package graficos;

import javax.swing.*;


// VIDEO 109 - Curso Java Componentes Swing. Menús emergentes.
public class D7Menu_Emergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEmergenteM mimarco =new MarcoEmergenteM();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoEmergenteM extends JFrame{
	
	public MarcoEmergenteM() {
		
		setBounds(100,100,300,250);
		
		LaminaEmergenteM milamina =new LaminaEmergenteM();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaEmergenteM extends JPanel{
	
	public LaminaEmergenteM() {
		
// UTLIZAMOS LA NUEVA CLASE QUE APRENDIMOS A USAR LLAMADA JPOPUPMENU
		
		JPopupMenu emergente =new JPopupMenu();
// PRESTAR ATENCION A QUE NECESITA LOS MENU ITEM		
		JMenuItem opcion1 =new 	JMenuItem("Opcion 1");
		
		JMenuItem opcion2 =new 	JMenuItem("Opcion 2");
		
		JMenuItem opcion3 =new 	JMenuItem("Opcion 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		setComponentPopupMenu(emergente);
		
		
	}
}

