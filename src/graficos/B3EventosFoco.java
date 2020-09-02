package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B3EventosFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco miMarco=new MarcoFoco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class MarcoFoco extends JFrame{
	
	public MarcoFoco(){
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Eventos Foco");
		
		setVisible(true);
		
		add(new LaminaFoco());
		
	}
}

//VIDEO 74 - EVENTOS DE FOCO I

class LaminaFoco extends JPanel{

	protected void paintComponent(Graphics g){  //SETTER DE API
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120,10,150,20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos Foco =new LanzaFocos();
		
		cuadro1.addFocusListener(Foco);
		
	}
	

	
	private class LanzaFocos implements FocusListener{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("has perdido el foco");
				
				String email=cuadro1.getText();
				
				boolean validacion=false;
				
				for (int i=0; i<email.length();i++){
					
					if(email.charAt(i)=='@'){
						
						validacion = true;
						
						}
					}
				
				if(validacion){
					
					System.out.println("Correcto");
				}else{
					System.out.println("Incorrecto");
				}
				
				cuadro1=(JTextField)e.getSource();
			}
		
			
		}	
		
		JTextField cuadro1;
		JTextField cuadro2;	
	}


