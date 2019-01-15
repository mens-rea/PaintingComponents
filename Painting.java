import javax.swing.*;
import java.awt.*;


public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.PINK);
		int xpoints[] = {25, 145, 25, 145, 25};
    	int ypoints[] = {25, 25, 145, 145, 25};
    	int npoints = 5;

    	g.fillPolygon(xpoints, ypoints, npoints);
		g.setColor(Color.RED); 
		g.fillOval(250, 0, 60, 100);
		g.setColor(Color.YELLOW);  
        g.fillOval(100, 150, 100, 200);
        g.setColor(Color.GREEN);  
        g.fillArc(500, 300, 100, 100, 70, 250);
        g.setColor(Color.CYAN);  
        g.fillArc(250, 250, 70, 100, 150, 280);
        g.setColor(Color.BLUE);  
        g.fillArc(500, 80, 100, 200, 100, 80);
        g.setColor(Color.ORANGE);  
        g.fillArc(300, 350, 100, 100, 100, 150);
        g.setColor(Color.BLACK);
        g.fillRect(600,90,50,200);  
        g.setColor(Color.WHITE);
        g.fillRect(350,90,50,100); 

	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");

		//Jframe panel1 = new Jpanel();
		Painting myPainting = new Painting();

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700,500);
		myFrame.setVisible(true);

	}
}