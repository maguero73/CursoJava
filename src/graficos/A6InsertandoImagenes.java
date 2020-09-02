package graficos;

import javax.swing.*;

import java.awt.geom.*;
import java.awt.*;

import javax.imageio.*;

import java.io.*;

public class A6InsertandoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConImagenes mimarco=new MarcoConImagenes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}


class MarcoConImagenes extends JFrame{
	
	public MarcoConImagenes(){
		
		setTitle("marco con Imagen");
		
		setBounds(750,400,400,350);
		
		LaminaConImagen miLamina=new LaminaConImagen();
		
		add(miLamina);
		
		
	}
}


class LaminaConImagen extends JPanel{
	
	//CLASE 63 - IMAGEIO - READ() - VER CLASE EN CUADERNO !!
	public LaminaConImagen(){
		
		try{
			imagen = ImageIO.read(new File("src/graficos/linux.png"));	
		}
		
		catch(IOException e){
			
			System.out.println("La imagen no se encuentra");
		}
	}
	
	protected void paintComponent(Graphics g){  //SETTER DE API
		
		super.paintComponent(g);
		
		
		//File miImagen = new File("src/graficos/linux.png");
		
		
		//VIDEO 64 - METODO COPYAREA - CON FOR PARA REPLICAR
		//capturan el ancho y el alto de una imagen por si no sabemos cuanto mide nuestra imagen
		//clase image, buscar los siguientes metodos.
		int anchura= imagen.getWidth(this);
		
		int altura= imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i=0; i<300; i++){
			
			for (int j=0; j<200; j++){
				
				g.copyArea(12, 5, 200,230,anchura*i,altura*j);
				
			}
		}
		
		
		
		//casting de graphics 2D
		//Graphics2D g2=(Graphics2D) g;
		
		//VARIABLES DE CLASE
	}
	private Image imagen;
	
}