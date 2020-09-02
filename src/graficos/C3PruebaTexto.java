package graficos;

import java.awt.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

//VIDEO 86, 87 - Componentes Swing. Cuadros de texto I, II

public class C3PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto mimarco=new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		}
		
	}



class MarcoTexto extends JFrame{
	
	public MarcoTexto(){
		
		//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
		//es estatico y devuelve un objeto de tipo toolkit
		//es para centrar el marco segun la pantalla
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tPantalla=miPantalla.getScreenSize();
		int alturaPantalla=tPantalla.height;
		int anchoPantalla=tPantalla.width;
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		//Se debe comentar el setBounds para que funcione
		//setBounds(600,300,600,350);
		
		setTitle("Marco Texto");
		
		LaminaTexto milamina =new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
	
		
	}

class LaminaTexto extends JPanel{
	
	public LaminaTexto(){
		
		setLayout(new BorderLayout());
		
		JPanel milamina2 =new JPanel();

		milamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("", JLabel.CENTER);
		
		JLabel texto1 =new JLabel("Email : ");
		
		milamina2.add(texto1);
		
	//	JTextField campo1 =new JTextField("        Texto por defecto",20);
		
		campo1 =new JTextField(20);
		
		milamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
	//	JButton miboton =new JButton("Hacer click");
		
		JButton miboton =new JButton("Comprobar");
		
		oyente miOyente =new oyente();
		
		miboton.addActionListener(miOyente);
		
		milamina2.add(miboton);
		
		add(milamina2, BorderLayout.NORTH);
		
		//TENEMOS EN LA API 2 METODOS GETTEXT() Y SETTEXT() EJEMPLO
		//GETTEXT Y TAMBIEN VIMOS EL TRIM PARA QUITAR ESPACIOS ADICIONALES
	//	System.out.println(campo1.getText()); 
		
	//	System.out.println(campo1.getText().trim()); 
		
		
	}
	
class oyente implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int correcto=0;
		
		String email=campo1.getText().trim();
		
		for(int i=0; i<email.length();i++){
			
			if(email.charAt(i)=='@'){
				
				correcto++;
			}
		}
		
		if(correcto!=1){
			
			resultado.setText("Incorrecto");
			
		}else{
				resultado.setText("Correcto");
			 
			}
		}
		
	//	System.out.println(campo1.getText());
		
		
		
	}
	
	
}
private JTextField campo1 ; 

private JLabel resultado;

	}
