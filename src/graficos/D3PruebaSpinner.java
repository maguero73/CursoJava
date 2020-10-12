package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class D3PruebaSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//VIDEO 98 - Curso Java  ComponentesSwing. JSpinner I.
MarcoSpinner spiner =new MarcoSpinner();
		
		spiner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		spiner.setVisible(true);
	}

}


class MarcoSpinner extends JFrame{
	
	public MarcoSpinner(){
		
		setVisible(true);
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Prueba Spinner I");
		
		LaminaSpinner milamina =new LaminaSpinner();
		
		add(milamina);
	
	}
}
//VIDEO 99 - Componentes Swing. JSpinner II. Vídeo 99	
class LaminaSpinner extends JPanel{
	
		public LaminaSpinner(){
			
		//PASO 1
	
	//COMENTAMOS LINEA DEL ARRAY Y UTILIZAMOS CONTRUCTOR NUMERMODEL	
	//	String lista[]={"Enero","Febrero","Marzo","Abril","Mayo"}; 	
			
		//JSpinner control=new JSpinner(new SpinnerDateModel());	
		
		//CON EL MODELO LIST SE PUEDE INSERTAR UN ARRAY PERSONALIZADO
		//JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1));
			
			//VIDEO 99 - SE UTILIZA MODELO PROPIO PARA DECREMENTAR
			// CUANDO LE DAMOS EL JSPINNER PARA ARRIBA (COMPORTAMIENTO
			// INVERSO
			
			//POR ULTIMO PROBAMOS LA CLASE INTERNA ANONIMA COMENTO
		//	JSpinner control=new JSpinner(new MiModeloJspinner());
			
			
	//CLASE INTERNA ANONIMA !!!!!! OKK
			
			
			JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1){
				
				
				public Object getNextValue(){  //GETTER
					
					return super.getPreviousValue();
				}
				
				public Object getPreviousValue(){  //GETTER
					
					return super.getNextValue();
				}
				
				
				
				
			});
			
			
		//PARA AUMENTAR EL TAMAÑO DEL SPINNER HACER LO SIGUIENTE
		
		//primero creamos una instancia dimension
		Dimension d = new Dimension(100,20);
		
		//luego con este metodo llamamos a esa dimension
		control.setPreferredSize(d);
		
		add(control);
	}

		
// VIDEO 99 - Componentes Swing. JSpinner II. Vídeo 99
	// AHORA ULTIMO PASO DEL VIDEO 99 VEMOS QUE ES UNA CLASE INTERNA ANONIMA

		
		
	/*	private class MiModeloJspinner extends SpinnerNumberModel{
		
		public MiModeloJspinner(){
			
			//llamamos al constructor SpinnerNumberModel
			//y le pasamos los parametros
			super(5,0,10,1);
				}
		
		public Object getNextValue(){  //GETTER
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue(){  //GETTER
			
			return super.getNextValue();
		}
	} */
		
		
		
}
