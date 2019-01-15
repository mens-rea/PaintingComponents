import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillRect(50, 50, 80, 100);
		g.fillRoundRect(200, 50, 80, 70, 35, 35);
		g.fillOval(50, 200, 50, 100);
		g.fillArc(200, 200, 110, 100, 5, 150);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();



		Painting myPainting = new Painting();

		myPainting.setBackground(Color.BLACK);
		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}