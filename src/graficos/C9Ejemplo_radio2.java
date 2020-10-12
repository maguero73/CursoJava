package graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C9Ejemplo_radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VIDEO 94 - RADIO BUTTONS II		
		MarcoRadio2 radio =new MarcoRadio2();
		
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radio.setVisible(true);
	}

}


class MarcoRadio2 extends JFrame{
	
	public MarcoRadio2(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Button Radio II");
		
		LaminaRadio2 milamina =new LaminaRadio2();
		
		add(milamina);
	
	}
}


class LaminaRadio2 extends JPanel{
	
	public LaminaRadio2(){
		
		setLayout(new BorderLayout());
		
		texto =new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup migrupo =new ButtonGroup();
		
		boton1=new JRadioButton("Pequeño", false);
		
		boton2=new JRadioButton("Grande", false);
		
		boton3=new JRadioButton("Muy Grande", false);
		
		boton4=new JRadioButton("Mediano", true);
		
		JPanel lamina_radio2 =new JPanel();
		
		Evento_radio mievento =new Evento_radio();
		
		boton1.addActionListener(mievento);
		
		boton2.addActionListener(mievento);
		
		boton3.addActionListener(mievento);
		
		boton4.addActionListener(mievento);
		
		migrupo.add(boton1);
		
		migrupo.add(boton2);
		
		migrupo.add(boton3);
		
		migrupo.add(boton4);
		
		lamina_radio2.add(boton1);
		
		lamina_radio2.add(boton2);
		
		lamina_radio2.add(boton3);
		
		lamina_radio2.add(boton4);
		
		add(lamina_radio2, BorderLayout.SOUTH);
		
		
		
		
	}
	
private class Evento_radio implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==boton1){
			
		//	System.out.println("Has Pulsado Boton1");
		texto.setFont(new Font ("Serif", Font.PLAIN, 10));
		}else if(e.getSource()==boton2){
			texto.setFont(new Font ("Serif", Font.PLAIN, 20));
		}else if(e.getSource()==boton3){
		
			texto.setFont(new Font ("Serif", Font.PLAIN, 28));
		}else if(e.getSource()==boton4){	
			texto.setFont(new Font ("Serif", Font.PLAIN, 16));
		}	
		
	}
	
	
}
private JLabel texto;	
	
private JRadioButton boton1, boton2, boton3, boton4;


	
	
}	