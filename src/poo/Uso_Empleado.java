package poo;
import java.util.*;
//VIDEO 34
//VIDEO 35
//VIDEO 39


public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Mariano Apo", 95000, 1995, 06, 02);
		
		Empleado empleado3=new Empleado("Jorge Lopez", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
				+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
				+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
				+ " Fecha de Alta: " + empleado3.dameFechaContrato());*/
		
//VIDEO 43 - POLIMORFISMO - PRINCIPIO SUSTITUCION - ENLAZADO DINAMICO
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.establece_incentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[6];  //CREAMOS UN ARRAY 
			
		
		// DE TRES POSICIONES Y LLENAMOS DICHO ARRAY
		
		misEmpleados[0]=new Empleado("Ana", 70000, 1990, 12, 17);
		
		misEmpleados[1]=new Empleado ("Carlos", 50000, 1995, 06, 02);
		
		misEmpleados[2]=new Empleado ("Paco", 25000, 2002, 03, 15);
		
		misEmpleados[3]=new Empleado ("Antonio", 47500, 2009, 11, 9);
		
		misEmpleados[4]=jefe_RRHH; //Poliformismo en accion - Principio Sustitucion
		
		misEmpleados[5]=new Jefatura ("Maria", 95000, 2009, 11, 9);
		
		//VIDEO 44	- CASTING DE OBJETOS
		
		
		//Cuando hacemos un casteo de variables funciona parecido:
		//double num1=7.5; //TENEMOS NUM1 DE TIPO DOUBLE
		//int num2=(int)num1; //CASTEADO, LO PASAMOS A INT
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		//AQUI SE REALIZA EL MISMO CASTEO
		
		jefa_Finanzas.establece_incentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bono de: " +
		jefa_Finanzas.establece_Bono(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bono de " + misEmpleados[3].establece_Bono(200));
		
		
		
		
//VIDEO 50 - INTERFACES II - 

/*		
Empleado director_comercial=new Jefatura("Sandra", 85000,2012,05,05);

Comparable ejemplo=new Empleado("Elizabeth",95000,2011,06,07);

if(director_comercial instanceof Empleado){
	
	System.out.println("Es de tipo Jefatura");
	
}
	
if(ejemplo instanceof Comparable){
	
	System.out.println("Implementa la interfaz comparable");
}*/




	//Se puede utilizar un objeto de la subclase cuando un programa espera un objeto de la superclase.
	// Se cumple tambien por la regla de "ES UN..."
		
		//EN ESTE CASO VEMOS CUANDO LA REGLA NO SE CUMPLE
		
//		Jefatura jefe_compras=(Jefatura) misEmpleados[1];
// EL ECLIPSE ARROJA ERROR: Exception oo.Empleado cannot be cast to poo.Jefatura
//		at poo.Uso_Empleado.main	
//NO SE CUMPLE PORQUE EN LA POSICION 1 DEL ARRAY EXISTE UN EMPLEADO
		//Y UN EMPLEADO "ES UN..." JEFE ?? NO!!!!
		
		//HACEMOS UN FOR
		
		/*
		for (int i=0;i<3;i++){   //BUCLE FOR COMUN
			
			misEmpleados[i].subeSueldo(5);
		}
		
		for (int i=0; i<3;i++){
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		//HACEMOS UN FOR MEJORADO
		
		
		
		for(Empleado e: misEmpleados){  //CON BUCLE FOR EACH (MEJORADO)
			
			e.subeSueldo(5);
			
		}

//VIDEO 49 - INTERFACES		
		
		
		//Método Sort de la clase Arrays para ordenar el array
		Arrays.sort(misEmpleados);
		
// Sin embargo nos da ERROR, este metodo en la API nos obliga a que el tipo
// a ordenar, implemente la interfaz comparable
		
		
		
		//PERO RECORDAR SEGUN LO VISTO QUE ESTE METODO SORT NOS OBLIGA
		//A QUE EL TIPO A ORDENAR IMPLEMENTE LA INTERFAZ COMPARABLE

		
		for (Empleado e: misEmpleados){
			
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
			
			
			
			
			
		// System.out.println("El id es" + e.dameId());
		// LA JVM ES LA ENCARGADA DE REALIZAR AUTOMATICAMENTE EL ENLAZADO DINAMICO
		// ES DECIR, LA ENCARGADA DE DETERMINAR CUAL e.dameNombre ES DE UNA CLASE
		// Y CUAL DE LA OTRA CLASE.
			
			
		
		
		}
	
	}
	
//VIDEO 49 - INTERFACES

//ENTONCES IMPLEMENTAMOS LA INTERFAZ COMPARABLE
//SIN EMBARGO JAVA NOS DICE QUE HACE FALTA IMPLEMENTAR EL METODO
//COMPARABLE COMPARABLE.COMPARETO(OBJECT)

class Empleado implements Comparable, Trabajadores {  //CLASE EMPLEADO CON PROPIEDADES NOMBRE, SUELDO, FECHA ALTA, SUBIR SUELDO
	
	//CREAMOS METODO CONSTRUCTOR ESTA VEZ CON PARAMETROS
	
	
	public Empleado(String nom, double sue, int año, int mes, int dia){
	
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
		//UTILIZAMOS LA CLASE GregorianCalendar Y LLAMAMOS A SU CONSTRUCTOR
		
		altaContrato = calendario.getTime();
		//LE DECIMOS QUE NOS DEVUELVA ESA FECHA UTILIZANDO EL METODO GETTIME
		
		

		id=idSiguiente;
		
		++idSiguiente;

		
	    }
	
		public double establece_Bono(double premio){
			
			return Trabajadores.bono_base+premio;
			
			
		}
	
	
	      //SEGUNDO USO DEL THIS !!!! UTILIZA LOS PARAMETROS DEL OTRO
	//       CONSTRUCTOR
	
		public Empleado (String nom){
			
			this(nom, 30000, 2000, 01, 01);
			
	}
		
		
	
	public String dameNombre(){  //GETTER
		
		
		return nombre + " id:" + id;
		
	}
	
	public double dameSueldo(){  //GETTER
		
		return sueldo;
		
	}
	
	
	public Date dameFechaContrato(){ //GETTER
		
		return altaContrato; //FECHA DE ALTA DE CONTRATO
		
	}
	
	public void subeSueldo(double porcentaje){ //SETTER
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo=sueldo + aumento;
		
	}
	
	//CREAMOS EL METODO COMPARE TO DE LA INTERFACE COMPARABLE
	public int compareTo(Object miObjeto){
		
		//hay que hacer un casting o refundicion de la variable miObjeto porque es de tipo Object
		//la llamaremos miObjeto2
		Empleado miObjeto2=(Empleado) miObjeto;
		
		if(this.id<miObjeto2.id){
			
			return -1;
		}
		
		if(this.id>miObjeto2.id){
			
			return 1;
		}
		
		
		return 0;
					
		}
		
			
	
	//VARIABLES DE CLASE
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int idSiguiente = 1;
	
	private int id;
	
	
}	


	//VIDEO 42 - HERENCIA III

	
//SI PONEMOS LA PALABRA RESERVADA "final" DELANTE DE LA CLASE JEFATURA
//OTRA CLASE NO PUEDA HEREDAR DE ELLA EJEMPLO:
//final class Jefatura extends Empleado{


class Jefatura extends Empleado implements Jefes { //SI NO PONEMOS CONSTRUCTOR, JAVA ENTIENDE QUE SE USA EL CONSTRUCTOR POR DEFECTO DE LA CLASE EMPLEADO
	//MARCA ERROR PORQUE SE TIENE QUE CREAR EL METODO TOMARDECISIONES
	
	
	
	public Jefatura(String nom, double sue, int año, int mes, int dia){
	
		super(nom, sue, año, mes, dia);
		
		}
	
//VIDEO 50 - INTERFACES II	
	
	public String tomar_decisiones(String decision){ //METODO DE LA INTERFAZ
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	
	public double establece_Bono(double premio){
		
		double prima=2000;
		
		return Trabajadores.bono_base+premio+prima;
	}
	
	
	public void establece_incentivo(double b){  //SETTER
		
		incentivo=b;
	}
	
	public double dameSueldo(){  //SOBRESCRIBE EL METODO DAME SUELDO DE LA CLASE EMPLEADO
		
		double sueldoJefe=super.dameSueldo(); //TRAE METODO DAME SUELDO DE LA CLASE PADRE CON SUPER
		
		return sueldoJefe + incentivo;
		
	}
	
	
	private double incentivo;
	

//CLASE 44 - 2DA PARTE - DECLARAR UNA CLASE COMO FINAL	
	
/*	
class Director extends Jefatura{
	
	public Director (String nom, double sue, int año, int mes, int dia){
		
		super(nom, sue, año, mes, dia);
		
		}

  	}	 
*/











}	
		


