package poo;
//VIDEO 45 Y 46 - CLASES OBSTRACTAS II (Clase I teórica)


import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREAMOS UN ARRAY DE 2 POSICIONES
		Persona[] lasPersonas=new Persona[2];
		//LLENAMOS ARRAY
		lasPersonas[0]=new Empleado2("Mariano Aguero",50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("Ana Lopez", "Biologicas");
		
		//RECORREMOS CON UN FOR EACH
		for(Persona p: lasPersonas){
			
			System.out.println(p.dameNombre()+ " , "+ p.dameDescripcion());
		}
	
	
	}
	

}

/////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////

//CREAMOS UNA CLASE ABSTRACTA.

abstract class Persona {

	
	//METODO CONSTRUCTOR CLASE PERSONA
	public Persona(String nom){
		
		nombre = nom;
  	}

	//METODOS GETTER DE LA CLASE PERSONA
	
	public String dameNombre(){  //GETTER COMUN
		
		return nombre;
	}

//CREAMOS EL METODO ABSTRACTO

public abstract String dameDescripcion(); //GETTER OBSTRACTO

//VARIABLES DE CLASE

private String nombre;

}




//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
class Empleado2 extends Persona {  //CLASE EMPLEADO CON PROPIEDADES NOMBRE, SUELDO, FECHA ALTA, SUBIR SUELDO
	
	//CREAMOS METODO CONSTRUCTOR ESTA VEZ CON PARAMETROS
	
	public Empleado2(String nom, double sue, int año, int mes, int dia){
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
		//UTILIZAMOS LA CLASE GregorianCalendar Y LLAMAMOS A SU CONSTRUCTOR
		
		//LE DECIMOS QUE NOS DEVUELVA ESA FECHA UTILIZANDO EL METODO GETTIME
		altaContrato = calendario.getTime();
		
		++idSiguiente;
		
		Id=idSiguiente;
		
	    }
	
	
	public double dameSueldo(){  //GETTER
		
		return sueldo;
		
	}
	
	
	public Date dameFechaContrato(){ //GETTER
		
		return altaContrato; //FECHA DE ALTA DE CONTRATO
		
	}
	
	public String dameDescripcion(){  //SOBRESCRIBIENDO METODO dameDescripcion
		
		return "Este empleado tiene un id igual a: " + Id + " con un sueldo=" + sueldo + " y la fecha de alta de contrato es: " + altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje){ //SETTER
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo=sueldo + aumento;
		
	}
	
	
	//VARIABLES DE CLASE
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int idSiguiente;
	
	private int Id;
	

}


class Alumno extends Persona{
	
	//METODO CONSTRUCTOR
	
	public Alumno(String nom, String car){
		
			super(nom);
			
			carrera= car;
		}
	
	
	public String dameDescripcion(){  //GETTER
		
		return "Este alumno está estudiando la carrera de: " + carrera;
	}
	
	
	
	//VARIABLES DE CLASE
	
	private String carrera;
	
}