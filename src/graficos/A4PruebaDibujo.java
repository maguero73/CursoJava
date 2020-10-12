package graficos;

import javax.swing.*;



import java.awt.geom.*;

import java.awt.*;

public class A4PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}


class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		setTitle("prueba de dibujo");
		
		setSize(400,400);
		
		LaminaConFiguras miLamina=new LaminaConFiguras();
		
		add(miLamina);
		
		// LE APLICA UN COLOR DE FONDO A LA LAMINA
		//miLamina.setBackground(Color.pink);
		//miLamina.setBackground(SystemColor.window);
		
		miLamina.setForeground(Color.BLUE);
		
	}
}


class LaminaConFiguras extends JPanel{
	
	protected void paintComponent(Graphics g){  //SETTER DE API
		
		super.paintComponent(g);
		
		//casting de graphics 2D
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente =new Font("Courier", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.drawString("Juan", 100,100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		
		g2.setColor(new Color(128,90,50));
		
		g2.drawString("Curso de Java", 100,200);
		
		
		
		//Rectangle2D Rectangulo =new Rectangle2D.Double(100,100,200,150);
		
		//g2.setPaint(Color.RED);
		
		//g2.draw(Rectangulo);
		
		//Ellipse2D elipse =new Ellipse2D.Double();
		
		//elipse.setFrame(Rectangulo);
		
		//g2.fill(Rectangulo);
		
		//Color miColor =new Color (125,189,200);
		
		//g2.setPaint(miColor);
		
		//g2.setPaint(new Color (109, 172, 59).darker());
		
		//g2.draw(elipse);
		
		//g2.fill(elipse);
		
		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawArc(50, 100, 100, 120, 120, 150);
	}

	//public void setBackground(int window) {
		// TODO Auto-generated method stub
		
	//}
}