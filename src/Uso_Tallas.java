import java.util.*;
//VIDEO 48 - TIPOS ENUMERADOS

public class Uso_Tallas {

	//enum Talla {mini, mediano, grande, muy_grande};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {  //SIEMPRE SE USA PRIVATE
			
			this.abreviatura= abreviatura;
		}
		
		
		public String dameAbreviatura(){ //GETTER
			
			return abreviatura;
		}
		
		
		private String abreviatura;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Talla s= Talla.mini;
		
		//Talla m= Talla.mediano;
		
		//Talla l= Talla.grande;
		
		//Talla xl= Talla.muy_grande;
		
		//Talla xxl= Talla.enorme; JAVA NO LO PERMITE PORQUE NO ESTA DENTRO DE ENUM
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe por favor una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		
		System.out.println("Talla= " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
		
	}

}
