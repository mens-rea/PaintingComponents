import java.awt.*;
import javax.swing.*;


public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		g.setColor(Color.BLACK);
		g.fillOval(30, 180, 100, 100);
		g.drawOval(25, 175, 110, 110);

		g.setColor(Color.BLACK);
		g.fillRect(30, 30, 101, 101);
		g.drawRect(25, 25, 111, 111);

		g.setColor(Color.BLACK);
		g.fillRect(30, 320, 101, 101);
		g.drawRect(25, 315, 111, 111);

		
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