import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.GREEN);
		g.fillRoundRect(400, 200, 200, 200, 100, 100);

		g.setColor(Color.BLUE);
		g.fillRect(50, 250, 50, 100);

		g.setColor(Color.GREEN);
		g.fillOval(90, 50, 50,100);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		//JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		//panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}