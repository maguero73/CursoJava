import javax.swing.JOptionPane;


public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("Ingrese su nombre por favor");
		
		String edad = JOptionPane.showInputDialog("Ingrese por favor su edad");
		
		int edad2 = Integer.parseInt(edad);
		
		System.out.println(nombre_usuario + " tiene " + edad + " y el año que viene tendrá " + (edad2+1)+ " años ");
		
	}

}
