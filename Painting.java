import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 1000, 1000);

		g.setColor(Color.BLACK);
		g.fillRect(600, 100, 200, 300);
		g.setColor(Color.BLUE);
		g.drawRect(675, 150, 50, 250);
		g.setColor(Color.RED);
		g.fillOval(675, 25, 50, 50);
		g.setColor(Color.YELLOW);
		g.drawRect(600, 10, 200, 90);

		g.setColor(Color.BLACK);
		g.fillOval(20, 170, 100, 100);
		g.setColor(Color.WHITE);
		g.fillOval(30, 180, 80, 80);
		g.setColor(Color.BLACK);
		g.drawOval(200, 75, 50, 50);
	
		g.setColor(Color.BLACK);
		g.fillOval(270, 170, 100, 100);
		g.setColor(Color.WHITE);
		g.fillOval(280, 180, 80, 80);
		g.setColor(Color.BLACK);
		g.drawOval(290, 190, 60, 60);

		g.setColor(Color.RED);
		g.fillRect(10, 113, 122, 12);
		g.setColor(Color.RED);
		g.fillRect(10, 123, 122, 82);
		
		g.setColor(Color.BLACK);
		g.fillOval(10, 105, 10, 10);
		
		g.setColor(Color.BLUE);
		g.fillRect(130, 15, 130, 100);

		g.setColor(Color.RED);
		g.fillRect(130, 113, 130, 92);

		g.setColor(Color.BLACK);
		g.fillRect(258, 15, 122, 190);

		g.setColor(Color.BLACK);
		g.fillRect(118, 205, 154, 10);

	}
	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1000, 1000);
		myFrame.setVisible(true);
	}
}