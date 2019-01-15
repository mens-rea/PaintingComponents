import java.awt.*;
import javax.swing.*;

 class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.fillOval(250, 250, 200, 30);
		g.fillOval(500, 300, 200, 60);
		g.fillOval(250, 400, 200, 50);
		g.fillOval(370, 600, 200, 40);
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
