import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.GREEN);
		g.fillOval(700, 250, 250, 200);
		g.setColor(Color.BLUE);
		g.fillRect(100, 150, 150, 100);
		g.setColor(Color.BLACK);
		g.fillOval(200, 250, 250, 100);


	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		//JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		//panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(600, 550);
		myFrame.setVisible(true);
	}
}