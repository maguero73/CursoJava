package poo;
//VIDEO 41 - HERENCIA II


public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Coche miCoche1=new Coche();
		
		miCoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("Azul");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(miCoche1.dime_datos_generales()+ " "+ miCoche1.dime_color());
		
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
		
		
		
	}		
		
}		
		
		
		
		
		
		
		
		
		
		
// CLASE USO_COCHE ANTES DE RENOMBRARLA A USO_VEHICULO		
/*		
		//vamos a instanciar una clase, en este caso la clase coche
		
		
		Coche Renault=new Coche();  //INSTANCIANDO LA CLASE COCHE
		
		// CUANDO PONEMOS NEW LLAMAMOS AL CONSTRUCTOR DE LA CLASE
		
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce Color")); //Con parametros
		
		//Renault.color= "marron"; //PARA VER ENCAPSULAMIENTO **** ESTO ESTA MAL!!
		
		//Renault.establece_color(); //SIN PARAMETROS
		
		System.out.println(Renault.dime_datos_generales());
		
	System.out.println (Renault.dime_color());	
	
	Renault.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero?"));
		
   System.out.println(Renault.dime_asientos());
   
   Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		
   System.out.println(Renault.dime_climatizador());
   
   System.out.println(Renault.dime_peso_coche());
   
   System.out.println("El precio final de coche es: " + Renault.precio_coche());
   
	}

}

		*/