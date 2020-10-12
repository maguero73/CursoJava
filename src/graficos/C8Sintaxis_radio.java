package graficos;

import graficos.MarcoCheck.LaminaCheck;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class C8Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VIDEO 93 - RADIO BUTTONS		
				MarcoRadio radio =new MarcoRadio();
				
				radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				radio.setVisible(true);
	}

}


class MarcoRadio extends JFrame{
	
	public MarcoRadio(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Button Radio");
		
		LaminaRadio milamina =new LaminaRadio();
		
		add(milamina);
	
	}
}


class LaminaRadio extends JPanel{
	
	public LaminaRadio(){
		
		ButtonGroup migrupo1 =new ButtonGroup();
		
		ButtonGroup migrupo2 =new ButtonGroup();
		
		//NUNCA SE PUEDE AGREGAR EL GRUPO A LA LAMINA DA ERROR
		
		JRadioButton boton1 =new JRadioButton("Azul", false);
		
		JRadioButton boton2 =new JRadioButton("Rojo", true);
		
		JRadioButton boton3 =new JRadioButton("Verde", false);
		
		JRadioButton boton4 =new JRadioButton("Masculino", true);
		
		JRadioButton boton5 =new JRadioButton("Femenino", false);
		
		migrupo1.add(boton1);
		
		migrupo1.add(boton2);
		
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		
		migrupo2.add(boton5);
		
		//SE DEBE INSERTAR DE LA SIGUIENTE MANERA
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
		
	}
}	