package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class A5pruebass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce Fuente");
		
		boolean estalafuente= false;
//CREAMOS ARRAY PARA SABER QUE FUENTES EXISTEN EN EL SISTEMA OPERATIVO
		String [] nombresDeFuentes =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombresDeFuentes){
			
			//System.out.println(nombredelafuente);
			if (nombredelafuente.equals(fuente)){
				
				estalafuente=true;
			}
		}
		
	if (estalafuente){
			
			System.out.println("Fuente Instalada");
		}else{
			
		System.out.println("No esta instalada la fuente");
		}
	}

}
 