package poo;
//VIDEO 36
//VIDEO 37

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3=new Empleados("Lucia");
		
		Empleados trabajador4=new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");  //SETTER VOID
		
	//  trabajador1.cambiaNombre("Maria"); //ESTO ESTA MAL !!!! ESTE VALOR NO DEBERIA CAMBIAR
		
		//ENTONCES... agregamos instruccion FINAL en la variable nombre
		
		// QUE SERIA UNA CONSTANTE EN JAVA
		
		//System.out.println(trabajador1.devuelveDatos());
		
		//Empleados.id++;  //VA A BUSCAR LA VARIABLE STATIC DE LA CLASE
		
		// E INCREMENTA EN 1 POR CADA PASADA.-
		
		//System.out.println(trabajador2.devuelveDatos());
		
		//Empleados.id++;
		
		
		//PARA PONER TODO EN UN MISMO System.out.println TENER EN CUENTA
		//QUE LA BAJADA DE CARRO PARA JAVA ES BARRA INV N: "\n"
		
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
		trabajador3.devuelveDatos()+ "\n" + trabajador4.devuelveDatos()+ "\n" +
		Empleados.dameIdSiguiente());
		
		
		
	}
	

}

//Empresa nueva en donde los trabajadores nuevos tienen que empezar en el
//departamento administracion

class Empleados{  //CREAMOS UNA CLASE LLAMADA EMPLEADOS
	
	
           ////////////////////////////
          ////METODO CONSTRUCTOR //////
         /////////////////////////////
	
	
	public Empleados(String nom){  //CONSTRUCTOR CON MISMO NOMBRE DE LA CLASE
				
		nombre=nom;
		
		seccion= "Administracion";
		
		id=id_siguiente;  //IGUALAMOS ID A LA VARIABLE ESTATICA
		
		id_siguiente++;  //INCREMENTAMOS SU VALOR POR CADA PASADA
		
	}
	
	
	//CREAMOS UN METODO SETTER VOID QUE VA A CAMBIAR LA SECCION
	
	public void cambiaSeccion(String seccion){ //SETTER
		
	//ESTABLECER UN VALOR EN UN CAMPO	
	
		this.seccion=seccion;
	}
	
	
	/*
	public void cambiaNombre(String nombre){ //SETTER
		
		this.nombre=nombre;
	}*/
	
	//CREAMOS UN METODO GETTER RETURN
	
	public String devuelveDatos(){  //GETTER
		
		return "El nombre es " + nombre + " ,la seccion es " + seccion + " y el id es: " + id;
	}
	
	
	public static String dameIdSiguiente(){
		
		return "El id siguiente es: " + id_siguiente;
		
	}
	
	
	//////////////////////////
	// VARIABLES DE CLASE ///    //DE LA CLASE EMPLEADOS
	////////////////////////
	
	
	private final String nombre; //CONSTANTE
	
	private String seccion;
	
	
	//public static int id;
	
	//USAMOS STATIC PARA QUE LOS OBJETOS INSTANCIADOS COMPARTAN EL ID
	//SE HIZO LA PRUEBA GENERANDO CONTADORES POR CADA NUEVA INSTANCIA,
	//PERO NO ES MUY EFICIENTE, Y ADEMAS SE PIERDE EL  ENCAPSULAMIENTO
	//PORQUE COMO VEMOS, ES NECESARIO DECLARARLO PUBLIC 
	
	private int id;
	
	private static int id_siguiente =1;  //CREAMOS VARIABLE STATIC Y LA INICIALIZAMOS EN 1

		
	
	
}