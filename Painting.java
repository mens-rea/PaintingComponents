import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.black);
		g.fillRect(275, 250, 275, 250);
		g.setColor(Color.pink);
		g.fillOval(100, 150, 100, 150);
		g.setColor(Color.blue);
		g.fillRoundRect(250, 120, 170, 160, 125, 125);
		g.setColor(Color.white);
		g.fillArc(120, 130, 110, 150, 15, 150);
		
		
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.yellow);

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
} 