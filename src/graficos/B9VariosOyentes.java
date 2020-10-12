package graficos;

import java.awt.event.*;

import javax.swing.*;




public class B9VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal mima1 =new MarcoPrincipal();
		
		mima1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mima1.setVisible(true);
	}

}


class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal(){
		
		setSize(900,500);
		
		setLocation(400,200);
		
		setTitle("Varios Oyentes");
		
		setBounds(600,350,600,300);
		
		LaminaPrincipal lamina1=new LaminaPrincipal();
		
		add(lamina1);
		
		
	}
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal(){
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar Todo");
		
		add(boton_cerrar);
		
		OyenteNuevo miOyen =new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyen);
		
		
		
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marc=new Marco_Emergente(boton_cerrar);
			
			marc.setVisible(true);
			
		}
		
		
	}
	
	JButton boton_cerrar;
	
}


class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton BCerrar){
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar=new CierraTodos();
		
		BCerrar.addActionListener(oyenteCerrar);
		
	}
	
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			dispose();
		}
		
		
	}
	private static int contador=0;
}