import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
   		int xpoints[] = {25, 145, 25, 145, 25};
    	int ypoints[] = {25, 25, 145, 145, 25};
    	int npoints = 5;
   		g.fillPolygon(xpoints, ypoints, npoints);
		g.setColor(Color.BLUE);
		g.fillOval(50, 250, 50, 100);
		g.setColor(Color.BLACK);
		g.fill3DRect(150, 150, 50, 100, true);
		g.setColor(Color.GREEN);
		g.fillArc(150, 250, 100, 120, 190, 100);
		g.setColor(Color.YELLOW);
		g.fillArc(250, 200, 120, 100, 50, 150);
		g.setColor(Color.GREEN);
		g.fillArc(250, 100, 70, 50, 100, 250);
		g.setColor(Color.RED);
		g.fillArc(50, 130, 90, 100, 150, 150);
		g.setColor(Color.RED);
		g.fillOval(250, 270, 80, 100);
		

	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();


		
		myPainting.setBackground(Color.PINK);

		myFrame.add(myPainting);
		//myFrame.add(panel1);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 500);
		myFrame.setVisible(true);
	}
}