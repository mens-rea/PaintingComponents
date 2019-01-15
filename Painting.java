import java.awt.*;
import javax.swing.*;


public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLACK);  
		g.fillRect(100, 100, 100, 100);

		g.setColor(Color.PINK);
		g.drawOval(100, 100, 100, 100);
		g.fillOval(105, 105, 90, 90);

		g.setColor(Color.BLACK);  
		g.fillRect(200, 200, 100, 100);

		g.setColor(Color.PINK);
		g.drawOval(200, 200, 100, 100);
		g.fillOval(205, 205, 90, 90);

		g.setColor(Color.BLACK);  
		g.fillRect(300, 300, 100, 100);

		g.setColor(Color.PINK);
		g.drawOval(300, 300, 100, 100);
		g.fillOval(305, 305, 90, 90);

		g.setColor(Color.BLACK);  
		g.fillRect(400, 400, 100, 100);

		g.setColor(Color.PINK);
		g.drawOval(400, 400, 100, 100);
		g.fillOval(405, 405, 90, 90);



	}

	public static void main(String[] args) {


		JFrame myFrame = new JFrame("Painting");
		
		//JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		//panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}