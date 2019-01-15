import java.awt.*;
import javax.swing.*;

public class Painting extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		g.fillRect(550, 200, 70, 350);
		g.fillRect(650, 200, 70, 350);
		g.fillRect(750, 200, 70, 350);
		
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		 //JPanel panel1 = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.BLACK);

		 //panel1.setBackground(Color.BLACK);

		myFrame.add(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}