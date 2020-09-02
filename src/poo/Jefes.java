package poo;

//HACEMOS QUE INTERFAZ JEFES HEREDE DE INTERFAZ TRABAJADORES 
public interface Jefes extends Trabajadores{

	//public abstract String... // O SIMPLEMENTE OBVIARLOS PORQ SIEMPRE SON ASI
	String tomar_decisiones(String decision); //solo se definen no se implementan
	
}
