import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);



		g.setColor(Color.RED);
		g.fillOval(50, 50, 600, 600);

		g.setColor(Color.WHITE);
		g.fillOval(100, 100, 500, 500);

		g.setColor(Color.RED);
		g.fillOval(150, 150, 400, 400);

		g.setColor(Color.BLUE);
		g.fillOval(200, 200, 300, 300);


	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.GRAY);

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1000, 1000);
		myFrame.setVisible(true);
	}
}