import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillOval(0, 250, 50, 100);

		g.setColor(Color.RED);
		g.fillRect(50, 250, 50, 100);

		g.setColor(Color.WHITE);
		g.fillRoundRect(100, 250, 250, 100, 100, 100);
		

	int xpoints[] = {25, 145, 25, 145, 25};
    int ypoints[] = {25, 25, 145, 145, 25};
    int npoints = 5;
    	g.setColor(Color.GREEN);
    	g.fillPolygon(xpoints, ypoints, npoints);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		// JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.BLUE);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}