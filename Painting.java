import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(500, 50, 100, 100);
		
		g.setColor(Color.ORANGE);
		g.fillRect(100,300,150,100);

		g.setColor(Color.GREEN);
		g.fillRect(125,250,100,50);

		g.setColor(Color.BLACK);
		g.fillRect(225,260,50,25);

		g.setColor(Color.BLACK);
		g.fillRect(150,240,50,10);

		g.setColor(Color.GREEN);
		g.fillRect(0,400,700,350);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		
		Painting myPainting = new Painting();
		
		myFrame.add(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
		myFrame.setResizable(false);
		myFrame.setLocationRelativeTo(null);

	}
}