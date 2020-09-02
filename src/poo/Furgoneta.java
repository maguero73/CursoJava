package poo;

//VIDEO 40 - HERENCIA
//VIDEO 41

public class Furgoneta extends Coche { //LA CLASE FURGONETA HEREDA DE COCHE

	private int capacidad_carga;
	
	private int plazas_extra;
	
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		
		//LLAMA AL CONSTRUCTOR DE LA CLASE PADRE
		super();
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
	}
	
	
public String dimeDatosFurgoneta(){  //GETTER
	
	return "La capacidad de carga es: " + capacidad_carga + " y la cantidad de plazas extra son: " + plazas_extra;
	
}
	

}
