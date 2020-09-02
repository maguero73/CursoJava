package poo;


//metodo constructor: se encarga de dar un estado inicial a nuestro objeto
//siempre se debe llamar igual que la clase


public class Coche {  //DECLARACION DE LA CLASE
	
	private int ruedas;
	
	private int largo;           //ENCAPSULAMIENTO ****** VER!!
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;  //caracteristicas comunes hasta aqui
	
	private String color;
	
	private int peso_total;
	
	boolean asientos_cuero, climatizador; //caracteristicas no comunes hasta aqui
	
	
	
	public Coche(){   //METODO CONSTRUCTOR SIEMPRE MISMO NOMBRE QUE LA CLASE
		
		ruedas = 4;
		
		largo =	2000;
		
		ancho = 300;
		
		setMotor(1600);
		
		peso_plataforma = 500;
				
	}
	
	
	public String dime_datos_generales(){  //GETTER
		
		return "la plataforma del vehiculo tiene " + ruedas + " ruedas" +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm"
				+ "y un peso de plataforma de " + peso_plataforma + " Kg.";
		
		}
	
	
	public void establece_color(String color_coche){  //SETTER (modifica el dato)
		
		//color="azul";
		color= color_coche;
		
	}
	
	
	public String dime_color(){  //GETTER  (retorna el dato)
		
		return "El color del coche es " + color;
	}
	
	
	public void configura_asientos(String asientos_cuero){  //SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			this.asientos_cuero=true; //USO DEL THIS CUANDO SE LLAMA QUE VARIABLE DE LA CLASE
		}else{
			this.asientos_cuero=false;
			
		}
	}
	
	public String dime_asientos(){   //GETTER
		if(asientos_cuero==true){
			return "El coche tiene asientos de cuero";
		}	else{
			return "El coche tiene asientos de serie";
				
		}
			
	}
	
	public void configura_climatizador(String climatizador){ //SETTER
	
	if(climatizador.equalsIgnoreCase("si")){
		this.climatizador=true; //USO DEL THIS CUANDO SE LLAMA IGUAL QUE VARIABLE DE LA CLASE
	}else{
		this.climatizador=false;
	   }
	
	}
	
	
	public String dime_climatizador(){  //GETTER
	
		if(climatizador==true){
	return "El coche incorpora climatizador";
	}else{
		return "El coche lleva aire acondicionado";
		}
		
	}
	
	
	
	public String dime_peso_coche(){    //SETTER + GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if (asientos_cuero==true){
			
			peso_total = peso_total +50;
		}
		if (climatizador==true){
			
			peso_total= peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
		
	    }
		
	
	
	public int precio_coche(){   //GETTER
		
		int precio_final = 10000;
		
		if(asientos_cuero==true){
			
			precio_final= precio_final + 2000;
		}
		if (climatizador){ //PONERLO ASI SIN EL ==TRUE ES LO MISMO QUE PONIENDOLO TRUE
			
			precio_final+= 1500;  //EL += ES LO MISMO QUE CONTADOR = CONTADOR + 1; ES PARA ACHICAR LA EXPRESION
			
		}
	return precio_final;
	

// ----------------------------------------------------------------------	
	
	
	
//METODOS GETTER Y SETTER AUTOMATICOS POR MENU	
		
	}

	public int getMotor() {  //GETTER AUTOMATICO
		return motor;
	}

	public void setMotor(int motor) { //SETTER AUTOMATICO
		this.motor = motor;
	}
	
	
}



