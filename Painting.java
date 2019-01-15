import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);


		g.setColor(Color.ORANGE);
		g.fillOval(315, 60, 1000, 1000);

		g.setColor(Color.BLACK);
		g.fillOval(470, 200, 700, 700);

		g.setColor(Color.YELLOW);
		g.fillOval(700, 250, 250, 250);
		
		g.setColor(Color.WHITE);
		g.fillOval(750, 300, 150, 150);
		
		g.setColor(Color.YELLOW);
		g.fillRect(750, 500, 150, 300);


	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.PINK);

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1700, 1500);
		myFrame.setVisible(true);
	}
}