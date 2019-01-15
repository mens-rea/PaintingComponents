import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillRect(40, 30, 50, 50);
		g.fillRect(40, 30, 50, 50);
		g.fillRoundRect(250, 30, 80, 70, 35, 35);
		g.fillOval(0, 250, 50, 100);
		g.fillOval(0, 250, 50, 100);
		g.fillArc(120, 130, 110, 100, 5, 150);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();



		Painting myPainting = new Painting();

		myPainting.setBackground(Color.RED);
		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}