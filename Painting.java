import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);


		g.setColor(Color.BLACK);
		g.fillOval(400,100, 200, 200);



		g.setColor(Color.BLACK);
		g.fillOval(200,100,200,200);

		g.setColor(Color.WHITE);
		g.fillOval(450,150, 100, 100);

		g.setColor(Color.WHITE);
		g.fillOval(250,150,100,100);


		g.setColor(Color.BLACK);
		g.fillRect(350,300,100,100);



	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");

		Painting myPainting = new Painting();

	

		myFrame.add(myPainting);

		myPainting.setBackground(Color.RED);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}