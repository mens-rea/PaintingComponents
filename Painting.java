import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.PINK);
		g.fillOval(100, 250,100, 50);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100,100, 50);
		g.setColor(Color.GREEN);
		g.fillOval(30, 50,200, 200);
		g.setColor(Color.BLUE);
		g.fillRect(380, 250, 280, 200);
		g.setColor(Color.CYAN);
		g.fillRoundRect(390, 70, 180, 150, 70, 70);
		g.setColor(Color.PINK);
		g.fillArc(200, 150, 200, 380, 50, 80);
		g.setColor(Color.ORANGE);
		g.fillRoundRect(50, 330, 180, 100, 70, 70);
		
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.BLACK);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}