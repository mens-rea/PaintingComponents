import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillOval(250, 250, 75, 75);
		g.setColor(Color.BLUE);
		g.fillRect(300, 200, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 25, 25);
		g.setColor(Color.GREEN);
		g.fillRoundRect(400, 200, 200, 200, 100, 100);
		g.setColor(Color.PINK);
		g.fillRect(300, 50, 46, 130);
		g.setColor(Color.PINK);
		g.fillRoundRect(200, 250, 110, 50, 56, 45);
		g.setColor(Color.BLACK);
		g.fillArc(150, 350, 95, 45, 150, 200);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		//JPanel Panel1 = new JPanel();

		Painting myPainting = new Painting();
		//Panel1.setBackground(Color.RED);

		myPainting.setBackground(Color.YELLOW);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}