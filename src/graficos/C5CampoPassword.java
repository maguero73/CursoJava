package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class C5CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPassword mpass =new MarcoPassword();
		
		mpass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mpass.setVisible(true);
		
		
	}

}


class MarcoPassword extends JFrame{
	
	public MarcoPassword(){
		
				//vamos a utilizar la clase Toolkit metodo GetDefaultToolkit
				//es estatico y devuelve un objeto de tipo toolkit
				//es para centrar el marco segun la pantalla
				Toolkit miPantalla=Toolkit.getDefaultToolkit();
				Dimension tPantalla=miPantalla.getScreenSize();
				int alturaPantalla=tPantalla.height;
				int anchoPantalla=tPantalla.width;
				setSize(anchoPantalla/2,alturaPantalla/2);
				setLocation(anchoPantalla/4,alturaPantalla/4);
				
		setTitle("Campo Password");
		
		//setBounds(600,350,600,300);
		
		LaminaPass lami=new LaminaPass();
		
		add(lami);
	}
}


class LaminaPass extends JPanel{
	
	public LaminaPass(){
		
		setLayout(new BorderLayout());
		
		JPanel lamina_sup =new JPanel();
		
		lamina_sup.setLayout(new GridLayout(2,2));
		
		add(lamina_sup, BorderLayout.NORTH);
		
		JLabel etiqueta1 =new JLabel("Usuario");
		
		JLabel etiqueta2 =new JLabel("Password");
		
		JTextField c_usuario =new JTextField(15);
		
		c_contra = new JPasswordField(15);
		
		Comprueba_pass mievento =new Comprueba_pass();
		
		c_contra.getDocument().addDocumentListener(mievento);
		
		lamina_sup.add(etiqueta1);

		lamina_sup.add(c_usuario);
		
		lamina_sup.add(etiqueta2);
		
		lamina_sup.add(c_contra);
		
		JButton enviar =new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
		
	}
	
	private class Comprueba_pass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		char [] contraseña;
		
		contraseña=c_contra.getPassword();
		//HASTA AHORA LO QUE HEMOS PODIDO HACER ES ALMACENAR ESE CAMPO DE CONTRASEÑA
		
		if (contraseña.length < 8 || contraseña.length>12){
			
			c_contra.setBackground(Color.RED);
			
		}else{
			c_contra.setBackground(Color.WHITE);
			
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contraseña;
			
			contraseña=c_contra.getPassword();
			//HASTA AHORA LO QUE HEMOS PODIDO HACER ES ALMACENAR ESE CAMPO DE CONTRASEÑA
			
			if (contraseña.length < 8 || contraseña.length>12){
				
				c_contra.setBackground(Color.RED);
				
			}else{
				c_contra.setBackground(Color.WHITE);
				
				}
			
		}
		
		
	}
	
	private JPasswordField c_contra;
}

