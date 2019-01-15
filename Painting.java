import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillRect(0, 0, 700, 400);
		g.setColor(Color.YELLOW);
		g.fillOval(5, 5, 120, 120);
		g.setColor(Color.PINK);
		g.fillRect(50,250,250,150);
		g.setColor(Color.RED);
		g.drawLine(50, 250, 175, 50);
		g.drawLine(300, 250, 175, 50);
		g.setColor(Color.BLACK);
		g.fillRect(400,300,10,100);
		g.setColor(Color.GREEN);
		g.fillOval(365, 230, 80, 80);
		g.setColor(Color.GREEN);
		g.fillRect(0, 400, 700, 350);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}