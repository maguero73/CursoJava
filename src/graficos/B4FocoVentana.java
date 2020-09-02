package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class B4FocoVentana extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B4FocoVentana miv = new B4FocoVentana();
		
		miv.iniciar();
		
	}
	
	public void iniciar(){
		
		marco1=new B4FocoVentana();
		
		marco2=new B4FocoVentana();
		
		marco1.setVisible(true);
		
		marco2.setVisible(true);
		
		marco1.setBounds(300, 100, 600, 350);
		
		marco2.setBounds(1200, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		
		marco2.addWindowFocusListener(this);
		
		
		
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==marco1){
			
			marco1.setTitle("tengo el foco");
		}else{
			marco2.setTitle("tengo el foco");
			
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
if(e.getSource()==marco1){
			
			marco1.setTitle("");
		}else{
			marco2.setTitle("");
			
		}
	}
B4FocoVentana marco1;
B4FocoVentana marco2;

}
